package frido.samosprava.budget;

import java.math.BigDecimal;

public class MoneyPrijmy {
    private Integer year;
    private BigDecimal suma;

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
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
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }
}