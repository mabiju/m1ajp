package u_jdbc.ii_codes;

// Java program to illustrate Connecting to the Database
import java.sql.*;

// public class App {   // use this in real scenario
    public class a_jdbc_dbconnection {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");
            if (con != null) {
                System.out.println("Database connected successfully.");
            } else {
                System.out.println("Something went wrong.");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error = " + e);
        }
    }
}

