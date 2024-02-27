package com.classe.solaire;

import java.lang.Object;

public class Presence {
  private Object idbatiment;

  private Object datepresence;

  private Object tranchehoraire;

  private Object nbreleve;

  public Presence(Object idbatiment, Object datepresence, Object tranchehoraire, Object nbreleve) {
    this.idbatiment = idbatiment;
    this.datepresence = datepresence;
    this.tranchehoraire = tranchehoraire;
    this.nbreleve = nbreleve;
  }

  public Object getIdbatiment() {
    return idbatiment;
  }

  public void setIdbatiment(Object idbatiment) {
    this.idbatiment = idbatiment;
  }

  public Object getDatepresence() {
    return datepresence;
  }

  public void setDatepresence(Object datepresence) {
    this.datepresence = datepresence;
  }

  public Object getTranchehoraire() {
    return tranchehoraire;
  }

  public void setTranchehoraire(Object tranchehoraire) {
    this.tranchehoraire = tranchehoraire;
  }

  public Object getNbreleve() {
    return nbreleve;
  }

  public void setNbreleve(Object nbreleve) {
    this.nbreleve = nbreleve;
  }
}
