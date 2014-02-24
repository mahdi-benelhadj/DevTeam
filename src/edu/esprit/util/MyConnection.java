/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahdi
 */
public class MyConnection {

     private static final  String driver = "com.mysql.jdbc.Driver";
   private    String url ;
   private    String login ;
   private    String pwd ;
   private static Connection con;


   private MyConnection(){

   }

   public Connection etablirConnection(){
        try {
            Properties prop=new Properties();
            prop.load(MyConnection.class.getResourceAsStream("/config.roperties"));
            Class.forName(driver);
            url = prop.getProperty("url");
  login = prop.getProperty("login");
  pwd = prop.getProperty("pwd");
            con = DriverManager.getConnection(url,login,pwd);
            System.out.println("Connexion établie");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur de chargement de driver"+ex.getMessage());
        } catch (SQLException ex){
            System.out.println("probleme d'etablissement de connection"+ex.getMessage());
        } catch (IOException ex) {
             Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
         }

        return con;
    }
   
 /*    public static  Connection etablirConnection2(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,login,pwd);
            System.out.println("Connexion établie");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur de chargement de driver"+ex.getMessage());
        } catch (SQLException ex){
            System.out.println("probleme d'etablissement de connection"+ex.getMessage());
        }

        return con;
    }*/
   public static Connection getInstance(){
       if (con==null){
           new MyConnection().etablirConnection();
       }
   return con;
   }
}
