package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    protected int Id;
    protected String email;
    protected String celular;
    protected List<Viaje> viaje;

    public Cliente() {
        this.Id = 0;
        this.email = "";
        this.celular = "";
        this.viaje = new ArrayList<>();
    }
    public int getId() {
        return Id;
    }
    public void setId(int id_cliente) {
        this.Id = id_cliente;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public List<Viaje> getViaje() {
        return viaje;
    }
    public void setViaje(List<Viaje> viaje) {
        this.viaje = viaje;
    }
}
