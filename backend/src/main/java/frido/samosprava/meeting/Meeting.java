package frido.samosprava.meeting;

import frido.samosprava.entity.Idable;

public class Meeting implements Idable {
    private Integer id;
    private Integer spolok;
    private String datum;
    private String cas;
    private String miesto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpolok() {
        return spolok;
    }

    public void setSpolok(Integer spolok) {
        this.spolok = spolok;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getMiesto() {
        return miesto;
    }

    public void setMiesto(String miesto) {
        this.miesto = miesto;
    }
}
