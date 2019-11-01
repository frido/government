package frido.samosprava.core.entity.view;

/**
 * StatTypeView
 */
public class StatTypeView {

    private String type;
    private Integer value;

    public StatTypeView(String type, Integer value) {
        this.setType(type);
        this.setValue(value);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}