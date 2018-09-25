/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.models;

import java.sql.Date;

/**
 *
 * @author HYVANA
 */
public class Personnel {
    private String id;
    private String direction;
    private String poste;
    private String nom;
    private String prenoms;
    private String sexe;
    private String email;
    private int telephone;
    private Date dateCreationProfil;
    private String etat;
    private String photoprofil;
    

    public String isEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Personnel() {
    }

    
    public Personnel(String id, String etat,String direction, String poste, String nom, String prenoms, String sexe, String email, int telephone, Date creationProfil, String photoprofil) {
        this.id = id;
        this.etat = etat;
        this.direction = direction;
        this.poste = poste;
        this.nom = nom;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.email = email;
        this.telephone = telephone;
        this.dateCreationProfil = creationProfil;
        this.photoprofil = photoprofil;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Date getDateCreationProfil() {
        return dateCreationProfil;
    }

    public void setDateCreationProfil(Date dateCreationProfil) {
        this.dateCreationProfil = dateCreationProfil;
    }
    
    
    
    
    
}
