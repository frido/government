package frido.samosprava.entities;

public class CommissionRef {
    private Integer council;
    private String period;
    private Integer fk;
    private Boolean chairman;

    /**
     * @return the council
     */
    public Integer getCouncil() {
        return council;
    }

    /**
     * @return the chairman
     */
    public Boolean getChairman() {
        return chairman;
    }

    /**
     * @param chairman the chairman to set
     */
    public void setChairman(Boolean chairman) {
        this.chairman = chairman;
    }

    /**
     * @return the fk
     */
    public Integer getFk() {
        return fk;
    }

    /**
     * @param fk the fk to set
     */
    public void setFk(Integer fk) {
        this.fk = fk;
    }

    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * @param council the council to set
     */
    public void setCouncil(Integer council) {
        this.council = council;
    }
}