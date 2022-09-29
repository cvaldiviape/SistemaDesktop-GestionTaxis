package controlador;
import modelo.Cliente;
import modelo.Conductor;
import modelo.Viaje;
import conexion_BBDD.Conexion;
import vista.mensaje_cliente_no_existe;
import vista.mensaje_inicio_viaje;
import interfaces.DAOViaje;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class DAOViajeImpl extends Conexion implements DAOViaje{
    @Override
    public void setRegistrarViaje(Viaje viaje) throws Exception {
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_RE_VIAJE(?,?,?,?,?,?,?,?)}");
            cl.setString(1, viaje.getOrigen());
            cl.setString(2, viaje.getD_origen());
            cl.setString(3, viaje.getDestino());
            cl.setString(4, viaje.getD_destino());
            cl.setDouble(5, viaje.getMonto());
            cl.setInt(6, viaje.getCliente().getId());
            cl.setInt(7, viaje.getConductor().getId());
            cl.setInt(8, viaje.getUsuario().getId());
            cl.execute();
            
            cl.close();
            
            mensaje_inicio_viaje a=new mensaje_inicio_viaje();
            a.setVisible(true);
        }catch (Exception ex) {
            System.out.println("ERROR: DAOViajeImpl: metodo--> setRegistrarViaje()");
            mensaje_cliente_no_existe a=new mensaje_cliente_no_existe();
            a.setVisible(true);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public List<Viaje> getListaViajesIniciados() throws Exception {
        List<Viaje> lista_viajes=null;
        try{
            lista_viajes=new ArrayList<>();
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_LISTA_VIAJES_INICIADOS}");
            ResultSet rs=cl.executeQuery();
            
            while(rs.next()){
                Viaje viaje=new Viaje();
                viaje.setId(rs.getInt("ID_VIAJE"));
                viaje.setOrigen(rs.getString("ORIGEN"));
                viaje.setDestino(rs.getString("DESTINO"));
                viaje.setFecha(rs.getString("FECHA/HORA"));
                
                lista_viajes.add(viaje);
            }
            rs.close();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOViajeImpl: metodo--> getListaViajesIniciados()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return lista_viajes;
    }
    @Override
    public void setViajeIniciadosToTable(JTable mi_tabla) throws Exception {
        DefaultTableModel modeloBuscar=new DefaultTableModel();
        mi_tabla.setModel(modeloBuscar);
        try{
            DAOViaje dao=new DAOViajeImpl();
            List<Viaje> lista_viajes=dao.getListaViajesIniciados();
            modeloBuscar.setColumnIdentifiers(new Object[]{"ID","ORIGEN","DESTINO","FECHA/HORA"});
            
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(440);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(440);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(150);
            columnModel.getColumn(3).setResizable(false);
            
            for (Viaje v : lista_viajes) {
                modeloBuscar.addRow(new Object[]{v.getId(), v.getOrigen(), v.getDestino(), v.getFecha()});
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOViajeImpl: metodo--> setViajeIniciadosToTable");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    @Override
    public List<Viaje> getBuscarViajeIniciado(Viaje viaje) throws Exception {
        List<Viaje> lista_viaje=null;
        try{
            lista_viaje=new ArrayList<>();
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_BUSCAR_VIAJE_INICIADO(?)}");
            cl.setInt(1, viaje.getId());
            ResultSet rs=cl.executeQuery();
            
            while(rs.next()){
                Viaje v=new Viaje();
                v.setId(rs.getInt("ID_VIAJE"));
                v.setOrigen(rs.getString("ORIGEN"));
                v.setDestino(rs.getString("DESTINO"));
                v.setFecha(rs.getString("FECHA/HORA"));
                
                lista_viaje.add(v);
            }
            rs.close();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOViajeImpl: metodo--> getBuscarViajeIniciado()");
        }finally{
            this.cerrar();
        }
        return lista_viaje;
    }
    @Override
    public void setBuscarViajeIniciadoToTable(Viaje viaje, JTable mi_tabla) throws Exception {
        DefaultTableModel modeloBuscar=new DefaultTableModel();
        mi_tabla.setModel(modeloBuscar);
        try{
            DAOViaje dao=new DAOViajeImpl();
            List<Viaje> lista_viajes=dao.getBuscarViajeIniciado(viaje);
            modeloBuscar.setColumnIdentifiers(new Object[]{"ID","ORIGEN","DESTINO","FECHA/HORA"});
            
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(440);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(440);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(150);
            columnModel.getColumn(3).setResizable(false);
            
            for (Viaje v : lista_viajes) {
                modeloBuscar.addRow(new Object[]{v.getId(), v.getOrigen(), v.getDestino(), v.getFecha()});
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOViajeImpl: metodo--> setBuscarViajeIniciadoToTable()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    @Override
    public void setMarcarViajeIniciado(Viaje viaje, String opcion) throws Exception {
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_MARCAR_VIAJE(?,?)}");
            cl.setInt(1, viaje.getId());
            cl.setString(2, opcion);
            cl.execute();
            
            /*mensaje_marcacion_viaje b=new mensaje_marcacion_viaje();
            b.setVisible(true);*/
            
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOViajeImpl: metodo--> setMarcarViajeIniciado()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public void setTableViajesRealizadosConductor(JTable mi_tabla, Conductor co) throws Exception {
        List<Viaje> lista_viaje=new ArrayList();
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_VIAJES_DE_CONDUCTOR(?)}");
            cl.setInt(1, co.getId());
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                Viaje vi=new Viaje();
                vi.setId(rs.getInt("ID_VIAJE"));
                vi.setOrigen(rs.getString("ORIGEN"));
                vi.setDestino(rs.getString("DESTINO"));
                vi.setFecha(rs.getString("FECHA/HORA"));
                vi.setMonto(rs.getDouble("MONTO"));
                lista_viaje.add(vi);
            }
            rs.close();
            cl.close();
            
            DefaultTableModel modelo = new DefaultTableModel() {
                //Metodo que me permitira indicar tal cantidad de columnas no puedan ser editables
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 5) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            mi_tabla.setModel(modelo);
            modelo.setColumnIdentifiers(new Object[]{"ID","ORIGEN","DESTINO","FECHA/HORA","MONTO S/."});
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(350);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(350);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(150);
            columnModel.getColumn(3).setResizable(false);
            columnModel.getColumn(4).setPreferredWidth(150);
            columnModel.getColumn(4).setResizable(false);
            
            for (Viaje v : lista_viaje) {
                modelo.addRow(new Object[]{v.getId(), v.getOrigen(), v.getDestino(), v.getFecha(), v.getMonto()});
            }           
            System.out.println("ok");
        }catch (Exception ex) {
            System.out.println("ERROR: DAOViajeImpl: metodo--> setTableViajesRealizadosConductor()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public Viaje getDatosEmail(Viaje viaje) throws Exception {
        Viaje v=new Viaje();
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_DAME_DATOS_EMAIL(?)}");
            cl.setInt(1, viaje.getId());
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                Cliente c=new Cliente();
                c.setEmail(rs.getString("EMAIL"));
                v.setCliente(c);
                v.setOrigen(rs.getString("ORIGEN"));
                v.setD_origen(rs.getString("D_ORIGEN"));
                v.setDestino(rs.getString("DESTINO"));
                v.setD_destino(rs.getString("D_DESTINO"));
                v.setMonto(rs.getDouble("MONTO"));
                v.setFecha(rs.getString("FECHA/HORA"));
            }
            rs.close();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOViajeImpl: metodo--> getDatosEmail()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return v;
    }
    
}
