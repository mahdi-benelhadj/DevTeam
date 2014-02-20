/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.dao;
import edu.esprit.entities.Deal;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author nour
 */
public class DealDAO {
    
     public void insertDeal(Deal d){

        String requete = "insert into deal (id_vendeur,id_categorie,nbr_min,nbr_max,titre,details,prix,prix_promo,date,duree) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getVendeur().getId_vendeur());
            ps.setInt(2, d.getCategorie().getId_categorie());
            ps.setInt(3, d.getNbr_min());
            ps.setInt(4, d.getNbr_max());
            ps.setString(5, d.getDetails());
            ps.setString(6, d.getTitre());
              ps.setInt(7, d.getPrix());
              ps.setInt(8, d.getPrix_promo());
                ps.setDate(9, (java.sql.Date) d.getDate());
                 ps.setInt(10,d.getDuree());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

      public void deleteDeal(int id){
        String requete = "delete from deal where id_deal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("deal supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }

}
       public void updateStock(Deal d){
        String requete = "update  set id_vendeur=?,id_categorie=?, nbr_min=?, nbr_max=?,prix=?,prix_promo=?,titre=?,details=?,date=?,duree=? where id_deal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getVendeur().getId_vendeur());

            ps.setInt(2, d.getCategorie().getId_categorie());
            ps.setInt(3, d.getNbr_min());
            ps.setInt(4, d.getNbr_max());
            ps.setString(5, d.getDetails());
            ps.setString(6, d.getTitre());
              ps.setInt(7, d.getPrix());
              ps.setInt(8, d.getPrix_promo());
                ps.setDate(9, (java.sql.Date) d.getDate());
                 ps.setInt(10,d.getDuree());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {

           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
       public Deal findDealById(int id){
    
     String requete = "select * from deal where id_deal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            Deal deal = new Deal();
            VendeurDAO vendeurDAO=new VendeurDAO();
            CategorieDAO categorieDAO=new CategorieDAO();
            while (resultat.next())
            {
                deal.setId_deal(resultat.getInt(1));
                
                deal.setVendeur(vendeurDAO.findVendeurById(resultat.getInt(2)));
                deal.setCategorie(categorieDAO.findCategorieById(resultat.getInt(3)));
                deal.setPrix(resultat.getInt(4));
                deal.setPrix_promo(resultat.getInt(5));
                deal.setNbr_min(resultat.getInt(6));
                deal.setNbr_max(resultat.getInt(7));
                deal.setTitre(resultat.getString(8));
                deal.setDetails(resultat.getString(9));
                deal.setDate(resultat.getDate(10));
                deal.setDuree(resultat.getInt(11));

            }
            return deal;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du deal "+ex.getMessage());
            return null;
        }
    }
      public Deal findDealByIdCategorie(int id){
    
     String requete = "select * from depot where id_categorie = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            Deal deal = new Deal();
            VendeurDAO vendeurDAO=new VendeurDAO();
            CategorieDAO categorieDAO=new CategorieDAO();
            while (resultat.next())
            {
                deal.setId_deal(resultat.getInt(1));
                System.out.println("testttttttt"+deal.getId_deal());
                 deal.setVendeur(vendeurDAO.findVendeurById(resultat.getInt(2)));
                System.out.println("testttttttt"+deal.getVendeur().getId_vendeur());
                 deal.setCategorie(categorieDAO.findCategorieById(resultat.getInt(3)));
                System.out.println("testttttttt"+deal.getCategorie().getId_categorie());
                 deal.setNbr_min(resultat.getInt(4));
                System.out.println("testttttttt"+deal.getNbr_min());
                deal.setNbr_max(resultat.getInt(5));
                System.out.println("testttttttt"+deal.getNbr_max());
                deal.setPrix(resultat.getInt(6));
                System.out.println("testttttttt"+deal.getPrix());
                deal.setPrix_promo(resultat.getInt(7));
                System.out.println("testttttttt"+deal.getPrix_promo());

                deal.setTitre(resultat.getString(8));
                System.out.println(resultat.getString(8));
                deal.setDetails(resultat.getString(9));
                System.out.println(resultat.getString(9));
                deal.setDate(resultat.getDate(10));
                System.out.println(resultat.getDate(10));
                deal.setDuree(resultat.getInt(11));
                System.out.println(resultat.getInt(11));

            
            }
            return deal;

        }
            catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du deal "+ex.getMessage());
            return null;
        }
    }
        public List<Deal> DisplayAllDeals (){


        List<Deal> listedeals = new ArrayList<Deal>();

        String requete = "select * from deal";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            VendeurDAO vendeurDAO=new VendeurDAO();
            CategorieDAO categorieDAO=new CategorieDAO();
            while(resultat.next()){
                Deal deal =new Deal();
                deal.setId_deal(resultat.getInt(1));

                deal.setVendeur(vendeurDAO.findVendeurById(resultat.getInt(2)));
                deal.setCategorie(categorieDAO.findCategorieById(resultat.getInt(3)));
                deal.setPrix(resultat.getInt(4));
                deal.setPrix_promo(resultat.getInt(5));
                deal.setNbr_min(resultat.getInt(6));
                deal.setNbr_max(resultat.getInt(7));
                deal.setTitre(resultat.getString(8));
                deal.setDetails(resultat.getString(9));
                deal.setDate(resultat.getDate(10));
                deal.setDuree(resultat.getInt(11));

                listedeals.add(deal);
            }
            return listedeals;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des deals "+ex.getMessage());
            return null;
        }
}
}
