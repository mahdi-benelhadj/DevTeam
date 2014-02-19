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
public class TestAddDepot {
int i;

    public static void main(String[] args) {
        Categorie cat = new Categorie();
        CategorieDAO depotDAO = new CategorieDAO();
        cat.setCategorie("La Soukra");
        depotDAO.insertCategorie(cat);
    }
}
