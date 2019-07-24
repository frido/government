package frido.samosprava.deprecated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MoneyVydavky {
    private Integer year;
    private BigDecimal bv;
    private BigDecimal kv;
    private BigDecimal fv;
    private List<UseKv> useKv = new ArrayList<>();

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @return the useKv
     */
    public List<UseKv> getUseKv() {
        return useKv;
    }

    /**
     * @param useKv the useKv to set
     */
    public void setUseKv(List<UseKv> useKv) {
        this.useKv = useKv;
    }

    /**
     * @return the fv
     */
    public BigDecimal getFv() {
        return fv;
    }

    /**
     * @param fv the fv to set
     */
    public void setFv(BigDecimal fv) {
        this.fv = fv;
    }

    /**
     * @return the kv
     */
    public BigDecimal getKv() {
        return kv;
    }

    /**
     * @param kv the kv to set
     */
    public void setKv(BigDecimal kv) {
        this.kv = kv;
    }

    /**
     * @return the bv
     */
    public BigDecimal getBv() {
        return bv;
    }

    /**
     * @param bv the bv to set
     */
    public void setBv(BigDecimal bv) {
        this.bv = bv;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }
}