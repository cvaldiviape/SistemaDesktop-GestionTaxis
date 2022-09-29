package controlador;
import modelo.Usuario;
import conexion_BBDD.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import interfaces.DAOUsuario;

public class DAOUsuariorImpl extends Conexion implements DAOUsuario{
    @Override
    public Usuario getValidarLogin(Usuario admi) throws Exception {
        Usuario a=null;
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_VALIDAR_LOGIN (?,?)}");
            cl.setString(1, admi.getUsername());
            cl.setString(2, admi.getPass());
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                a=new Usuario();
                a.setId(rs.getInt("ID_USUARIO")); 
            }
            rs.close();
            cl.close();
            this.cerrar();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOUsuarioImpl metodo->getValidarLogin()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return a;
    }
}
