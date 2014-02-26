/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.tests;

import edu.esprit.dao.ClientDAO;
import edu.esprit.entities.Client;

/**
 *
 * @author GHADA
 */
public class TestAddClient {
    public static void main(String[] args) {
        Client c = new Client();
        ClientDAO clientDAO = new ClientDAO();
        c.setNom("Ghada");
        c.setPrenom("Souguir");
        c.setAge(22);
        c.setEmail("ghada.souguir@esprit.tn");
        c.setNumTel(152489);
        clientDAO.insertClient(c);
    }
    
}
