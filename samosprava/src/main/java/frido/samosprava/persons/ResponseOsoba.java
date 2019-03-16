package frido.samosprava.persons;

import java.util.List;

public class ResponseOsoba {
    private List<Osoba> data;

    /**
     * @return the data
     */
    public List<Osoba> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<Osoba> data) {
        this.data = data;
    }
}