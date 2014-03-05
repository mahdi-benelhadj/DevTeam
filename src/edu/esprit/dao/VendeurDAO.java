/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.dao;
import edu.esprit.entities.Vendeur;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;



/**
 *
 * @author nour
 */
public class VendeurDAO {
    
     public void insertVendeur(Vendeur v){

        String requete = "insert into vendeur (nom,adresse,note) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, v.getNom());
            ps.setString(2, v.getAdresse());

            ps.setInt(3, v.getNote());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            showMessageDialog(null, "Ajout effectuée avec succès!");
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
      public void deleteVendeur(int id){
        String requete = "delete from deal where id_vendeur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("vendeur supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }

}
      public Vendeur findVendeurById(int id){
    Vendeur vendeur = new Vendeur();
     String requete = "select * from vendeur where id_vendeur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                vendeur.setId_vendeur(resultat.getInt(1));
                vendeur.setNom(resultat.getString(2));
                vendeur.setAdresse(resultat.getString(3));
                vendeur.setNote(resultat.getInt(4));




            }
            return vendeur;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du vendeur "+ex.getMessage());
            return null;
        }
    }
      
      public Vendeur findVendeurByVendeur(String nom){
    Vendeur vendeur = new Vendeur();
     String requete = "select * from vendeur where nom=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                vendeur.setId_vendeur(resultat.getInt(1));
                vendeur.setNom(resultat.getString(2));
                vendeur.setAdresse(resultat.getString(3));
                vendeur.setNote(resultat.getInt(4));




            }
            return vendeur;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du vendeur "+ex.getMessage());
            return null;
        }
    }
       public void updateVendeur(Vendeur v){
        String requete = "update  set nom=?,adresse=?, note=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, v.getNom());

            ps.setString(2, v.getAdresse());
            ps.setInt(3, v.getNote());
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {

           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
       public List<Vendeur> DisplayAllVendeur (){


        List<Vendeur> listevendeur = new ArrayList<Vendeur>();

        String requete = "select * from vendeur";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
           // dealDAO dealDAO = new dealDAO();
            while(resultat.next()){
                Vendeur vendeur =new Vendeur();
                vendeur.setId_vendeur(resultat.getInt(1));
                 vendeur.setNom(resultat.getString(2));
                vendeur.setAdresse(resultat.getString(3));
                vendeur.setNote(resultat.getInt(4));




                listevendeur.add(vendeur);
            }
            return listevendeur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des vendeurs "+ex.getMessage());
            return null;
        }
}


}
