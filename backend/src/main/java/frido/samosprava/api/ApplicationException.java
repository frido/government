package frido.samosprava.api;

public class ApplicationException extends RuntimeException {
    public ApplicationException(Throwable cause) {
        super(cause);
    }
}
