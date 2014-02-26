/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;
import edu.esprit.dao.ReservationDAO;
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
    
}
