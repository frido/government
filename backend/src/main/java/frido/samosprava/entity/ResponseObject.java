package frido.samosprava.entity;

public class ResponseObject<T> {
    private T data;

    public ResponseObject() {
    }

    public ResponseObject(T data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }
}