package frido.samosprava.deprecated;

import java.math.BigDecimal;

public class UseKv {
    private String title;
    private BigDecimal suma;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the suma
     */
    public BigDecimal getSuma() {
        return suma;
    }

    /**
     * @param suma the suma to set
     */
    public void setSuma(BigDecimal suma) {
        this.suma = suma;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}