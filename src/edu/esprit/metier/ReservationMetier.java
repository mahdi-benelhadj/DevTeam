/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;
import edu.esprit.dao.ClientDAO;
import edu.esprit.dao.DealDAO;
import edu.esprit.dao.ReservationDAO;

import edu.esprit.entities.Reservation;
import edu.esprit.gui.InterfaceAjouterRéservation ;
/**
 
 *
 * @author olfa
 */
public class ReservationMetier {
    public static void SupprimerReservation(int id)
    {
        ReservationDAO reservationDAO = new ReservationDAO();
        reservationDAO.deleteReservation(id);
    
    
    
        
    
    }
    
    
    public void ajout_reservation(Reservation r )
            
    {
        ReservationDAO re = new ReservationDAO();   
         re.insertReservation(r);        
    }
    
    
}
