/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.models;

/**
 *
 * @author Henderson
 */
public class Avion {
    private String idvol;
    private String name;
    private int nbplaces;
    private String marque;
    private boolean etat;

    public Avion() {
    }

    public Avion(String idvol, String name, int nbplaces, String marque, boolean etat) {
        this.idvol = idvol;
        this.name = name;
        this.nbplaces = nbplaces;
        this.marque = marque;
        this.etat = etat;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    
    

   

    public String getIdvol() {
        return idvol;
    }

    public void setIdvol(String idvol) {
        this.idvol = idvol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbplaces() {
        return nbplaces;
    }

    public void setNbplaces(int nbplaces) {
        this.nbplaces = nbplaces;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    
    
    
}
