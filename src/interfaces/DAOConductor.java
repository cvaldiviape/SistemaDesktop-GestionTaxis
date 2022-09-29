package interfaces;
import modelo.Conductor;
import java.util.List;
import javax.swing.JTable;

public interface DAOConductor {
    public void setRegistrarConductor(Conductor co) throws Exception;
    public List<Conductor> getListaConductores() throws Exception;
    public void getTableConductores(JTable tabla) throws Exception;
    public Conductor getDetalleConductor(Conductor co) throws Exception;
    public void setUpdateConductor(Conductor co) throws Exception;
    public List<Conductor> getBuscarConductor(Conductor co, String buscador) throws Exception;
    public void setBusquedaConductoresToTable(Conductor co, JTable tabla, String busqueda) throws Exception;
    public List<Conductor> getListaConductoresDisponibles() throws Exception;
    public void getTableConductoresDisponibles(JTable tabla) throws Exception;
    public List<Conductor> getBuscarConductorUltimoDestino(Conductor co) throws Exception;
    public void setBusquedaConductoresDisponiblesToTable(Conductor co, JTable tabla) throws Exception;
    public List<Conductor> getListaNuevosConductores() throws Exception;
    public void setConductoresNuevosToTable(JTable tabla) throws Exception;
    public List<Conductor> getListaConductoresPago() throws Exception;
    public void setConductoresPagoToTable(JTable tabla)throws Exception;
    public void setTableConductoresPagoPendiente(JTable tabla)throws Exception;
    public void setTableBusquedaConductorConPago(Conductor co, JTable tabla, String opcion)throws Exception;
    public Conductor getNombreConductor(Conductor co)throws Exception;
}