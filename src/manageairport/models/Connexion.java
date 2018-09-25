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
public class Connexion {
    private String login;
    private String action;
    private Date date;

    public Connexion(String login, String action, Date date) {
        this.login = login;
        this.action = action;
        this.date = date;
    }

    public Connexion() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
