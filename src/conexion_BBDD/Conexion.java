package conexion_BBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection cn; //DESKTOP-6NVPO5H
    private final String url="jdbc:sqlserver://localhost:1433;databaseName=DB_GESTION_TAXIS";
    private final String user="sa";
    private final String pass="bloodyroarfx";

    public void conectar() throws SQLException{
        try{
            cn=DriverManager.getConnection(url,user,pass);
        }catch (SQLException e) {
            throw e;
        }
    }
    public void cerrar() throws SQLException{
        if(cn!=null){
            if(!cn.isClosed()){
                cn.close();
            }
        }
    }
    public Connection getCn() {
        return cn;
    }
}
