package frido.samosprava.resolutions;

import java.util.List;

import frido.samosprava.entity.Idable;

public class Uznesenie implements Idable {
    private Integer id;
    private Integer cislo;
    private String typ;
    private Integer spolok;
    private Integer zasadnutie;
    private List<Integer> predkladatel;
    private String nadpis;
    private String popis;
    private List<Vysledok> vysledok;
    private List<Integer> za;
    private List<Integer> proti;
    private Integer pritomni;
    private String zdroj;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the zdroj
     */
    public String getZdroj() {
        return zdroj;
    }

    /**
     * @param zdroj the zdroj to set
     */
    public void setZdroj(String zdroj) {
        this.zdroj = zdroj;
    }

    /**
     * @return the pritomni
     */
    public Integer getPritomni() {
        return pritomni;
    }

    /**
     * @param pritomni the pritomni to set
     */
    public void setPritomni(Integer pritomni) {
        this.pritomni = pritomni;
    }

    /**
     * @return the proti
     */
    public List<Integer> getProti() {
        return proti;
    }

    /**
     * @param proti the proti to set
     */
    public void setProti(List<Integer> proti) {
        this.proti = proti;
    }

    /**
     * @return the za
     */
    public List<Integer> getZa() {
        return za;
    }

    /**
     * @param za the za to set
     */
    public void setZa(List<Integer> za) {
        this.za = za;
    }

    /**
     * @return the vysledok
     */
    public List<Vysledok> getVysledok() {
        return vysledok;
    }

    /**
     * @param vysledok the vysledok to set
     */
    public void setVysledok(List<Vysledok> vysledok) {
        this.vysledok = vysledok;
    }

    /**
     * @return the popis
     */
    public String getPopis() {
        return popis;
    }

    /**
     * @param popis the popis to set
     */
    public void setPopis(String popis) {
        this.popis = popis;
    }

    /**
     * @return the nadpis
     */
    public String getNadpis() {
        return nadpis;
    }

    /**
     * @param nadpis the nadpis to set
     */
    public void setNadpis(String nadpis) {
        this.nadpis = nadpis;
    }

    /**
     * @return the predkladatel
     */
    public List<Integer> getPredkladatel() {
        return predkladatel;
    }

    /**
     * @param predkladatel the predkladatel to set
     */
    public void setPredkladatel(List<Integer> predkladatel) {
        this.predkladatel = predkladatel;
    }

    /**
     * @return the zasadnutie
     */
    public Integer getZasadnutie() {
        return zasadnutie;
    }

    /**
     * @param zasadnutie the zasadnutie to set
     */
    public void setZasadnutie(Integer zasadnutie) {
        this.zasadnutie = zasadnutie;
    }

    /**
     * @return the spolok
     */
    public Integer getSpolok() {
        return spolok;
    }

    /**
     * @param spolok the spolok to set
     */
    public void setSpolok(Integer spolok) {
        this.spolok = spolok;
    }

    /**
     * @return the typ
     */
    public String getTyp() {
        return typ;
    }

    /**
     * @param typ the typ to set
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * @return the cislo
     */
    public Integer getCislo() {
        return cislo;
    }

    /**
     * @param cislo the cislo to set
     */
    public void setCislo(Integer cislo) {
        this.cislo = cislo;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
}