package com.classe.solaire;

import java.lang.Object;

public class Meteo {
  private Object jour;

  private Object heure;

  private Object indice;

  public Meteo(Object jour, Object heure, Object indice) {
    this.jour = jour;
    this.heure = heure;
    this.indice = indice;
  }

  public Object getJour() {
    return jour;
  }

  public void setJour(Object jour) {
    this.jour = jour;
  }

  public Object getHeure() {
    return heure;
  }

  public void setHeure(Object heure) {
    this.heure = heure;
  }

  public Object getIndice() {
    return indice;
  }

  public void setIndice(Object indice) {
    this.indice = indice;
  }
}
