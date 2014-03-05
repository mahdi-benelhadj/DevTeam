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
import javax.swing.AbstractListModel;

/**
 *
 * @author nour
 */
public class ListVendeur extends AbstractListModel{
    
    

    
    List<Vendeur> vendeurs = new ArrayList<Vendeur>();
    public ListVendeur() {

    VendeurDAO vendeurDAO=new VendeurDAO();
    vendeurs=vendeurDAO.DisplayAllVendeur();
    
    }
    


     @Override
    public int getSize() {
        return vendeurs.size();
    }

    @Override
    public Object getElementAt(int index) {
        return vendeurs.get(index).getNom();
    }
    }


