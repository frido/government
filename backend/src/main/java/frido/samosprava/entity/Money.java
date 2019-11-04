package frido.samosprava.entity;

import java.math.BigDecimal;
import java.util.List;

public class Money {
  private Integer year;
  private BigDecimal suma;
  private BigDecimal bv;
  private BigDecimal kv;
  private BigDecimal fv;
  private List<UseKv> useKv;


  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }
  public BigDecimal getSuma() {
    return suma;
  }
  public void setSuma(BigDecimal suma) {
    this.suma = suma;
  }
  public BigDecimal getBv() {
    return bv;
  }
  public void setBv(BigDecimal bv) {
    this.bv = bv;
  }
  public BigDecimal getKv() {
    return kv;
  }
  public void setKv(BigDecimal kv) {
    this.kv = kv;
  }
  public BigDecimal getFv() {
    return fv;
  }
  public void setFv(BigDecimal fv) {
    this.fv = fv;
  }
  public List<UseKv> getUseKv() {
    return useKv;
  }
  public void setUseKv(List<UseKv> useKv) {
    this.useKv = useKv;
  }
}
