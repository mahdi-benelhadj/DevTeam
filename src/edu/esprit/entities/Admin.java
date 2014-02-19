/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author GHADA
 */
public class Admin {
     private int id_admin;
    private String Login;
    private String password;

     public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }
     public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
      public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
