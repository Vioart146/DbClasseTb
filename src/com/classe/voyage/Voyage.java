package com.classe.voyage;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Voyage {
  private Integer id;

  private Object duree;

  private Object bouquet;

  private Object lieu;

  private Object etoile;

  private Object prix;

  private String nom;

  public Voyage(Integer id, Object duree, Object bouquet, Object lieu, Object etoile, Object prix,
      String nom) {
    this.id = id;
    this.duree = duree;
    this.bouquet = bouquet;
    this.lieu = lieu;
    this.etoile = etoile;
    this.prix = prix;
    this.nom = nom;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Object getDuree() {
    return duree;
  }

  public void setDuree(Object duree) {
    this.duree = duree;
  }

  public Object getBouquet() {
    return bouquet;
  }

  public void setBouquet(Object bouquet) {
    this.bouquet = bouquet;
  }

  public Object getLieu() {
    return lieu;
  }

  public void setLieu(Object lieu) {
    this.lieu = lieu;
  }

  public Object getEtoile() {
    return etoile;
  }

  public void setEtoile(Object etoile) {
    this.etoile = etoile;
  }

  public Object getPrix() {
    return prix;
  }

  public void setPrix(Object prix) {
    this.prix = prix;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }
}
