/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.gui;


import edu.esprit.dao.DealDAO;
import edu.esprit.entities.Deal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.xml.bind.annotation.XmlElement.DEFAULT;

/**
 *
 * @author Karray
 */
public class DealTableModel extends AbstractTableModel{

    List<Deal> maliste = new ArrayList<Deal>();
    String []header = {"titre","details","Categorie","Duree"};

    public DealTableModel() {
       
        maliste=new DealDAO().DisplayAllDeals();
    }
  public DealTableModel(String title) {
       DealDAO dealDAO = new DealDAO();
        maliste.add(dealDAO.findDealByTitre(title));
    }

    public int getRowCount() {
        return maliste.size();
    }

    public int getColumnCount() {
       return header.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
               
        case 0:
                return maliste.get(rowIndex).getTitre();
            case 1:
                return maliste.get(rowIndex).getDetails();
            case 2 :
                return maliste.get(rowIndex).getPrix();
            case 3 :
                return maliste.get(rowIndex).getPrix_promo();
            case 4 :   
                return maliste.get(rowIndex).getCategorie();
                
            case 5:
                return maliste.get(rowIndex).getDate();
            case 6 :
                return maliste.get(rowIndex).getDuree();
            case 7 :
                return maliste.get(rowIndex).getNbr_min();
            case 8 :
                return maliste.get(rowIndex).getNbr_max();
            case 9 :
                return maliste.get(rowIndex).getVendeur() ;
                
            default:
                throw new IllegalArgumentException();
        }



    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }





}
