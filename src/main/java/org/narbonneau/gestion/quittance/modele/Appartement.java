package org.narbonneau.gestion.quittance.modele;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Appartement {


  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appartement_id_seq")
  @Column(nullable = false,unique = true)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY )
  @JoinColumn(name = "id_locataire")
  private Personne idLocataire;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_proprietaire")
  private Personne idProprietaire;

  @Column
  private String adresse;

  @Column
  private String adresse2;

  @Column(name="code_postal")
  private int codePostal;

  @Column
  private String ville;

  @Column
  private BigDecimal loyer;

  @Column
  private BigDecimal charges;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Personne getIdLocataire() {
    return idLocataire;
  }

  public void setIdLocataire(Personne idLocataire) {
    this.idLocataire = idLocataire;
  }

  public Personne getIdProprietaire() {
    return idProprietaire;
  }

  public void setIdProprietaire(Personne idProprietaire) {
    this.idProprietaire = idProprietaire;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public String getAdresse2() {
    return adresse2;
  }

  public void setAdresse2(String adresse2) {
    this.adresse2 = adresse2;
  }

  public int getCodePostal() {
    return codePostal;
  }

  public void setCodePostal(int codePostal) {
    this.codePostal = codePostal;
  }

  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public BigDecimal getLoyer() {
    return loyer;
  }

  public void setLoyer(BigDecimal loyer) {
    this.loyer = loyer;
  }

  public BigDecimal getCharges() {
    return charges;
  }

  public void setCharges(BigDecimal charges) {
    this.charges = charges;
  }
}
