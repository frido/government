package frido.samosprava.entity;

import java.util.ArrayList;
import java.util.List;

public class ResponseList<T> {

    private List<T> data;

    public ResponseList() {
        this.data = new ArrayList<>();
    }

    public ResponseList(List<T> data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public List<T> getData() {
        return data;
    }
}