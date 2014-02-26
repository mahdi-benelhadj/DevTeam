/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.tests;

import edu.esprit.dao.CategorieDAO;
import edu.esprit.entities.Categorie;

/**
 *
 * @author Karray
 */
public class TestAddCategorie {


    public static void main(String[] args) {
        Categorie cat = new Categorie();
        CategorieDAO catDAO = new CategorieDAO();
        cat.setCategorie("La Soukra");
        catDAO.insertCategorie(cat);
    }
}
