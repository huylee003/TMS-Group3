
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnect {
    
     public static Connection connect()
    {
        Connection sos = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sos = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/qldb","root","");
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return sos;
    }

    public static Connection Connect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
