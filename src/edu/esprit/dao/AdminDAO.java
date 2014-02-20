/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.dao;


import edu.esprit.entities.Admin;
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
public class AdminDAO {
     public void insertAdmin(Admin a){

        String requete = "insert into admin (Login,password) values (?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, a.getLogin());
            ps.setString(2, a.getPassword());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }

}
     
         public void deleteAdmin(int id){
        String requete = "delete from admin where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Admin supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
          public Admin findAdminById(int id){
    Admin admin = new Admin();
     String requete = "select * from admin where id_admin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                admin.setId_admin(resultat.getInt(1));
                admin.setLogin(resultat.getString(2));
                admin.setPassword(resultat.getString(3));
            }
            return admin;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
                    public Admin findAdminByLogin(String Login){
    Admin admin = new Admin();
     String requete = "select * from admin where id_admin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, Login);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                admin.setId_admin(resultat.getInt(1));
                admin.setLogin(resultat.getString(2));
                admin.setPassword(resultat.getString(3));
            }
            return admin;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
         public List<Admin> DisplayAllAdmins (){


        List<Admin> listeadmins = new ArrayList<Admin>();

        String requete = "select * from admin";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Admin admin =new Admin();
                admin.setId_admin(resultat.getInt(1));
                admin.setLogin(resultat.getString(2));
                admin.setPassword(resultat.getString(3));

                listeadmins.add(admin);
            }
            return listeadmins;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
}
