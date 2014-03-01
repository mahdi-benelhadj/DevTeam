/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.gui;

import edu.esprit.entities.Client;
import edu.esprit.metier.ConnexionMetier;
import facebook.*;
/**
 *
 * @author Mahdi
 */
public class InterfaceConnexionClient extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceConnexionClient
     */
    public InterfaceConnexionClient() {
        initComponents();
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPasswd = new javax.swing.JTextField();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jButtonConnect = new javax.swing.JButton();
        jButtoninscription = new javax.swing.JButton();
        jButtonFb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mot de passe:");

        jTextFieldPasswd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldEmail1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonConnect.setText("Connexion");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jButtoninscription.setText("Inscription");
        jButtoninscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninscriptionActionPerformed(evt);
            }
        });

        jButtonFb.setText("Inscription FB");
        jButtonFb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addComponent(jTextFieldPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFb)
                .addGap(59, 59, 59)
                .addComponent(jButtoninscription)
                .addGap(35, 35, 35)
                .addComponent(jButtonConnect)
                .addGap(69, 69, 69))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(115, 115, 115)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConnect)
                    .addComponent(jButtoninscription)
                    .addComponent(jButtonFb))
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jTextFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoninscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninscriptionActionPerformed
        // TODO add your handling code here:
        InterfaceInscription inscriptionframe= new InterfaceInscription();
        inscriptionframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtoninscriptionActionPerformed

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        // TODO add your handling code here:
        Client client=new Client();
        client.setEmail(jTextFieldEmail1.getText());
        client.setPassowrd(jTextFieldPasswd.getText());
        ConnexionMetier.ConnexionClientMetier(client);
    }//GEN-LAST:event_jButtonConnectActionPerformed

    private void jButtonFbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFbActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jButtonFbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceConnexionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceConnexionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceConnexionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceConnexionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceConnexionClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButtonFb;
    private javax.swing.JButton jButtoninscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldPasswd;
    // End of variables declaration//GEN-END:variables
}
