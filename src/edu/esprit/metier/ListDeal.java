/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;

import edu.esprit.dao.DealDAO;
import edu.esprit.entities.Deal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author nour
 */
public class ListDeal extends AbstractListModel{
     List<Deal> deals = new ArrayList<Deal>();
    public ListDeal() {

    DealDAO dealDAO=new DealDAO();
    deals=dealDAO.DisplayAllDeals();
    
    }

    @Override
    public int getSize() {
        return deals.size();
    }

    @Override
    public Object getElementAt(int index) {
       
        return deals.get(index).getTitre();
    }
    
    
    
}
