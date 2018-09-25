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
public class PersonnelNavigant {
    
    private String nometprenom;
    private String poste;
    private String nomVol;

    public PersonnelNavigant(String nometprenom, String poste, String nomVol) {
        this.nometprenom = nometprenom;
        this.poste = poste;
        this.nomVol = nomVol;
    }

    public PersonnelNavigant() {
    }

    public String getNometprenom() {
        return nometprenom;
    }

    public void setNometprenom(String nometprenom) {
        this.nometprenom = nometprenom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getNomVol() {
        return nomVol;
    }

    public void setNomVol(String nomVol) {
        this.nomVol = nomVol;
    }
    
    
    
}
