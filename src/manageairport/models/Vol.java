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
public class Vol {
    private String id_vol;
    private Date date_vol;
    private String destination;
    private String id_avion;
    private int nombre_place_avion;
    private String heure_depart;
    private String heure_arrivee;
    private int nombre_personnes;
    private boolean etat_vol;
    private String escale;

    public Vol(String id_vol, Date date_vol, String destination, String id_avion, int nombre_place_avion, String heure_depart, String heure_arrivee, int nombre_personnes, boolean etat_vol, String escale) {
        this.id_vol = id_vol;
        this.date_vol = date_vol;
        this.destination = destination;
        this.id_avion = id_avion;
        this.nombre_place_avion = nombre_place_avion;
        this.heure_depart = heure_depart;
        this.heure_arrivee = heure_arrivee;
        this.nombre_personnes = nombre_personnes;
        this.etat_vol = etat_vol;
        this.escale = escale;
        
    }

    public Vol() {
    }

    public String getEscale() {
        return escale;
    }

    public void setEscale(String escale) {
        this.escale = escale;
    }
    

    public String getId_vol() {
        return id_vol;
    }

    public void setId_vol(String id_vol) {
        this.id_vol = id_vol;
    }

    public Date getDate_vol() {
        return date_vol;
    }

    public void setDate_vol(Date date_vol) {
        this.date_vol = date_vol;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getId_avion() {
        return id_avion;
    }

    public void setId_avion(String id_avion) {
        this.id_avion = id_avion;
    }

    public int getNombre_place_avion() {
        return nombre_place_avion;
    }

    public void setNombre_place_avion(int nombre_place_avion) {
        this.nombre_place_avion = nombre_place_avion;
    }

    public String getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }

    public String getHeure_arrivee() {
        return heure_arrivee;
    }

    public void setHeure_arrivee(String heure_arrivee) {
        this.heure_arrivee = heure_arrivee;
    }

    public int getNombre_personnes() {
        return nombre_personnes;
    }

    public void setNombre_personnes(int nombre_personnes) {
        this.nombre_personnes = nombre_personnes;
    }

    public boolean isEtat_vol() {
        return etat_vol;
    }

    public void setEtat_vol(boolean etat_vol) {
        this.etat_vol = etat_vol;
    }
    
}
