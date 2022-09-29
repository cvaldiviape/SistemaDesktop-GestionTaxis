package interfaces;
import modelo.Cliente;
import modelo.Empresa;
import modelo.Persona;

public interface DAOCliente {
    public Cliente getBuscarCliente(Cliente c, String buscandor) throws Exception;
}
