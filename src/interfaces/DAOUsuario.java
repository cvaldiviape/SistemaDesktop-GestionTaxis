package interfaces;
import modelo.Usuario;
public interface DAOUsuario {
    public Usuario getValidarLogin(Usuario admi )throws Exception;
}
