/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;
import edu.esprit.dao.ClientDAO;
import edu.esprit.entities.Client;

/**
 *
 * @author nour
 */
public class ClientMetier {
     public static void RechercherClient(String cl) {
      ClientDAO cldao = new  ClientDAO();
      cldao.findClientByNom(cl);
    }
    
}
