package controlador;
import modelo.Cliente;
import modelo.Empresa;
import modelo.Persona;
import conexion_BBDD.Conexion;
import interfaces.DAOCliente;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class DAOClienteImpl extends Conexion implements DAOCliente {
    @Override
    
    public Cliente getBuscarCliente(Cliente c, String buscador) throws Exception {
        Cliente cliente=new Cliente();
        Persona persona=new Persona();
        Empresa empresa=new Empresa();
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_BUSCAR_CLIENTE(?,?)}");
            if(buscador.equals("0")){
                cl.setString(1, buscador);
                cl.setInt(2, c.getId());
                try (ResultSet rs = cl.executeQuery()) {
                    while(rs.next()){
                        
                        persona.setId(rs.getInt("ID_CLIENTE"));
                        persona.setEmail(rs.getString("EMAIL"));
                        persona.setCelular(rs.getString("CELULAR"));
                        persona.setNombre(rs.getString("NOMBRE"));
                        persona.setApellido(rs.getString("APELLIDO"));
                        persona.setDni(rs.getString("DNI"));
                    }
                }
                cl.close();
                cliente=persona;
            }
            else if (buscador.equals("1")){
                cl.setString(1, buscador);
                cl.setInt(2, c.getId());
                try (ResultSet rs = cl.executeQuery()) {
                    while(rs.next()){
                        
                        empresa.setId(rs.getInt("ID_CLIENTE"));
                        empresa.setEmail(rs.getString("EMAIL"));
                        empresa.setCelular(rs.getString("CELULAR"));
                        empresa.setRazon_social(rs.getString("RAZON_SOCIAL"));
                        empresa.setRuc(rs.getString("RUC"));
                    }
                }
                cl.close();
                cliente=empresa;
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOClienteImpl: metodo->> getBuscarCliente");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return cliente;
    }
    
}
