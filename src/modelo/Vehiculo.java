package modelo;
import java.sql.Date;
public class Vehiculo {
    private int id;
    private String marca;
    private String placa;
    private String modelo;
    private byte[] foto;
    private Date soat_venc;
    private Aseguradora aseguradora;
    private Conductor conductor;

    public Vehiculo() {
        this.id = 0;
        this.marca = "";
        this.placa = "";
        this.modelo = "";
        this.foto = new byte[1024*100];
        this.soat_venc = null;
        this.aseguradora = null;
        this.conductor = null;
    }
    public int getId() {
        return id;
    }
    public void setId(int id_vehiculo) {
        this.id = id_vehiculo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public byte[] getFoto() {
        return foto;
    }
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public Date getSoat_venc() {
        return soat_venc;
    }
    public void setSoat_venc(Date soat_venc) {
        this.soat_venc = soat_venc;
    }
    public Aseguradora getAseguradora() {
        return aseguradora;
    }
    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    public Conductor getConductor() {
        return conductor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
}

