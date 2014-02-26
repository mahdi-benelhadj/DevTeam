/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.dao;
import edu.esprit.entities.Reservation;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GHADA
 */
public class ReservationDAO {
     public void insertReservation(Reservation  r){

        String requete = "insert into reservation (id_client,id_deal,qte,Total,valide) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           ps.setInt(1, r.getClient().getId_client());
            ps.setInt(1, r.getDeal().getId_deal());
             ps.setInt(3, r.getQte());
            ps.setInt(4, r.getTotal());
            ps.setInt(5, r.getValide());
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }

}

         public void deleteReservation(int id){
        String requete = "delete from reservation where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Reservation supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
          public Reservation findReservationById(int id){
    Reservation reserv = new Reservation();
     String requete = "select * from reservation where id_admin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            ClientDAO clientDAO=new ClientDAO();
            DealDAO dealDAO=new DealDAO();
            while (resultat.next())
            {
                reserv.setId_reservation(resultat.getInt(1));
                reserv.setClient(clientDAO.findClientById(resultat.getInt(2)));
                reserv.setDeal(dealDAO.findDealById(resultat.getInt(3)));
                reserv.setQte(resultat.getInt(4));
                reserv.setTotal(resultat.getInt(5));
                reserv.setValide(resultat.getInt(6));

            }
            return reserv;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
         public List<Reservation> DisplayAllReservations (){


        List<Reservation> listereservations = new ArrayList<Reservation>();

        String requete = "select * from reservation";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ClientDAO clientDAO=new ClientDAO();
            DealDAO dealDAO=new DealDAO();
            while(resultat.next()){
                Reservation reserv =new Reservation();
                reserv.setId_reservation(resultat.getInt(1));
                reserv.setClient(clientDAO.findClientById(resultat.getInt(2)));
                reserv.setDeal(dealDAO.findDealById(resultat.getInt(3)));
                reserv.setQte(resultat.getInt(4));
                    reserv.setTotal(resultat.getInt(5));
                reserv.setValide(resultat.getInt(6));
                

                listereservations.add(reserv);
            }
            return listereservations;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }



}
