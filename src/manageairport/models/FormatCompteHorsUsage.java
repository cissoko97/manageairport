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
public class FormatCompteHorsUsage {
    
    private String loginSupprime;
    private String loginDesactive;
    private Date dateSupp;
    private Date dateDesac;

    public FormatCompteHorsUsage(String loginSupprime, String loginDesactive, Date dateSupp, Date dateDesac) {
        this.loginSupprime = loginSupprime;
        this.loginDesactive = loginDesactive;
        this.dateSupp = dateSupp;
        this.dateDesac = dateDesac;
    }

    public String getLoginSupprime() {
        return loginSupprime;
    }

    public void setLoginSupprime(String loginSupprime) {
        this.loginSupprime = loginSupprime;
    }

    public String getLoginDesactive() {
        return loginDesactive;
    }

    public void setLoginDesactive(String loginDesactive) {
        this.loginDesactive = loginDesactive;
    }

    public Date getDateSupp() {
        return dateSupp;
    }

    public void setDateSupp(Date dateSupp) {
        this.dateSupp = dateSupp;
    }

    public Date getDateDesac() {
        return dateDesac;
    }

    public void setDateDesac(Date dateDesac) {
        this.dateDesac = dateDesac;
    }
    
    
    
}
