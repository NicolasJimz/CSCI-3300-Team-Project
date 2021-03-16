package com.example.accessingdatamysql;

import javax.persistence.*;
//------------------------ User ------------------------
@Entity
@Table(name = "users")
public class Users {
  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer user_id;

  private String email;

  private String username;

  private String password;

  //----- Join 'user_roles' table to 'users' table -----
  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(
    name = "user_roles",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id")
  )

  //----- Get and Set -----
  public Integer getId() {
    return user_id;
  }

  public void setId(Integer user_id) {
    this.user_id = user_id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}