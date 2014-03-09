/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.dao;
import edu.esprit.entities.Categorie;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nour
 */
public class CategorieDAO {
    
     public void insertCategorie(Categorie c){

        String requete = "insert into categorie(categorie) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getCategorie());
           



            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            JOptionPane.showMessageDialog(null, "Ajout effectuée avec succès");        } 
        catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur lors de l'insertion "+ex.getMessage());
            
        }
    }
     
      
       public Categorie findCategorieById(int id){
    Categorie categorie = new Categorie();
     String requete = "select * from categorie where id_categorie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                categorie.setId_categorie(resultat.getInt(1));
                categorie.setCategorie(resultat.getString(2));

            }
            return categorie;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de la categorie "+ex.getMessage());
            return null;
        }
    }
        public Categorie findCategorieByNom(String ctg){
    Categorie categorie = new Categorie();
     String requete = "select * from categorie where categorie = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ctg);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {

                categorie.setId_categorie(resultat.getInt(1));
                System.out.println("testttttttt"+categorie.getId_categorie());

                categorie.setCategorie(resultat.getString(2));
                System.out.println(resultat.getString(2));



            }
            return categorie;

        }
            catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de la categorie "+ex.getMessage());
            return null;
        }
    }
       public List<Categorie> DisplayAllCategorie (){


        List<Categorie> listecategorie = new ArrayList<Categorie>();

        String requete = "select * from categorie";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
           // dealDAO dealDAO = new dealDAO();
            while(resultat.next()){
                Categorie categorie=new Categorie();
                categorie.setId_categorie(resultat.getInt(1));
                 categorie.setCategorie(resultat.getString(2));
                




                listecategorie.add(categorie);
            }
            return listecategorie;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des vendeurs "+ex.getMessage());
            return null;
        }
}


}
