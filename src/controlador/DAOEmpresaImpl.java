package controlador;
import modelo.Empresa;
import conexion_BBDD.Conexion;
import interfaces.DAOEmpresa;
import java.sql.CallableStatement;
import java.sql.ResultSet;
public class DAOEmpresaImpl extends Conexion implements DAOEmpresa{
    @Override
    public void setRegistrarEmpresa(Empresa em, String opcion) throws Exception {
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_REGISTRAR_CLIENTE (?,?,?,?,?,?,?,?)}");
            if(opcion.equals("1")){
               cl.setString(1, opcion);
               cl.setString(2, em.getEmail());
               cl.setString(3, em.getCelular());
               cl.setString(4, "");
               cl.setString(5, "");
               cl.setString(6, "");
               cl.setString(7, em.getRazon_social());
               cl.setString(8, em.getRuc());
                
               cl.execute();
               cl.close();
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOPEmpresaImpl: metodo--> setRegistrarEmpresa");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public Empresa getBuscarEmpresaRuc(Empresa em) throws Exception {
        Empresa empresa=null;
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_BUSCAR_EMPRESA(?)}");
            cl.setString(1, em.getRuc());
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                empresa=new Empresa();
                empresa.setId_empresa(rs.getInt("ID_CLIENTE"));
                empresa.setEmail(rs.getString("EMAIL"));
                empresa.setCelular(rs.getString("CELULAR"));
                empresa.setRazon_social(rs.getString("RAZON_SOCIAL"));
                empresa.setRuc(rs.getString("RUC"));
            }
            rs.close();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOEmpresa: metodo--> getBuscarEmpresaRuc");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return empresa;
    }
    
}
