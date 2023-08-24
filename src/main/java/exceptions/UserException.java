package exceptions;

public class UserException extends RuntimeException {

    static final long serialVersionUID = 1L;

    public UserException(String message) {
        super(message);
    }

}
