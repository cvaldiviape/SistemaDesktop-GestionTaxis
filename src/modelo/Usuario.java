package modelo;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String username;
    private String pass;
    private List<Viaje> viaje;

    public Usuario() {
        this.id = 0;
        this.username = "";
        this.pass = "";
        this.viaje = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
}
