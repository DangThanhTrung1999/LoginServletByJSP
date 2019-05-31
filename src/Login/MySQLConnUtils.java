package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
    public static Connection getMySQLConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL = "jdbc:mysql://localhost:3306/userAccount";
            conn = DriverManager.getConnection(connectionURL,"root",
                    "admin1234");
            return conn;
        } catch (Exception ex) {
            ex.getMessage();
        }
        return conn;
    }
}
