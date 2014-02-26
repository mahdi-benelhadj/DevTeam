/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;

import edu.esprit.dao.ClientDAO;
import edu.esprit.dao.DealDAO;
import edu.esprit.entities.Client;
import edu.esprit.entities.Deal;

/**
 *
 * @author Mahdi
 */
public class DealMetier {
    
    public static void AjouterDeal(Deal d){
        DealDAO dealDAO=new DealDAO();
        dealDAO.insertDeal(d);
        
    }
    
}
