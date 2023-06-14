import java.sql.*;
import java.util.Scanner;
public class Db {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root","root");
        System.out.println("success");
        Scanner input = new Scanner(System.in);
        String all="Select*From customer";
        Statement stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs =stmt.executeQuery(all);
//        while(rs.next()){
//            int ac = rs.getInt("account_number");
//            System.out.println(ac);
//        }
        rs.absolute(3);
        System.out.println(
                rs.getInt("account_number")
        );
    }
}
