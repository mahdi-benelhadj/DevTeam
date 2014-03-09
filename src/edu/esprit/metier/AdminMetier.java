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
import edu.esprit.gui.InterfaceGestionDeal;
/**
 *
 * @author Mahdi
 */
public class AdminMetier {
    public static void ConnexionAdmin(Admin admin){
        AdminDAO adminDAO=new AdminDAO();

        System.out.println(adminDAO.findAdminByLogin(admin.getLogin()).getPassword());
        if(adminDAO.findAdminByLogin(admin.getLogin()).getPassword().equals(admin.getPassword()))
        {
            InterfaceAccueil accueil=new InterfaceAccueil();
            accueil.setVisible(true);
        }
        else
            System.out.println("erreur");
        

    
    }
    
}
