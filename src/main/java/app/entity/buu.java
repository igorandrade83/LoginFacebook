package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BUU
 * @generated
 */
@Entity
@Table(name = "\"BUU\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.buu")
public class buu implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "booleanoNull", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean booleanoNull;

  /**
  * @generated
  */
  @Column(name = "bool", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean bool;

  /**
   * Construtor
   * @generated
   */
  public buu(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public buu setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém booleanoNull
   * return booleanoNull
   * @generated
   */
  
  public java.lang.Boolean getBooleanoNull(){
    return this.booleanoNull;
  }

  /**
   * Define booleanoNull
   * @param booleanoNull booleanoNull
   * @generated
   */
  public buu setBooleanoNull(java.lang.Boolean booleanoNull){
    this.booleanoNull = booleanoNull;
    return this;
  }

  /**
   * Obtém bool
   * return bool
   * @generated
   */
  
  public java.lang.Boolean getBool(){
    return this.bool;
  }

  /**
   * Define bool
   * @param bool bool
   * @generated
   */
  public buu setBool(java.lang.Boolean bool){
    this.bool = bool;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    buu object = (buu)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
