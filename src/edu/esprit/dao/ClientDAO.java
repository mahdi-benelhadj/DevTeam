/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.dao;
import edu.esprit.entities.Client;
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
public class ClientDAO {

    public void insertClient(Client c){


        String requete = "insert into client(Nom,Prenom,email,age,genre,NumTel,password) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom());
             ps.setString(2, c.getPrenom());
            ps.setString(3, c.getEmail());
             ps.setInt(4, c.getAge());
             ps.setString(5, c.getGenre());
            ps.setInt(6, c.getNumTel());
            ps.setString(7, c.getPassowrd());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


   

    public void deleteClient(int id){
        String requete = "delete from client where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Client supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Client findClientById(int id){
    Client client = new Client();
     String requete = "select * from client where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                client.setId_client(resultat.getInt(1));
               client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setAge(resultat.getInt(4));
                client.setPassowrd(resultat.getString(5));
                client.setEmail(resultat.getString(6));
                client.setGenre(resultat.getString(7));
            }
            return client;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
     public void updateClient(Client c){
        String requete = "update client set NumTel=? , set email=? ,set password=? where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setInt(3, c.getId_client());
            ps.setInt(4, c.getNumTel());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getPassowrd());
            ps.setString(7, c.getGenre());
             ps.setInt(8, c.getAge());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    
    

    public List<Client> DisplayAllClients (){


        List<Client> listeclients = new ArrayList<Client>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Client client =new Client();
               
                client.setId_client(resultat.getInt(1));
               client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setAge(resultat.getInt(4));
                client.setPassowrd(resultat.getString(5));
                client.setEmail(resultat.getString(6));
                client.setGenre(resultat.getString(7));

                listeclients.add(client);
            }
            return listeclients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
    
    
    
    
    
    
    
    public class InternauteDao
{

    
    
    }

}
