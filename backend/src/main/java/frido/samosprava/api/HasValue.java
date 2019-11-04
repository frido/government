package frido.samosprava.api;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * HasValue
 */
public class HasValue {

    private BigDecimal value;

    public static Comparator<? super HasValue> comparator = (o1, o2) -> o2.getValue().compareTo(o1.getValue());

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}