package com.classe.voyage;

import java.lang.Integer;
import java.lang.Object;

public class Reservations {
  private Integer id;

  private Object id_voyage;

  private Object id_client;

  private Object dt;

  public Reservations(Integer id, Object id_voyage, Object id_client, Object dt) {
    this.id = id;
    this.id_voyage = id_voyage;
    this.id_client = id_client;
    this.dt = dt;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Object getId_voyage() {
    return id_voyage;
  }

  public void setId_voyage(Object id_voyage) {
    this.id_voyage = id_voyage;
  }

  public Object getId_client() {
    return id_client;
  }

  public void setId_client(Object id_client) {
    this.id_client = id_client;
  }

  public Object getDt() {
    return dt;
  }

  public void setDt(Object dt) {
    this.dt = dt;
  }
}
