
package datos;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;


public class Conexion {
    
    private static final String JDCB_URL = "jdbc:mysql://localhost:3306/control_clientes?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";   
    private static final String JDBC_PASSWORD = "root";  
    
    private static BasicDataSource dataSource;
    
    public static DataSource getDataSource(){
        
        if(dataSource==null){
            dataSource = new BasicDataSource();
            dataSource.setUrl(JDCB_URL);
            dataSource.setUsername(JDBC_USER);
            dataSource.setPassword(JDBC_PASSWORD);
            dataSource.setInitialSize(50);
        }
        return dataSource;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    
    public static void close(ResultSet rs) throws SQLException{
        try{
            rs.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void close(PreparedStatement stmt) throws SQLException {
        try{
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn) throws SQLException{
         try{
            conn.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}

