/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;

import edu.esprit.dao.CategorieDAO;
import edu.esprit.entities.Categorie;

/**
 *
 * @author nour
 */
public class CategorieMetier {
    public CategorieMetier()
    {
    
    }
   public static void ajouterCategorie(Categorie c) {
      CategorieDAO cdao = new  CategorieDAO();
      cdao.insertCategorie(c);
    }
    
}
