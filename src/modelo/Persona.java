package modelo;
public class Persona extends Cliente{
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
    }
    public int getId_persona() {
        return id;
    }
    public void setId_persona(int id_persona_natural) {
        this.id = id_persona_natural;
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
}
