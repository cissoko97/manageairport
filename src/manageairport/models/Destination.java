/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.models;

import java.util.Objects;

/**
 *
 * @author KING_ALEX
 */
public class Destination {
    
    private String codeDest;
    private String paysD;
    private String villeD;
    private String nomDest;

    public Destination() {
    }

    public String getCodeDest() {
        return codeDest;
    }

    public void setCodeDest(String codeDest) {
        this.codeDest = codeDest;
    }

    public String getPaysD() {
        return paysD;
    }

    public void setPaysD(String paysD) {
        this.paysD = paysD;
    }

    public String getVilleD() {
        return villeD;
    }

    public void setVilleD(String villeD) {
        this.villeD = villeD;
    }

    public Destination(String codeDest, String paysD, String villeD, String nomDest) {
        this.codeDest = codeDest;
        this.paysD = paysD;
        this.villeD = villeD;
        this.nomDest = nomDest;
    }

    public String getNomDest() {
        return nomDest;
    }

    public void setNomDest(String nomDest) {
        this.nomDest = nomDest;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.codeDest);
        hash = 79 * hash + Objects.hashCode(this.paysD);
        hash = 79 * hash + Objects.hashCode(this.nomDest);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Destination other = (Destination) obj;
        if (!Objects.equals(this.codeDest, other.codeDest)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Destination{" + "codeDest=" + codeDest + ", pays=" + paysD + ", nomDest=" + nomDest + '}';
    }
    
}
