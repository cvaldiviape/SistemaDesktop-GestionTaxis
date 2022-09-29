package interfaces;
import modelo.Conductor;
import modelo.Pago;
import javax.swing.JTable;
public interface DAOPago {
    public void setTableHistorialPago(JTable tabla, Conductor co) throws Exception;
    public void setTablePagosPendientes(JTable tabla, Conductor co) throws Exception;
    public void setRegistrarPago(Conductor co)throws Exception;
    public void setPagoPendiente(Conductor co)throws Exception;
    public void setRegistrarPagoPendiente(Pago pa)throws Exception;
}
