//import java.sql.*;

import java.sql.*;
import java.sql.PreparedStatement;

public class PreparedStatementsClass {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root","root");
            String sqlData ="Insert into customer values(?,?,?,?,?)";
            PreparedStatement pst=  con.prepareStatement(sqlData);
            ResultSetMetaData metaData=pst.getMetaData();

            pst.setInt(1,1567);
            pst.setString(2,"Zex");
            pst.setString(3,"Zexlangi");
            pst.setString(4,"smartsam@gdexpert.com");
            //pst.setFloat(5,2333);
            pst.setDouble(5,4567.9);
            //pst.executeUpdate();
            //System.out.println(metaData.getColumnCount()+""+metaData.getColumnType(1));
            //Callable Satement
            CallableStatement cst = con.prepareCall("{call getAllCars()}");
            ResultSet rst=cst.executeQuery();
            while(rst.next()){
                System.out.println(rst.getString("make")+"Model"+ rst.getString("model"));

            }


            con.close();




        }catch(Exception e){
          //  e.getMessage();
            System.out.println(e.getMessage());
        }
    }
}
