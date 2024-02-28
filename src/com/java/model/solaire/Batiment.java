package com.java.model.solaire;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Batiment {
  private Integer idbatiment;

  private String nombatiment;

  private Object idsource;

  public Batiment(Integer idbatiment, String nombatiment, Object idsource) {
    this.idbatiment = idbatiment;
    this.nombatiment = nombatiment;
    this.idsource = idsource;
  }

  public Integer getIdbatiment() {
    return idbatiment;
  }

  public void setIdbatiment(Integer idbatiment) {
    this.idbatiment = idbatiment;
  }

  public String getNombatiment() {
    return nombatiment;
  }

  public void setNombatiment(String nombatiment) {
    this.nombatiment = nombatiment;
  }

  public Object getIdsource() {
    return idsource;
  }

  public void setIdsource(Object idsource) {
    this.idsource = idsource;
  }
}
