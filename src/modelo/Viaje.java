package modelo;
public class Viaje {
    private int id;
    private String origen;
    private String d_origen;
    private String destino;
    private String d_destino;
    private String fecha;
    private double monto;
    private double comision;
    private char estado;
    private Cliente cliente;
    private Usuario usuario;
    private Conductor conductor;

    public Viaje() {
        this.id = 0;
        this.origen = "";
        this.d_origen = "";
        this.destino = "";
        this.d_destino = "";
        this.fecha = null;
        this.monto = 0;
        this.comision = 0;
        this.estado = '0';
        this.cliente = null;
        this.usuario = null;
        this.conductor = null;
    }
    public int getId() {
        return id;
    }
    public void setId(int id_viaje) {
        this.id = id_viaje;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getD_origen() {
        return d_origen;
    }
    public void setD_origen(String d_origen) {
        this.d_origen = d_origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getD_destino() {
        return d_destino;
    }
    public void setD_destino(String d_destino) {
        this.d_destino = d_destino;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario administrador) {
        this.usuario = administrador;
    }
    public Conductor getConductor() {
        return conductor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
}
