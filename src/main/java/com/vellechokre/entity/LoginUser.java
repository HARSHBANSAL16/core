package com.vellechokre.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;

import com.vellechokre.entity.master.LoginAuthority;

@Entity(name = EntityContant.LOGIN_USER)
public class LoginUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  @NotNull(message = "Username can't be null.")
  private String username;

  @Column
  // @JsonIgnore
  private String password;

  @ManyToMany(fetch = FetchType.EAGER)
  private List<LoginAuthority> loginAuthorities;

  @CreatedDate
  @NotNull(message = "activeTill can't be null.")
  private Date activeTill;

  /**
   * @return the id
   */
  public long getId() {

    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(final long id) {

    this.id = id;
  }

  /**
   * @return the username
   */
  public String getUsername() {

    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(final String username) {

    this.username = username;
  }

  /**
   * @return the password
   */
  public String getPassword() {

    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(final String password) {

    this.password = password;
  }

  /**
   * @return the loginAuthorities
   */
  public List<LoginAuthority> getLoginAuthorities() {

    return loginAuthorities;
  }

  /**
   * @param loginAuthorities the loginAuthorities to set
   */
  public void setLoginAuthorities(final List<LoginAuthority> loginAuthorities) {

    this.loginAuthorities = loginAuthorities;
  }

  /**
   * @return the activeTill
   */
  public Date getActiveTill() {

    return activeTill;
  }

  /**
   * @param activeTill the activeTill to set
   */
  public void setActiveTill(final Date activeTill) {

    this.activeTill = activeTill;
  }
}
