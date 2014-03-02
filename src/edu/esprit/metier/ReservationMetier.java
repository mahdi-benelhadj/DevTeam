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
import java.util.ArrayList;
import java.util.List;
/**
 
 *
 * @author olfa
 */
public class ReservationMetier {
    public static void SupprimerReservation(int id)
    {
        List<Reservation> reservation= new ArrayList<Reservation>();
        ReservationDAO reservationDAO = new ReservationDAO();
        reservationDAO.deleteReservation(id);           
        reservation =reservationDAO.DisplayAllReservations();
           reservationDAO.deleteReservation(reservation.get(id).getId_reservation());
    }
    
    
    public static void ajout_reservation(Reservation r )
            
    {
            ReservationDAO reservationDao = new ReservationDAO();
            reservationDao.insertReservation(r);
        
    }
    
    
}
