package frido.samosprava.budget;

import java.util.ArrayList;
import java.util.List;

import frido.samosprava.entity.Idable;

public class Rozpocet implements Idable {
    private Integer id;
    private Integer council;
    private List<Sumar> sumar;
    private List<Prijmy> prijmy = new ArrayList<>();
    private List<Vydavky> vydavky = new ArrayList<>();

    /**
     * @return the council
     */
    public Integer getCouncil() {
        return council;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the sumar
     */
    public List<Sumar> getSumar() {
        return sumar;
    }

    /**
     * @param sumar the sumar to set
     */
    public void setSumar(List<Sumar> sumar) {
        this.sumar = sumar;
    }

    /**
     * @param council the council to set
     */
    public void setCouncil(Integer council) {
        this.council = council;
    }

    /**
     * @return the vydavky
     */
    public List<Vydavky> getVydavky() {
        return vydavky;
    }

    /**
     * @param vydavky the vydavky to set
     */
    public void setVydavky(List<Vydavky> vydavky) {
        this.vydavky = vydavky;
    }

    /**
     * @return the prijmy
     */
    public List<Prijmy> getPrijmy() {
        return prijmy;
    }

    /**
     * @param prijmy the prijmy to set
     */
    public void setPrijmy(List<Prijmy> prijmy) {
        this.prijmy = prijmy;
    }

}