package exceptions;

public class PrinterException extends RuntimeException {

    static final long serialVersionUID = 1L;

    public PrinterException(String message) {
        super(message);
    }

}
