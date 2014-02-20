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
     private Client client;
      private int id_reservation;
       private Deal deal;
        private int qte;
        private int Total;
        private int valide;

         public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }
    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
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
