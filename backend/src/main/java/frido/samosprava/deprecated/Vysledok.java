package frido.samosprava.deprecated;

import java.util.List;

public class Vysledok {
    private String sumar;
    private List<String> popis;

    /**
     * @return the sumar
     */
    public String getSumar() {
        return sumar;
    }

    /**
     * @return the popis
     */
    public List<String> getPopis() {
        return popis;
    }

    /**
     * @param popis the popis to set
     */
    public void setPopis(List<String> popis) {
        this.popis = popis;
    }

    /**
     * @param sumar the sumar to set
     */
    public void setSumar(String sumar) {
        this.sumar = sumar;
    }
}