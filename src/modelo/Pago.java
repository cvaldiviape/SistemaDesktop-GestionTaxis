package modelo;
import java.sql.Date;
public class Pago {
    private int id;
    private double comision_total;
    private Date fecha;
    private char estado;
    private Conductor conductor;

    public Pago() {
        this.id = 0;
        this.comision_total = 0;
        this.fecha = null;
        this.estado = '0';
        this.conductor = null;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getComision_total() {
        return comision_total;
    }
    public void setComision_total(double comision_total) {
        this.comision_total = comision_total;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Conductor getConductor() {
        return conductor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }    
}
