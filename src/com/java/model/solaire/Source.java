package com.java.model.solaire;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Source {
  private Integer idsource;

  private String nomsource;

  private Object idpanneau;

  private Object idbatterie;

  public Source(Integer idsource, String nomsource, Object idpanneau, Object idbatterie) {
    this.idsource = idsource;
    this.nomsource = nomsource;
    this.idpanneau = idpanneau;
    this.idbatterie = idbatterie;
  }

  public Integer getIdsource() {
    return idsource;
  }

  public void setIdsource(Integer idsource) {
    this.idsource = idsource;
  }

  public String getNomsource() {
    return nomsource;
  }

  public void setNomsource(String nomsource) {
    this.nomsource = nomsource;
  }

  public Object getIdpanneau() {
    return idpanneau;
  }

  public void setIdpanneau(Object idpanneau) {
    this.idpanneau = idpanneau;
  }

  public Object getIdbatterie() {
    return idbatterie;
  }

  public void setIdbatterie(Object idbatterie) {
    this.idbatterie = idbatterie;
  }
}
