package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueryData {
    public static UserAccount userAccount() {
        Connection mySQLConnection = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM user_account";
        try {
            PreparedStatement preparedStatement = mySQLConnection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            Connection connection = MySQLConnUtils.getMySQLConnection();
            List<UserAccount> userAccounts = new ArrayList<>();
            while (resultSet.next()) {
                String userName = resultSet.getString("USER_NAME");
                String userPassword = resultSet.getString("PASSWORD");
                userAccounts.add(new UserAccount(userName, userPassword));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userAccount();
    }
}