package u_jdbc.ii_codes;

// Java program to illustrate deleting all data from Database Table
import java.sql.*;

// public class App {   // use this in real scenario
public class g_jdbc_data_deletion_all {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establishing connetion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");

            Statement stmt = con.createStatement();

            // deleting all data record from database table
            String query = "delete from users";
            int a = stmt.executeUpdate(query);
            if (a > 0) {
                System.out.println("All user data deleted successfully.");
            } else {
                System.out.println("Something went wrong....");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
