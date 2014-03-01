/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;

/**
 *
 * @author olfa
 */
import edu.esprit.dao.ReservationDAO;
import edu.esprit.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Houssem Eddine
 */
public class MyTableReservation extends AbstractTableModel
   {

    List<Reservation> listReservation = new ArrayList<Reservation>();
    String []header = {"id_reservation","id_client","id_deal","quantité","total","valide"};
    
   //remplissage de la liste des Réservations
    public MyTableReservation() { 
        ReservationDAO reservationDAO = new  ReservationDAO();
        listReservation=reservationDAO.DisplayAllReservations();
    }
    
    //Nombre de lignes de la table
    public int getRowCount() { 
        return listReservation.size();
    }
    
   //Nombre de colonnes de la table
    public int getColumnCount() { 
        return header.length;
    }

    //Récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        // Parcour par colonne
        switch (columnIndex) {
            //colonne id_reservation
            case 0:
                return listReservation.get(rowIndex).getId_reservation();
           //colonne id_client
            case 1:
                return listReservation.get(rowIndex).getClient().getPrenom();
          //colonne id_deal
            case 2:
                return listReservation.get(rowIndex).getDeal().getTitre();
          //colonne quantité
            case 3:
                return listReservation.get(rowIndex).getQte();
          //colonne Total
            case 4:
                return listReservation.get(rowIndex).getTotal();
          //colonne Valide
            case 5:
                return listReservation.get(rowIndex).getValide();
            default:
                return null;
        }
    }

    
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

}

    
    

