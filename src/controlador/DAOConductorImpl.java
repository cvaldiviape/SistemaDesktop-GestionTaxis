package controlador;
import modelo.Aseguradora;
import modelo.Conductor;
import modelo.Pago;
import modelo.Vehiculo;
import modelo.Viaje;
import conexion_BBDD.Conexion;
import interfaces.DAOConductor;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class DAOConductorImpl extends Conexion implements DAOConductor{
    @Override
    public void setRegistrarConductor(Conductor co) throws Exception {
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_REGISTRAR_TAXI(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cl.setString(1, co.getVehiculo().getAseguradora().getNombre());
            cl.setString(2, co.getVehiculo().getAseguradora().getTipo_seguro());
            cl.setDate(3, co.getVehiculo().getAseguradora().getFecha_venc());
            cl.setString(4, co.getNombre());
            cl.setString(5, co.getApellido());
            cl.setString(6, co.getDni());
            cl.setDate(7, co.getFecha_nac());
            cl.setString(8, co.getCelular());
            cl.setBytes(9, co.getFoto());
            cl.setString(10, co.getCta_bancaria());
            cl.setString(11, co.getLic_Categoria());
            cl.setDate(12, co.getLic_venc());
            cl.setString(13, co.getVehiculo().getMarca());
            cl.setString(14, co.getVehiculo().getModelo());
            cl.setString(15, co.getVehiculo().getPlaca());
            cl.setBytes(16, co.getVehiculo().getFoto());
            
            cl.execute();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl metodo->registrarConductor()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public List<Conductor> getListaConductores() throws Exception {
        List<Conductor> listaConductores=null;
        try{
            listaConductores=new ArrayList();
            this.conectar();
            Statement st=this.cn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM UV_LISTA_CONDUCTORES");
            while(rs.next()){
                Conductor conductor=new Conductor();
                conductor.setId(rs.getInt("ID"));
                conductor.setNombre(rs.getString("NOMBRE"));
                conductor.setApellido(rs.getString("APELLIDO"));
                conductor.setDni(rs.getString("DNI"));
                listaConductores.add(conductor);
            }
            rs.close();
            st.close();
        }catch (Exception ex){
            System.out.println("ERROR: DAOConductorImpl metodo-> getListaConductores()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return listaConductores;
    }
    @Override
    public void getTableConductores(JTable tabla) throws Exception {
        //Creo modelo para la "tabla"
        DefaultTableModel modelo=new DefaultTableModel(){
            //Metodo que me permitira indicar tal cantidad de columnas no puedan ser editables
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==3){
                    return true;
                }else{
                    return false;
                }
            }
        };        
        tabla.setModel(modelo);
        
        try{//Llamo a la lista de conductores
            List<Conductor> listaConductores=this.getListaConductores();
            //DEFINO EL NOMBRE DE LAS COLUMNAS.
            modelo.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDOS","DNI"});
            //DEFINO ANCHURA DE LAS COLUMNAS.
            TableColumnModel columnModel = tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular         
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(200);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(100);
            columnModel.getColumn(3).setResizable(false);
            //INSERTO LA LISTA DE CONDUCTORES EN LA TABLA.
            for (Conductor co : listaConductores) {
                modelo.addRow(new Object[]{co.getId(), co.getNombre(), co.getApellido(), co.getDni()});
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo-> getListaConductores()");
        }
    }   
    @Override
    public Conductor getDetalleConductor(Conductor co) throws Exception {
        Conductor conductor=null;
        try{
            conductor=new Conductor();
            Vehiculo vehiculo=new Vehiculo();
            Aseguradora aseguradora=new Aseguradora();
            
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_BUSCAR_DATOS_DETALLE_CONDUCTOR (?)}");
            cl.setInt(1, co.getId());
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                aseguradora.setNombre(rs.getString("ASEGURADORA"));
                aseguradora.setTipo_seguro(rs.getString("TIPO_SEGURO"));
                aseguradora.setFecha_venc(rs.getDate("FECHA_VENC"));
                vehiculo.setAseguradora(aseguradora);
                vehiculo.setMarca(rs.getString("MARCA"));
                vehiculo.setModelo(rs.getString("MODELO"));
                vehiculo.setPlaca(rs.getString("PLACA"));
                vehiculo.setFoto(rs.getBytes("FOTO_VEHICULO"));
                conductor.setVehiculo(vehiculo);
                conductor.setId(rs.getInt("ID_CONDUCTOR"));
                conductor.setNombre(rs.getString("NOMBRE"));
                conductor.setApellido(rs.getString("APELLIDO"));
                conductor.setDni(rs.getString("DNI"));
                conductor.setCelular(rs.getString("CELULAR"));
                conductor.setCta_bancaria(rs.getString("CTA_BANCARIA"));
                conductor.setFecha_nac(rs.getDate("FECHA_NAC"));
                conductor.setFoto(rs.getBytes("FOTO_CONDUCTOR"));
                conductor.setLic_Categoria(rs.getString("LIC_CATEGORIA"));
                conductor.setLic_venc(rs.getDate("LIC_VENC"));
            }
            rs.close();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> getDetalleConductor()"); 
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return conductor;
    }
    @Override
    public void setUpdateConductor(Conductor co) throws Exception {
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_ACTUALIZAR_CONDUCTOR (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cl.setInt(1, co.getId());
            cl.setString(2, co.getNombre());
            cl.setString(3, co.getApellido());
            cl.setString(4, co.getDni());
            cl.setString(5, co.getCelular());
            cl.setString(6, co.getCta_bancaria());
            cl.setDate(7, co.getFecha_nac());
            cl.setBytes(8, co.getFoto());
            cl.setString(9, co.getLic_Categoria());
            cl.setDate(10, co.getLic_venc());
            cl.setString(11, co.getVehiculo().getMarca());
            cl.setString(12, co.getVehiculo().getModelo());
            cl.setString(13, co.getVehiculo().getPlaca());
            cl.setBytes(14, co.getVehiculo().getFoto());
            cl.setString(15, co.getVehiculo().getAseguradora().getNombre());
            cl.setString(16, co.getVehiculo().getAseguradora().getTipo_seguro());
            cl.setDate(17, co.getVehiculo().getAseguradora().getFecha_venc());
            
            cl.executeUpdate();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductor: metodo--> setUpdateConductor()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public List<Conductor> getBuscarConductor(Conductor co, String buscador) throws Exception {
        List<Conductor> conductores=null;
        try{
            conductores=new ArrayList<>();
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_BUSCAR_TAXI(?,?,?,?,?)}");
            if(buscador.equals("0")){
                cl.setString(1, buscador);
                cl.setInt(2, co.getId());
                cl.setString(3, "");
                cl.setString(4, "");
                cl.setString(5, "");
            }
            else if(buscador.equals("1")){
                cl.setString(1, buscador);
                cl.setInt(2, 0);
                cl.setString(3, co.getNombre());
                cl.setString(4, "");
                cl.setString(5, "");
            }
            else if(buscador.equals("2")){
                cl.setString(1, buscador);
                cl.setInt(2, 0);
                cl.setString(3, "");
                cl.setString(4, co.getApellido());
                cl.setString(5, "");
            }
            else if(buscador.equals("3")){
                cl.setString(1, buscador);
                cl.setInt(2, 0);
                cl.setString(3, "");
                cl.setString(4, "");
                cl.setString(5, co.getDni());
            }
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                Conductor conductor=new Conductor();
                conductor.setId(rs.getInt("ID_CONDUCTOR"));
                conductor.setNombre(rs.getString("NOMBRE"));
                conductor.setApellido(rs.getString("APELLIDO"));
                conductor.setDni(rs.getString("DNI"));
                
                conductores.add(conductor);
            }
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> getBuscarConductor");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        
        return conductores;
    }
    @Override
    public void setBusquedaConductoresToTable(Conductor co, JTable mi_tabla, String busqueda) throws Exception {
        
        DefaultTableModel modeloBuscar=new DefaultTableModel(){
        //Metodo que me permitira indicar tal cantidad de columnas no puedan ser editables
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==4){
                    return true;
                }else{
                    return false;
                }
            }
        };     
        mi_tabla.setModel(modeloBuscar);
        try{
            DAOConductor dao=new DAOConductorImpl();
            List<Conductor> conductores=dao.getBuscarConductor(co, busqueda);
            
            modeloBuscar.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDO","DNI"});
            //ESTABLECE ANCHO DE COLUMNAS
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular         
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(200);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(100);
            columnModel.getColumn(3).setResizable(false);
            
            for (Conductor c : conductores){
                modeloBuscar.addRow(new Object[]{c.getId(), c.getNombre(), c.getApellido(), c.getDni()});
            }
        }catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ERROR: DAOConductor: --> setBusquedaConductoresToTable()");
        }      
    }   
    @Override
    public List<Conductor> getListaConductoresDisponibles() throws Exception {
        List<Conductor> lista_conductores=null;
        try{
            lista_conductores=new ArrayList<>();
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_LISTA_CONDUCTORES_DISPONIBLES}");
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                Conductor conductor=new Conductor();
                conductor.setId(rs.getInt("ID_CONDUCTOR"));
                conductor.setNombre(rs.getString("CONDUCTOR"));
                conductor.setCelular(rs.getString("CELULAR"));
                Viaje viaje=new Viaje();
                viaje.setD_destino(rs.getString("DESTINO DE ULTIMO VIAJE"));
                viaje.setFecha(rs.getString("FECHA/HORA"));
                conductor.setViaje(viaje);
                
                lista_conductores.add(conductor);
            }
            cl.close();
            rs.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> getListaConductoresDisponibles");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return lista_conductores;
    }
    @Override
    public void getTableConductoresDisponibles(JTable tabla) throws Exception {
         //Creo modelo para la "tabla"
        DefaultTableModel modelo=new DefaultTableModel(){
            //Metodo que me permitira indicar tal cantidad de columnas no puedan ser editables
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==5){
                    return true;
                }else{
                    return false;
                }
            }
        };        
        tabla.setModel(modelo);
        
        try{//Llamo a la lista de conductores
            List<Conductor> listaConductores=this.getListaConductoresDisponibles();
            //DEFINO EL NOMBRE DE LAS COLUMNAS.
            modelo.setColumnIdentifiers(new Object[]{"ID","CONDUCTOR","CELULAR","DESTINO DE ULTIMO VIAJE", "FECHA/HORA"});
            //DEFINO ANCHURA DE LAS COLUMNAS.
            TableColumnModel columnModel = tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(250);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(390);
            columnModel.getColumn(3).setResizable(false);
            columnModel.getColumn(4).setPreferredWidth(200);
            columnModel.getColumn(4).setResizable(false);
            //INSERTO LA LISTA DE CONDUCTORES EN LA TABLA.
            for (Conductor co : listaConductores) {
                modelo.addRow(new Object[]{co.getId(), co.getNombre(), co.getCelular(), co.getViaje().getD_destino(), co.getViaje().getFecha()});
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo-> getListaConductoresDisponibles()");
        }
    }   
    @Override
    public List<Conductor> getBuscarConductorUltimoDestino(Conductor co) throws Exception {
        List<Conductor> conductores=new ArrayList<>();
        
        //para buscar al conductor, tuve la necesidad de crear una variable String 
        //para guardar ahi el "ultimo destino" que ingrese en el "cuadro de texto".
        //MEDIO RARO XD
        String ultimo_destino=co.getViaje().getD_destino();
        try{   
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_BUSCAR_CONDUCTOR_DISPONIBLES_X_DISTRITO(?)}");
            //cl.setString(1, co.getViaje().getDestino()); que raro xd
            cl.setString(1, ultimo_destino);
            ResultSet rs=cl.executeQuery();
            
            while(rs.next()){
                Conductor conductor=new Conductor();
                conductor.setId(rs.getInt("ID_CONDUCTOR"));
                conductor.setNombre(rs.getString("CONDUCTOR"));
                conductor.setCelular(rs.getString("CELULAR"));
                Viaje viaje=new Viaje();
                viaje.setD_destino(rs.getString("DESTINO DE ULTIMO VIAJE"));
                viaje.setFecha(rs.getString("FECHA/HORA"));
                conductor.setViaje(viaje);
                
                conductores.add(conductor);
            }
            cl.close();
            rs.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> getBuscarConductorUltimoDestino");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return conductores;
    }
    @Override
    public void setBusquedaConductoresDisponiblesToTable(Conductor co, JTable mi_tabla) throws Exception {
        DefaultTableModel modeloBuscar=new DefaultTableModel(){
            //Metodo que me permitira indicar tal cantidad de columnas no puedan ser editables
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==5){
                    return true;
                }else{
                    return false;
                }
            }
        };     
        mi_tabla.setModel(modeloBuscar);
        
        try{
            DAOConductor dao=new DAOConductorImpl();
            List<Conductor> lista_conductores=dao.getBuscarConductorUltimoDestino(co);
            
            modeloBuscar.setColumnIdentifiers(new Object[]{"ID","CONDUCTOR","CELULAR","DESTINO DE ULTIMO VIAJE", "FECHA/HORA"});
            //DEFINO ANCHURA DE LAS COLUMNAS.
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(250);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(390);
            columnModel.getColumn(3).setResizable(false);
            columnModel.getColumn(4).setPreferredWidth(200);
            columnModel.getColumn(4).setResizable(false);
            //INSERTO LA LISTA DE CONDUCTORES EN LA TABLA.
            for (Conductor c : lista_conductores) {
                modeloBuscar.addRow(new Object[]{c.getId(), c.getNombre(), c.getCelular(), c.getViaje().getD_destino(), c.getViaje().getFecha()});
            }
        }catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ERROR: DAOConductorImpl: metodo--> setBusquedaConductoresDisponiblesToTable()");
        }      
    }
    @Override
    public List<Conductor> getListaNuevosConductores() throws Exception {
        List<Conductor> lista_conductores=null;
        try{
            lista_conductores=new ArrayList<>();
            this.conectar();
            Statement st=this.cn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM UV_LISTA_CONDUCTORES_NUEVOS_SIN_VIAJES");
            while(rs.next()){
                Conductor co=new Conductor();
                co.setId(rs.getInt("ID_CONDUCTOR"));
                co.setNombre(rs.getString("CONDUCTOR"));
                co.setCelular(rs.getString("CELULAR"));
                
                lista_conductores.add(co);
            }
            rs.close();
            st.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> getListaNevosConductores()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return lista_conductores;
    }
    @Override
    public void setConductoresNuevosToTable(JTable mi_tabla) throws Exception {
        DefaultTableModel modelo=new DefaultTableModel(){
            //Metodo que me permitira indicar tal cantidad de columnas no puedan ser editables
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==5){
                    return true;
                }else{
                    return false;
                }
            }
        };    
        mi_tabla.setModel(modelo);
        try{
            DAOConductor dao=new DAOConductorImpl();
            List<Conductor> lista_conductores=dao.getListaNuevosConductores();
            
            modelo.setColumnIdentifiers(new Object[]{"ID","CONDUCTOR","CELULAR","DESTINO DE ULTIMO VIAJE", "FECHA/HORA"});
            
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(250);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(390);
            columnModel.getColumn(3).setResizable(false);
            columnModel.getColumn(4).setPreferredWidth(200);
            columnModel.getColumn(4).setResizable(false);
            
            for (Conductor c : lista_conductores) {
                modelo.addRow(new Object[]{c.getId(), c.getNombre(), c.getCelular(), "---------------------------------------", "------------------"});
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> setConductoresNuevosToTable()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    @Override
    public List<Conductor> getListaConductoresPago() throws Exception {
        List<Conductor> lista_conductor=new ArrayList<>();
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_CONDUCTOR_TOTAL_COMISIONES}");
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                Conductor co=new Conductor();
                co.setId(rs.getInt("ID_CONDUCTOR"));
                co.setNombre(rs.getString("NOMBRE"));
                co.setApellido(rs.getString("APELLIDO"));
                co.setDni(rs.getString("DNI"));
                Pago pa=new Pago();
                pa.setComision_total(rs.getDouble("COMISION_TOTAL"));
                co.setPago(pa);
                
                lista_conductor.add(co);
            }
            rs.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> getListaConductoresPago()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return lista_conductor;
    }
    @Override
    public void setConductoresPagoToTable(JTable mi_tabla) throws Exception {
        DefaultTableModel modelo=new DefaultTableModel(){
            //Metodo que me permitira indicar tal cantidad de columnas no puedan ser editables
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==5){
                    return true;
                }else{
                    return false;
                }
            }
        };     
        mi_tabla.setModel(modelo);
        try{
            DAOConductor dao=new DAOConductorImpl();
            List<Conductor> lista_conductores=dao.getListaConductoresPago();
            
            modelo.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDOS","DNI", "TOTAL S/."});
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(150);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(250);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(125);
            columnModel.getColumn(3).setResizable(false);
            columnModel.getColumn(4).setPreferredWidth(125);
            columnModel.getColumn(4).setResizable(false);
            
            for (Conductor c : lista_conductores) {
                 modelo.addRow(new Object[]{c.getId(), c.getNombre(), c.getApellido(), c.getDni(), c.getPago().getComision_total()});
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> setConductoresPagoToTable()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    @Override
    public void setTableConductoresPagoPendiente(JTable mi_tabla) throws Exception {
        List<Conductor> lista_conductor=new ArrayList<>();
        try{
            this.conectar();
            Statement st=this.cn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM UV_CONDUCTORES_PAGOS_PENDIENTE");
            while(rs.next()){
                Conductor co=new Conductor();
                co.setId(rs.getInt("ID_CONDUCTOR"));
                co.setNombre(rs.getString("NOMBRE"));
                co.setApellido(rs.getString("APELLIDO"));
                co.setDni(rs.getString("DNI"));
                Pago pa=new Pago();
                pa.setComision_total(rs.getDouble("COMISION_TOTAL"));
                co.setPago(pa);
                
                lista_conductor.add(co);
            }
            st.close();
            rs.close();
            
            DefaultTableModel modelo=new DefaultTableModel(){
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
            
            modelo.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDOS","DNI", "TOTAL S/."});
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(150);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(250);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(125);
            columnModel.getColumn(3).setResizable(false);
            columnModel.getColumn(4).setPreferredWidth(125);
            columnModel.getColumn(4).setResizable(false);
            
            for (Conductor c : lista_conductor) {
                 modelo.addRow(new Object[]{c.getId(), c.getNombre(), c.getApellido(), c.getDni(), c.getPago().getComision_total()});
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> setTableConductoresPagoPendiente()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public void setTableBusquedaConductorConPago(Conductor co, JTable mi_tabla, String opcion) throws Exception {
        
        List<Conductor> lista_conductores=null;
        try{
            lista_conductores=new ArrayList<>();
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_BUSCAR_TAXI2(?,?,?,?,?)}");
            if(opcion.equals("0")){
                cl.setString(1, opcion);
                cl.setInt(2, co.getId());
                cl.setString(3, "");
                cl.setString(4, "");
                cl.setString(5, "");
            }
            else if(opcion.equals("1")){
                cl.setString(1, opcion);
                cl.setInt(2, 0);
                cl.setString(3, co.getNombre());
                cl.setString(4, "");
                cl.setString(5, "");
            }
            else if(opcion.equals("2")){
                cl.setString(1, opcion);
                cl.setInt(2, 0);
                cl.setString(3, "");
                cl.setString(4, co.getApellido());
                cl.setString(5, "");
            }
            else if(opcion.equals("3")){
                cl.setString(1, opcion);
                cl.setInt(2, 0);
                cl.setString(3, "");
                cl.setString(4, "");
                cl.setString(5, co.getDni());
            }
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                Conductor conductor=new Conductor();
                conductor.setId(rs.getInt("ID_CONDUCTOR"));
                conductor.setNombre(rs.getString("NOMBRE"));
                conductor.setApellido(rs.getString("APELLIDO"));
                conductor.setDni(rs.getString("DNI"));
                Pago pa=new Pago();
                pa.setComision_total(rs.getDouble("COMISION_TOTAL"));
                conductor.setPago(pa);
                
                lista_conductores.add(conductor);
            }
            rs.close();
            cl.close();
            
            DefaultTableModel modelo=new DefaultTableModel(){
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
            
            modelo.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDOS","DNI", "TOTAL S/."});
            TableColumnModel columnModel = mi_tabla.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);//defino tamaño de columna
            columnModel.getColumn(0).setResizable(false);//defino que al ejecutar la tabla no se pueda manipular el tamaño         
            columnModel.getColumn(1).setPreferredWidth(150);
            columnModel.getColumn(1).setResizable(false);
            columnModel.getColumn(2).setPreferredWidth(250);
            columnModel.getColumn(2).setResizable(false);
            columnModel.getColumn(3).setPreferredWidth(125);
            columnModel.getColumn(3).setResizable(false);
            columnModel.getColumn(4).setPreferredWidth(125);
            columnModel.getColumn(4).setResizable(false);
            
            for (Conductor c : lista_conductores) {
                 modelo.addRow(new Object[]{c.getId(), c.getNombre(), c.getApellido(), c.getDni(), c.getPago().getComision_total(), c.getPago().getComision_total()});
            }
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> setTableBusquedaConductorConPago()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
    }
    @Override
    public Conductor getNombreConductor(Conductor co) throws Exception {
        Conductor conductor=new Conductor();
        try{
            this.conectar();
            CallableStatement cl=this.cn.prepareCall("{call SP_DAME_NOMBRE_CONDUCTOR(?)}");
            cl.setInt(1,co.getId() );
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                conductor.setId(rs.getInt("ID_CONDUCTOR"));
                conductor.setNombre(rs.getString("NOMBRE"));
                conductor.setApellido(rs.getString("APELLIDO"));
            }
            rs.close();
            cl.close();
        }catch (Exception ex) {
            System.out.println("ERROR: DAOConductorImpl: metodo--> getNombreConductor()");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            this.cerrar();
        }
        return conductor;
    }
}
