package frido.samosprava.entities;

public class Election {
    private Integer council;
    private String period;
    private Integer votes;
    private String party;
    private Boolean mayor;

    /**
     * @return the council
     */
    public Integer getCouncil() {
        return council;
    }

    /**
     * @return the mayor
     */
    public Boolean getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(Boolean mayor) {
        this.mayor = mayor;
    }

    /**
     * @return the party
     */
    public String getParty() {
        return party;
    }

    /**
     * @param party the party to set
     */
    public void setParty(String party) {
        this.party = party;
    }

    /**
     * @return the votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     * @param votes the votes to set
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
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