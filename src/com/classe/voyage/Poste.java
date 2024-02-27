package com.classe.voyage;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Poste {
  private Integer id;

  private String nom;

  private Object taux_horaire;

  public Poste(Integer id, String nom, Object taux_horaire) {
    this.id = id;
    this.nom = nom;
    this.taux_horaire = taux_horaire;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Object getTaux_horaire() {
    return taux_horaire;
  }

  public void setTaux_horaire(Object taux_horaire) {
    this.taux_horaire = taux_horaire;
  }
}
