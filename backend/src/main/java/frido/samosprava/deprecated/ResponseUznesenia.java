package frido.samosprava.deprecated;

import java.util.ArrayList;
import java.util.List;

public class ResponseUznesenia {

    private List<Uznesenie> data;

    public ResponseUznesenia() {
        this.data = new ArrayList<>();
    }

    public ResponseUznesenia(List<Uznesenie> data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public List<Uznesenie> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<Uznesenie> data) {
        this.data = data;
    }
}