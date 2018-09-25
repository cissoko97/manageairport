/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.models;

/**
 *
 * @author HYVANA
 */
public class Compte {
    private String id;
    private String login;
    private String motPasse;
    private String nomProprietaire;
    private String idProprietaire;
    private String etat;//Supprimer, désactiver, activer

    public Compte(String id, String login, String motPasse, String nomProprietaire, String idProprietaire, String etat) {
        this.id = id;
        this.login = login;
        this.motPasse = motPasse;
        this.nomProprietaire = nomProprietaire;
        this.idProprietaire = idProprietaire;
        this.etat = etat;
    }

    public Compte() {
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(String idProprietaire) {
        this.idProprietaire = idProprietaire;
    }
    
    
    
    
}
