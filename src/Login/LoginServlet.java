package Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Login.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Connection mySQLConnection = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM user_account";
        try {
            PreparedStatement preparedStatement = mySQLConnection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<UserAccount> userAccounts = new ArrayList<>();
            while (resultSet.next()) {
                String userName = resultSet.getString("USER_NAME");
                String userPassword = resultSet.getString("PASSWORD");
                userAccounts.add(new UserAccount(userName, userPassword));
                req.setAttribute("list", userAccounts);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if ("admin".equals(username) && ("admin".equals(password))) {
            req.setAttribute("username", username);
            req.setAttribute("password", password);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("user.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            resp.sendRedirect("index.jsp");
        }
    }
}
