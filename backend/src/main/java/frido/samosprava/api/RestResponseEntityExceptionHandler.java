package frido.samosprava.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

  @ExceptionHandler(value = { ApplicationException.class })
  protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Foo Not Found", ex);
  }
}
