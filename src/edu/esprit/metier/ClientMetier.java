/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;
import edu.esprit.dao.ClientDAO;
import edu.esprit.entities.Client;
import edu.esprit.gui.InterfaceGestionDeal;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nour
 */
public class ClientMetier {
    public static void AjouterClient(Client c){
        ClientDAO clientDAO=new ClientDAO();
        clientDAO.insertClient(c);
        
    }
    public static void ConnexionClientMetier(Client c){
        
        InterfaceGestionDeal interfaceListeDeal=new InterfaceGestionDeal();
        ClientDAO clientDAO=new ClientDAO();
        if(clientDAO.findClientByEmail(c.getEmail()).getPassowrd().equals(c.getPassowrd())){
            
            interfaceListeDeal.setVisible(true);
            interfaceListeDeal.interClient(clientDAO.findClientByEmail(c.getEmail()));
        }
    }
    
    
    
     public static void RechercherClient(String cl) {
      ClientDAO cldao = new  ClientDAO();
      cldao.findClientByNom(cl);
    }
     
     public static void SupprimerClient(int c){
           List<Client> clients = new ArrayList<Client>();
           ClientDAO cldao = new  ClientDAO();
           clients=cldao.DisplayAllClients();
           cldao.deleteClient(clients.get(c).getId_client());
           
                 
}
}
