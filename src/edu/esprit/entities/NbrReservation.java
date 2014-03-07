/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author Mahdi
 */
public class NbrReservation {
    private Deal deal;
    int n;
    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
           this.n=n;}
}
