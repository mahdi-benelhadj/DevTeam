/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.util.*;


/**
 *
 * @author nour
 */
public class Deal {
     private int id_deal;
    private int id_vendeur;
    private int id_categorie;
    private int nbr_min;
    private int nbr_max;
    private String titre;
    private String details;
    private int prix;
    private int prix_promo;
    private Date date;
    private int duree;


    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

 public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrix_promo() {
        return prix_promo;
    }

    public void setPrix_promo(int prix_promo) {
        this.prix_promo = prix_promo;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }


     public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

     public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }



     public int getId_deal() {
        return id_deal;
    }

    public void setId_deal(int id_deal) {
        this.id_deal = id_deal;
    }
     public int getId_vendeur() {
        return id_vendeur;
    }

    public void setId_vendeur(int id_vendeur) {
        this.id_vendeur = id_vendeur;
    }
     public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }
     public int getNbr_min() {
        return nbr_min;
    }

    public void setNbr_min(int nbr_min) {
        this.nbr_min = nbr_min;
    }
     public int getNbr_max() {
        return nbr_max;
    }

    public void setNbr_max(int nbr_max) {
        this.nbr_max = nbr_max;
    }
    

}
