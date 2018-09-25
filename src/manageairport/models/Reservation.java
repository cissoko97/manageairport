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
public class Reservation {

    private String nom_client;
    private String id_vol;
    private boolean etat_resevation;
    private Date date_reservation;
    private String prenom_client;
    private String email_client;
    private int age_client;
    private int numero_carte_client;
    private int telephone_client;

    public Reservation(String nom_client, String id_vol, boolean etat_resevation, Date date_reservation, String prenom_client, String email_client, int age_client, int numero_carte_client, int telephone_client) {
        this.nom_client = nom_client;
        this.id_vol = id_vol;
        this.etat_resevation = etat_resevation;
        this.date_reservation = date_reservation;
        this.prenom_client = prenom_client;
        this.email_client = email_client;
        this.age_client = age_client;
        this.numero_carte_client = numero_carte_client;
        this.telephone_client = telephone_client;
    }

   
    public Reservation(){
        
    }

    public String getId_vol() {
        return id_vol;
    }

    public void setId_vol(String id_vol) {
        this.id_vol = id_vol;
    }

    public boolean isEtat_resevation() {
        return etat_resevation;
    }

    public void setEtat_resevation(boolean etat_resevation) {
        this.etat_resevation = etat_resevation;
    }

    public Date getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
    }
    

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }
    

    public String getEmail_client() {
        return email_client;
    }

    public void setEmail_client(String email_client) {
        this.email_client = email_client;
    }

    public int getAge_client() {
        return age_client;
    }

    public void setAge_client(int age_client) {
        this.age_client = age_client;
    }

    public int getNumero_carte_client() {
        return numero_carte_client;
    }

    public void setNumero_carte_client(int numero_carte_client) {
        this.numero_carte_client = numero_carte_client;
    }

    public int getTelephone_client() {
        return telephone_client;
    }

    public void setTelephone_client(int telephone_client) {
        this.telephone_client = telephone_client;
    }
    
    
    
}
