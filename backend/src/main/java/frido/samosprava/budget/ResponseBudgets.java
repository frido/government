package frido.samosprava.budget;

import java.util.ArrayList;
import java.util.List;

import frido.samosprava.entities.Rozpocet;

public class ResponseBudgets {

    private List<Rozpocet> data;

    public ResponseBudgets() {
        this.data = new ArrayList<>();
    }

    public ResponseBudgets(List<Rozpocet> data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public List<Rozpocet> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<Rozpocet> data) {
        this.data = data;
    }
}