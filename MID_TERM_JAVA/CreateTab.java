import java.sql.*;

public class CreateTab {
    
    public static void main(String[] args) {
        try {
            
            System.out.println("Table Creation Example");
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "zyandeep";
            String password = "qweasd";
            
            Connection con = DriverManager.getConnection(url, user, password);
            
            // OR
            // Connection con = 
            // DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jecmca","jecmca");
            
            Statement st = con.createStatement();
            
            String table = "CREATE TABLE login(roll VARCHAR2(30), name VARCHAR2(30))";
            
            st.executeUpdate(table);
            
            System.out.println("Table created");
            
            con.close();  
        }
        catch(Exception e) {}
    } 
}
