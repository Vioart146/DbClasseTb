package com.classe.solaire;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Panneau {
  private Integer idpanneau;

  private String nompanneau;

  private Object puissance;

  public Panneau(Integer idpanneau, String nompanneau, Object puissance) {
    this.idpanneau = idpanneau;
    this.nompanneau = nompanneau;
    this.puissance = puissance;
  }

  public Integer getIdpanneau() {
    return idpanneau;
  }

  public void setIdpanneau(Integer idpanneau) {
    this.idpanneau = idpanneau;
  }

  public String getNompanneau() {
    return nompanneau;
  }

  public void setNompanneau(String nompanneau) {
    this.nompanneau = nompanneau;
  }

  public Object getPuissance() {
    return puissance;
  }

  public void setPuissance(Object puissance) {
    this.puissance = puissance;
  }
}
