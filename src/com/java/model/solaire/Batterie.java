package com.java.model.solaire;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Batterie {
  private Integer idbatterie;

  private String nombatterie;

  private Object capacite;

  public Batterie(Integer idbatterie, String nombatterie, Object capacite) {
    this.idbatterie = idbatterie;
    this.nombatterie = nombatterie;
    this.capacite = capacite;
  }

  public Integer getIdbatterie() {
    return idbatterie;
  }

  public void setIdbatterie(Integer idbatterie) {
    this.idbatterie = idbatterie;
  }

  public String getNombatterie() {
    return nombatterie;
  }

  public void setNombatterie(String nombatterie) {
    this.nombatterie = nombatterie;
  }

  public Object getCapacite() {
    return capacite;
  }

  public void setCapacite(Object capacite) {
    this.capacite = capacite;
  }
}
