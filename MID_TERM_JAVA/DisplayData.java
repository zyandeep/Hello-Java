import java.sql.*;

public class DisplayData {
    
    public static void main(String[] args) {
        try {
            System.out.println("Display data from a table");
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "zyandeep";
            String password = "qweasd";
            
            Connection con = DriverManager.getConnection(url, user, password);
            
            // OR
            // Connection con = 
            // DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jecmca","jecmca");
            
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM login";
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()) {
                String roll = rs.getString("roll");
                String name = rs.getString("name");
                
                System.out.println(roll + " " + name);
            }           
            con.close();
        }
        catch(Exception e) {}
    }   
}
