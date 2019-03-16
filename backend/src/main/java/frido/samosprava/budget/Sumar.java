package frido.samosprava.budget;

import java.math.BigDecimal;

public class Sumar {
    private Integer year;
    private BigDecimal vydavky;
    private BigDecimal prijmy;

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @return the prijmy
     */
    public BigDecimal getPrijmy() {
        return prijmy;
    }

    /**
     * @param prijmy the prijmy to set
     */
    public void setPrijmy(BigDecimal prijmy) {
        this.prijmy = prijmy;
    }

    /**
     * @return the vydavky
     */
    public BigDecimal getVydavky() {
        return vydavky;
    }

    /**
     * @param vydavky the vydavky to set
     */
    public void setVydavky(BigDecimal vydavky) {
        this.vydavky = vydavky;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }
}