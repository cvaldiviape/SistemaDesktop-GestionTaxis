package controlador;
import modelo.Persona;
import conexion_BBDD.Conexion;
import interfaces.DAOPersona;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class DAOPersonaImpl extends Conexion implements DAOPersona{

    @Override
    public void setRegistrarPersona(Persona pe, String opcion) throws Exception {
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_REGISTRAR_CLIENTE (?,?,?,?,?,?,?,?)}");
            if(opcion.equals("0")){
                cl.setString(1, opcion);
                cl.setString(2, pe.getEmail());
                cl.setString(3, pe.getCelular());
                cl.setString(4, pe.getNombre());
                cl.setString(5, pe.getApellido());
                cl.setString(6, pe.getDni());
                cl.setString(7, "");
                cl.setString(8, "");
                
                cl.execute();
                cl.close();
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOPersonaImpl: metodo--> setRegistrarPersona");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public Persona getBuscarPersonaDNI(Persona pe) throws Exception {
        Persona persona = null;
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_BUSCAR_PERSONA(?)}");
            cl.setString(1, pe.getDni());
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                persona=new Persona();
                persona.setId_persona(rs.getInt("ID_CLIENTE"));
                persona.setEmail(rs.getString("EMAIL"));
                persona.setCelular(rs.getString("CELULAR"));
                persona.setCelular(rs.getString("CELULAR"));
                persona.setNombre(rs.getString("NOMBRE"));
                persona.setApellido(rs.getString("APELLIDO"));
                persona.setDni(rs.getString("DNI"));
            }
            rs.close();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOPersona: metodo--> getBuscarPersonaDNI");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        
        return persona;
    }
}
