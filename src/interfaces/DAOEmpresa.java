package interfaces;
import modelo.Empresa;

public interface DAOEmpresa {
    public void setRegistrarEmpresa(Empresa em, String opcion) throws Exception;
    public Empresa getBuscarEmpresaRuc(Empresa em) throws Exception;
}
