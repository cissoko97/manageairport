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
public class Depense {

    private long numero;
    private String type;
    private float montant;
    private int jour;
    private int mois;
    private int annee;
    private String description;
    private boolean etat;
    
    public Depense() {
    }

    public Depense(long numero, String type, float montant, int jour, int mois, int annee, String description, boolean etat) {
        this.numero = numero;
        this.type = type;
        this.montant = montant;
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.description = description;
        this.etat = etat;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    
    
    
}
