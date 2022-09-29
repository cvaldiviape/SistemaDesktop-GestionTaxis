package modelo;
import java.sql.Date;
import java.util.List;
public class Aseguradora {
    private int id;
    private String nombre;
    private String tipo_seguro; 
    private Date fecha_venc;
    private List<Vehiculo> vehiculo;

    public Aseguradora() {
        this.id = 0;
        this.nombre = "";
        this.tipo_seguro = "";
        this.fecha_venc = null;
    }
    public int getId() {
        return id;
    }
    public void setId(int id_aseguradora) {
        this.id = id_aseguradora;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo_seguro() {
        return tipo_seguro;
    }
    public void setTipo_seguro(String tipo_seguro) {
        this.tipo_seguro = tipo_seguro;
    }
    public Date getFecha_venc() {
        return fecha_venc;
    }
    public void setFecha_venc(Date fecha_venc) {
        this.fecha_venc = fecha_venc;
    }
}
