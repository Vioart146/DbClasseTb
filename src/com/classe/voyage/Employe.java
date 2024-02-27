package com.classe.voyage;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Employe {
  private Integer id;

  private String nom;

  private String prenom;

  private Object id_genre;

  private Object date_naissance;

  private Object date_embauche;

  private Object id_poste;

  public Employe(Integer id, String nom, String prenom, Object id_genre, Object date_naissance,
      Object date_embauche, Object id_poste) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.id_genre = id_genre;
    this.date_naissance = date_naissance;
    this.date_embauche = date_embauche;
    this.id_poste = id_poste;
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

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Object getId_genre() {
    return id_genre;
  }

  public void setId_genre(Object id_genre) {
    this.id_genre = id_genre;
  }

  public Object getDate_naissance() {
    return date_naissance;
  }

  public void setDate_naissance(Object date_naissance) {
    this.date_naissance = date_naissance;
  }

  public Object getDate_embauche() {
    return date_embauche;
  }

  public void setDate_embauche(Object date_embauche) {
    this.date_embauche = date_embauche;
  }

  public Object getId_poste() {
    return id_poste;
  }

  public void setId_poste(Object id_poste) {
    this.id_poste = id_poste;
  }
}
