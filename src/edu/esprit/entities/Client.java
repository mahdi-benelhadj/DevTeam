/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author GHADA
 */
public class Client {
     private int id_client;
    private String Nom;
    private String Prenom;
    private String email;
    private int age;
    private int NumTel;
    private String password;
    private String genre;

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
     public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
     public int getNumTel() {
        return NumTel;
    }

    public void setNumTel(int NumTel) {
        this.NumTel = NumTel;
    }
    public String getPassowrd() {
        return password;
    }

    public void setPassowrd(String password) {
        this.password = password;

 }
}



