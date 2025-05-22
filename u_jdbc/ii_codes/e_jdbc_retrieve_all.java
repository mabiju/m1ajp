package u_jdbc.ii_codes;

// Java program to illustrate selecting from Database
import java.sql.*;

// public class App {   // use this in real scenario
public class e_jdbc_retrieve_all {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establishing connetion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");

            Statement stmt = con.createStatement();

            // selecting all data to show
            String query = "select * from users";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("User ID: " + rs.getString(1));
                System.out.println("User Password : " + rs.getString(2));
                System.out.println("User Fullname: " + rs.getString(3));
                System.out.println("User Email: " + rs.getString(4));
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
