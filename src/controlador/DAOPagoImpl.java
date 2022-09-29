package controlador;
import modelo.Conductor;
import modelo.Pago;
import conexion_BBDD.Conexion;
import vista.mensaje_registro_pago_pendiente;
import interfaces.DAOPago;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class DAOPagoImpl extends Conexion implements DAOPago{
    @Override
    public void setTableHistorialPago(JTable mi_tabla, Conductor co) throws Exception {
        List<Pago> lista_pago=new ArrayList<>();
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_CONDUCTOR_HISTORIAL_PAGO(?)}");
            cl.setInt(1, co.getId());
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                Pago pa=new Pago();
                pa.setId(rs.getInt("ID_PAGO"));
                pa.setFecha(rs.getDate("FECHA"));
                pa.setComision_total(rs.getDouble("COMISION_TOTAL"));
                lista_pago.add(pa);
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
            modelo.setColumnIdentifiers(new Object[]{"ID","FECHA","MONTO S/."});
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(2).setResizable(false);
            
            for (Pago p : lista_pago) {
                 modelo.addRow(new Object[]{p.getId(), p.getFecha(), p.getComision_total()});
            }
            System.out.println("listo xd");
        }catch (Exception ex) {
            System.out.println("ERROR: DAOPagoImpl: metodo--> setTableHistorialPago()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }   
    @Override
    public void setTablePagosPendientes(JTable mi_tabla, Conductor co) throws Exception {
        List<Pago> lista_pago=new ArrayList<>();
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_CONDUCTOR_PAGOS_PENDIENTES(?)}");
            cl.setInt(1, co.getId());
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                Pago pa=new Pago();
                pa.setId(rs.getInt("ID_PAGO"));
                pa.setFecha(rs.getDate("FECHA"));
                pa.setComision_total(rs.getDouble("COMISION_TOTAL"));
                lista_pago.add(pa);
            }
            rs.close();
            
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
            modelo.setColumnIdentifiers(new Object[]{"ID","FECHA","MONTO S/."});
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(2).setResizable(false);
            
            for (Pago p : lista_pago) {
                 modelo.addRow(new Object[]{p.getId(), p.getFecha(), p.getComision_total()});
            }
            System.out.println("listo xd2");
        }catch (Exception ex) {
            System.out.println("ERROR: DAOPagoImpl: metodo--> setTablePagosPendientes()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public void setRegistrarPago(Conductor co) throws Exception {
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_REGISTRAR_PAGO(?)}");
            cl.setInt(1, co.getId());
            cl.execute();
            
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOPagoImpl: metodo--> setRegistrarPago()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public void setPagoPendiente(Conductor co) throws Exception {
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_PAGO_PENDIENTE(?)}");
            cl.setInt(1, co.getId());
            cl.execute();
            
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOPagoImpl: metodo--> setPagoPendiente()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public void setRegistrarPagoPendiente(Pago pa) throws Exception{
        try{
            this.conectar();
            
            CallableStatement cl=this.cn.prepareCall("{call SP_REGISTRAR_PENDIENTE(?)}");
            cl.setInt(1, pa.getId());
            cl.executeUpdate();
            
            mensaje_registro_pago_pendiente b=new mensaje_registro_pago_pendiente();
            b.setVisible(true);
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOPagoImpl: metodo--> setRegistrarPagoPendiente()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
           this.cerrar();
        }
    }
}
