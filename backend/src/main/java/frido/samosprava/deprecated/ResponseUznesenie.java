package frido.samosprava.deprecated;

public class ResponseUznesenie {
    private Uznesenie data;

    public ResponseUznesenie() {
    }

    public ResponseUznesenie(Uznesenie data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public Uznesenie getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Uznesenie data) {
        this.data = data;
    }
}