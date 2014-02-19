/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author nour
 */
public class Vendeur {

    private int id_vendeur;
    private String nom;
    private String adresse;
    private int note;
    public int getId_vendeur() {
        return id_vendeur;
    }

    public void setId_vendeur(int id_vendeur) {
        this.id_vendeur = id_vendeur;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }



}
