package com.classe.solaire;

import java.lang.Object;

public class Coupure {
  private Object datecoupure;

  private Object idsource;

  private Object heurecoupure;

  public Coupure(Object datecoupure, Object idsource, Object heurecoupure) {
    this.datecoupure = datecoupure;
    this.idsource = idsource;
    this.heurecoupure = heurecoupure;
  }

  public Object getDatecoupure() {
    return datecoupure;
  }

  public void setDatecoupure(Object datecoupure) {
    this.datecoupure = datecoupure;
  }

  public Object getIdsource() {
    return idsource;
  }

  public void setIdsource(Object idsource) {
    this.idsource = idsource;
  }

  public Object getHeurecoupure() {
    return heurecoupure;
  }

  public void setHeurecoupure(Object heurecoupure) {
    this.heurecoupure = heurecoupure;
  }
}
