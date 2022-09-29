package modelo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Conductor {
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fecha_nac;
    private String celular;
    private byte[] foto;
    private String cta_bancaria;
    private char estado;
    private String lic_categoria;
    private Date lic_venc;
    private Vehiculo vehiculo;
    private Pago pago;
    private List<Pago> lista_pago;
    private Viaje viaje;
    
    public Conductor() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
        this.fecha_nac = null;
        this.celular = "";
        this.foto = new byte[1024*100];
        this.cta_bancaria = "";
        this.estado = '0';
        this.lic_categoria = "";
        this.lic_venc = null;
        this.vehiculo = null;
        this.pago = null;
        this.lista_pago = new ArrayList<>();
        this.viaje = null;
    }

    public Conductor(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id_conductor) {
        this.id= id_conductor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Date getFecha_nac() {
        return fecha_nac;
    }
    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public byte[] getFoto() {
        return foto;
    }
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public String getCta_bancaria() {
        return cta_bancaria;
    }
    public void setCta_bancaria(String cta_bancaria) {
        this.cta_bancaria = cta_bancaria;
    }
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public String getLic_Categoria() {
        return lic_categoria;
    }
    public void setLic_Categoria(String lic_categoria) {
        this.lic_categoria = lic_categoria;
    }
    public Date getLic_venc() {
        return lic_venc;
    }
    public void setLic_venc(Date lic_venc) {
        this.lic_venc = lic_venc;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Pago getPago(){
        return pago;
    }
    public void setPago(Pago pago){
        this.pago = pago;
    }   
    public List<Pago> getPago_lista() {
        return lista_pago;
    }
    public void setPago_lista(List<Pago> pago) {
        this.lista_pago = pago;
    }
    public String getLic_categoria() {
        return lic_categoria;
    }
    public void setLic_categoria(String lic_categoria) {
        this.lic_categoria = lic_categoria;
    }
    public Viaje getViaje() {
        return viaje;
    }
    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    
}
