package frido.samosprava.view;

public class ResponseObjectView {
  private final Object data;

  public ResponseObjectView(Object data) {
    this.data = data;
  }

  public Object getData() {
    return data;
  }
}
