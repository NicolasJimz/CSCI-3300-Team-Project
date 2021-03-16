package com.example.accessingdatamysql;

import javax.persistence.*;

//------------------------ Roles ------------------------
@Entity
@Table(name = "roles")
public class Roles {
  @Id
  @Column(name = "role_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer role_id;

  private String name;

  //----- Get and Set -----
  public Integer getId() {
    return role_id;
  }

  public void setId(Integer role_id) {
    this.role_id = role_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}