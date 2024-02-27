package com.classe.voyage;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Client {
  private Integer id;

  private String nom;

  private Object id_genre;

  public Client(Integer id, String nom, Object id_genre) {
    this.id = id;
    this.nom = nom;
    this.id_genre = id_genre;
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

  public Object getId_genre() {
    return id_genre;
  }

  public void setId_genre(Object id_genre) {
    this.id_genre = id_genre;
  }
}
