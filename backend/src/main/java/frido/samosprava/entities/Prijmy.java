package frido.samosprava.entities;

import java.util.ArrayList;
import java.util.List;

public class Prijmy {
    private String title;
    private List<MoneyPrijmy> money = new ArrayList<>();
    private List<Prijmy> sub = new ArrayList<>();

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the sub
     */
    public List<Prijmy> getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(List<Prijmy> sub) {
        this.sub = sub;
    }

    /**
     * @return the money
     */
    public List<MoneyPrijmy> getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(List<MoneyPrijmy> money) {
        this.money = money;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}