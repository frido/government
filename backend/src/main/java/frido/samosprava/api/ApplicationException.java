package frido.samosprava.api;

@SuppressWarnings(value = "serial")
public class ApplicationException extends RuntimeException {
  public ApplicationException(Throwable cause) {
    super(cause);
  }
}
