/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.metier;

import edu.esprit.dao.AdminDAO;
import edu.esprit.entities.Admin;
import edu.esprit.gui.InterfaceAccueil;
import edu.esprit.dao.ClientDAO;
import edu.esprit.entities.Client;
import edu.esprit.gui.InterfaceListeDeal;
/**
 *
 * @author Mahdi
 */
public class ConnexionMetier {
    public static void ConnexionVerif(Admin admin){
        AdminDAO adminDAO=new AdminDAO();
        InterfaceAccueil acceuilframe =new InterfaceAccueil();
        System.out.println(adminDAO.findAdminByLogin(admin.getLogin()).getPassword());
        if(adminDAO.findAdminByLogin(admin.getLogin()).getPassword().equals(admin.getPassword()))
        {
            System.out.println("test");
        acceuilframe.setVisible(true);
            System.out.println("test2");
        }
        else
            System.out.println("erreur");
    }
    public static void ConnexionClientMetier(Client c){
        
        InterfaceListeDeal interfaceListeDeal=new InterfaceListeDeal();
        ClientDAO clientDAO=new ClientDAO();
        if(clientDAO.findClientByEmail(c.getEmail()).getPassowrd().equals(c.getPassowrd())){
            interfaceListeDeal.setVisible(true);
        }
    }
}
