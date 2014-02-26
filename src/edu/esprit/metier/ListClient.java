/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;

import edu.esprit.entities.Client;
import edu.esprit.dao.ClientDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;


/**
 *
 * @author Mahdy
 */
public class ListClient extends AbstractListModel{

    
    List<Client> clients = new ArrayList<Client>();
    public ListClient() {

    ClientDAO clientDAO=new ClientDAO();
    clients=clientDAO.DisplayAllClients();
    
    }
    


     @Override
    public int getSize() {
        return clients.size();
    }

    @Override
    public Object getElementAt(int index) {
        return clients.get(index).getNom();
    }


}
