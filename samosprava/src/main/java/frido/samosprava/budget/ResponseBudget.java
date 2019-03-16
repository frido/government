package frido.samosprava.budget;

public class ResponseBudget {
    private Rozpocet data;

    public ResponseBudget(){
    }

    public ResponseBudget(Rozpocet data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public Rozpocet getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Rozpocet data) {
        this.data = data;
    }
}