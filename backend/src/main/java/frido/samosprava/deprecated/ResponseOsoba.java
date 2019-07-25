package frido.samosprava.deprecated;

import java.util.List;

@Deprecated
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