package com.classe.voyage;

import java.lang.Integer;
import java.lang.Object;

public class TiquetActivite {
  private Integer id;

  private Object id_activite;

  private Object duree;

  private Object prix;

  private Object quantite;

  public TiquetActivite(Integer id, Object id_activite, Object duree, Object prix,
      Object quantite) {
    this.id = id;
    this.id_activite = id_activite;
    this.duree = duree;
    this.prix = prix;
    this.quantite = quantite;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Object getId_activite() {
    return id_activite;
  }

  public void setId_activite(Object id_activite) {
    this.id_activite = id_activite;
  }

  public Object getDuree() {
    return duree;
  }

  public void setDuree(Object duree) {
    this.duree = duree;
  }

  public Object getPrix() {
    return prix;
  }

  public void setPrix(Object prix) {
    this.prix = prix;
  }

  public Object getQuantite() {
    return quantite;
  }

  public void setQuantite(Object quantite) {
    this.quantite = quantite;
  }
}
