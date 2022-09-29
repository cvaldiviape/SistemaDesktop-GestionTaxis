package interfaces;

import modelo.Persona;

public interface DAOPersona {
    public void setRegistrarPersona(Persona pe, String opcion)throws Exception;
    public Persona getBuscarPersonaDNI(Persona pe)throws Exception;
}
