import java.io.*;
import java.sql.*;

public class InsertData {
    
    public static void main(String[] args) {
        try {
            System.out.println("Insert data into table");
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "zyandeep";
            String password = "qweasd";
            
            Connection con = DriverManager.getConnection(url, user, password);
            
            // OR
            // Connection con = 
            // DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jecmca","jecmca");
            
            
            DataInputStream br = new DataInputStream(System.in);
            String roll, name;
            
            System.out.println("Enter Roll No: ");
            roll = br.readLine();
            System.out.println("Enter Name: ");
            name = br.readLine();
            
            String query = "INSERT INTO login VALUES(?, ?)";
            
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, roll);
            pst.setString(2, name);
            
            pst.executeUpdate();
            
            System.out.println("Data inserted");
            
            con.close();
        }
        catch(Exception e) {}
    }
}
