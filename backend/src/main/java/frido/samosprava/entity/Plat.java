package frido.samosprava.entity;

import java.math.BigDecimal;

public class Plat {
  private BigDecimal priemernaMzda;
  private BigDecimal index;
  private BigDecimal starosta;
  private BigDecimal starostaMin;
  private BigDecimal starostaMax;
  private BigDecimal primator;
  private BigDecimal primatorMin;
  private BigDecimal primatorMax;
  private PlatPoslanec poslanec;

  public BigDecimal getPriemernaMzda() {
    return priemernaMzda;
  }
  public void setPriemernaMzda(BigDecimal priemernaMzda) {
    this.priemernaMzda = priemernaMzda;
  }
  public BigDecimal getIndex() {
    return index;
  }
  public void setIndex(BigDecimal index) {
    this.index = index;
  }
  public BigDecimal getStarosta() {
    return starosta;
  }
  public void setStarosta(BigDecimal starosta) {
    this.starosta = starosta;
  }
  public BigDecimal getStarostaMin() {
    return starostaMin;
  }
  public void setStarostaMin(BigDecimal starostaMin) {
    this.starostaMin = starostaMin;
  }
  public BigDecimal getStarostaMax() {
    return starostaMax;
  }
  public void setStarostaMax(BigDecimal starostaMax) {
    this.starostaMax = starostaMax;
  }
  public BigDecimal getPrimator() {
    return primator;
  }
  public void setPrimator(BigDecimal primator) {
    this.primator = primator;
  }
  public BigDecimal getPrimatorMin() {
    return primatorMin;
  }
  public void setPrimatorMin(BigDecimal primatorMin) {
    this.primatorMin = primatorMin;
  }
  public BigDecimal getPrimatorMax() {
    return primatorMax;
  }
  public void setPrimatorMax(BigDecimal primatorMax) {
    this.primatorMax = primatorMax;
  }
  public PlatPoslanec getPoslanec() {
    return poslanec;
  }
  public void setPoslanec(PlatPoslanec poslanec) {
    this.poslanec = poslanec;
  }
}
