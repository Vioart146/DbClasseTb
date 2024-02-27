package com.classe.voyage;

import java.lang.Integer;
import java.lang.Object;

public class BouquetActivite {
  private Integer id;

  private Object id_activite;

  private Object id_bouquet;

  private Object quantite;

  private Object duree_activite;

  public BouquetActivite(Integer id, Object id_activite, Object id_bouquet, Object quantite,
      Object duree_activite) {
    this.id = id;
    this.id_activite = id_activite;
    this.id_bouquet = id_bouquet;
    this.quantite = quantite;
    this.duree_activite = duree_activite;
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

  public Object getId_bouquet() {
    return id_bouquet;
  }

  public void setId_bouquet(Object id_bouquet) {
    this.id_bouquet = id_bouquet;
  }

  public Object getQuantite() {
    return quantite;
  }

  public void setQuantite(Object quantite) {
    this.quantite = quantite;
  }

  public Object getDuree_activite() {
    return duree_activite;
  }

  public void setDuree_activite(Object duree_activite) {
    this.duree_activite = duree_activite;
  }
}
