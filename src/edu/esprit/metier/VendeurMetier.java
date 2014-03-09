/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;

import edu.esprit.dao.VendeurDAO;
import edu.esprit.entities.Vendeur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nour
 */
public class VendeurMetier {
     public static void SupprimerVendeur(int v){
           List<Vendeur> vendeurs = new ArrayList<Vendeur>();
           VendeurDAO vddao = new  VendeurDAO();
           vendeurs=vddao.DisplayAllVendeur();
           vddao.deleteVendeur(vendeurs.get(v).getId_vendeur());
    
}
     public static void updateNote(Vendeur v){
         VendeurDAO vendeurDAO = new VendeurDAO();
         Vendeur vendeur=new Vendeur();
         vendeur=vendeurDAO.findVendeurByNom(v.getNom());
         vendeur.setNote(v.getNote());
         vendeurDAO.updateVendeur(vendeur);
     }
     
}