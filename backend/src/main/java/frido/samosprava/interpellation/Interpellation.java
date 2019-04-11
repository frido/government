package frido.samosprava.interpellation;

import java.util.List;

public class Interpellation {
    private int id;
    private int spolok;
    private int zasadnutie;
    private String from;
    private String title;
    private String otazka;
    private String otazkaDatum;
    private String odpoved;
    private String odpovedDatum;
    private String zdroj;
    private List<String> tags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpolok() {
        return spolok;
    }

    public void setSpolok(int spolok) {
        this.spolok = spolok;
    }

    public int getZasadnutie() {
        return zasadnutie;
    }

    public void setZasadnutie(int zasadnutie) {
        this.zasadnutie = zasadnutie;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOtazka() {
        return otazka;
    }

    public void setOtazka(String otazka) {
        this.otazka = otazka;
    }

    public String getOtazkaDatum() {
        return otazkaDatum;
    }

    public void setOtazkaDatum(String otazkaDatum) {
        this.otazkaDatum = otazkaDatum;
    }

    public String getOdpoved() {
        return odpoved;
    }

    public void setOdpoved(String odpoved) {
        this.odpoved = odpoved;
    }

    public String getOdpovedDatum() {
        return odpovedDatum;
    }

    public void setOdpovedDatum(String odpovedDatum) {
        this.odpovedDatum = odpovedDatum;
    }

    public String getZdroj() {
        return zdroj;
    }

    public void setZdroj(String zdroj) {
        this.zdroj = zdroj;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
