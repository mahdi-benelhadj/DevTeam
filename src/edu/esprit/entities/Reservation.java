/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author GHADA
 */
public class Reservation {
     private int id_client;
      private int id_reservation;
       private int id_deal;
        private int qte;
        private int Total;
        private int valide;

         public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }
    public int getId_deal() {
        return id_deal;
    }

    public void setId_deal(int id_deal) {
        this.id_deal = id_deal;
    }
    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    public int getValide() {
        return valide;
    }

    public void setValide(int valide) {
        this.valide = valide;
    }
}
