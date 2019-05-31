package Login;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/useraccount", "root", "admin1234");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM user_account");
        ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println("Total columns: " + rsmd.getColumnCount());
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.println(
                    "Column " + i + " [user: " + rsmd.getColumnName(i) +  "]");
        }
        System.out.println("--------------------");
        con.close();
    }
}