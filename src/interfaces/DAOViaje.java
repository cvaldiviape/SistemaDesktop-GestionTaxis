package interfaces;
import modelo.Conductor;
import modelo.Viaje;
import java.util.List;
import javax.swing.JTable;
public interface DAOViaje {
    public void setRegistrarViaje(Viaje viaje) throws Exception;
    public List<Viaje> getListaViajesIniciados() throws Exception;
    public void setViajeIniciadosToTable(JTable tabla) throws Exception;
    public List<Viaje> getBuscarViajeIniciado(Viaje viaje) throws Exception;
    public void setBuscarViajeIniciadoToTable(Viaje viaje, JTable tabla) throws Exception;
    public void setMarcarViajeIniciado(Viaje viaje, String opcion) throws Exception;
    public void setTableViajesRealizadosConductor(JTable tabla, Conductor co)throws Exception;
    public Viaje getDatosEmail(Viaje viaje)throws Exception;
}
