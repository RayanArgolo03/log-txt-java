package exceptions;

public class UsuarioException extends RuntimeException {

    static final long serialVersionUID = 1L;

    public UsuarioException(String message) {
        super(message);
    }

}
