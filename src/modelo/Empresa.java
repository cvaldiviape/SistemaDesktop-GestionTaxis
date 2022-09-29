package modelo;
public class Empresa extends Cliente {
    private int id;
    private String razon_social;
    private String ruc;

    public Empresa() {
        this.id= 0;
        this.razon_social = "";
        this.ruc = "";
    }
    public int getId_empresa() {
        return id;
    }
    public void setId_empresa(int id_empresa) {
        this.id = id_empresa;
    }
    public String getRazon_social() {
        return razon_social;
    }
    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }    
}

