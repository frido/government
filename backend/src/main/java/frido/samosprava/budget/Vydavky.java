package frido.samosprava.budget;

import java.util.ArrayList;
import java.util.List;

public class Vydavky {
    private String program;
    private String title;
    private String comment;
    private List<String> use;
    private List<MoneyVydavky> money = new ArrayList<>();
    private List<Vydavky> sub = new ArrayList<>();

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @return the use
     */
    public List<String> getUse() {
        return use;
    }

    /**
     * @param use the use to set
     */
    public void setUse(List<String> use) {
        this.use = use;
    }

    /**
     * @return the sub
     */
    public List<Vydavky> getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(List<Vydavky> sub) {
        this.sub = sub;
    }

    /**
     * @return the money
     */
    public List<MoneyVydavky> getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(List<MoneyVydavky> money) {
        this.money = money;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    };
}