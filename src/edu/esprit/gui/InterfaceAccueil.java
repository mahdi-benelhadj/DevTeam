/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InterfaceAccueil.java
 *
 * Created on 17 févr. 2014, 23:26:26
 */

package edu.esprit.gui;

/**
 *
 * @author olfa
 */
public class InterfaceAccueil extends javax.swing.JFrame {

    /** Creates new form InterfaceAccueil */
    public InterfaceAccueil() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAjouterDeal = new javax.swing.JButton();
        jButtonAjouterCategorie = new javax.swing.JButton();
        jButtonAGestionDeals = new javax.swing.JButton();
        jButtonGenererStatistique = new javax.swing.JButton();
        jButtonGenererRapport = new javax.swing.JButton();
        jButtonAjouterVendeur = new javax.swing.JButton();
        jButtonGestionClient = new javax.swing.JButton();
        jButtonEnvoyerVoucher = new javax.swing.JButton();
        jButtonAfficherReservation = new javax.swing.JButton();
        jToggleButtonRetour = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "acceuil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 18), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonAjouterDeal.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonAjouterDeal.setForeground(new java.awt.Color(0, 102, 153));
        jButtonAjouterDeal.setText("Ajouter Deal");
        jButtonAjouterDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterDealActionPerformed(evt);
            }
        });

        jButtonAjouterCategorie.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonAjouterCategorie.setForeground(new java.awt.Color(0, 102, 153));
        jButtonAjouterCategorie.setText("Ajouter Catégorie");
        jButtonAjouterCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterCategorieActionPerformed(evt);
            }
        });

        jButtonAGestionDeals.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonAGestionDeals.setForeground(new java.awt.Color(0, 102, 153));
        jButtonAGestionDeals.setText("Gestion des deals");
        jButtonAGestionDeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAGestionDealsActionPerformed(evt);
            }
        });

        jButtonGenererStatistique.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonGenererStatistique.setForeground(new java.awt.Color(0, 102, 153));
        jButtonGenererStatistique.setText("Générer Statistique");
        jButtonGenererStatistique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenererStatistiqueActionPerformed(evt);
            }
        });

        jButtonGenererRapport.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonGenererRapport.setForeground(new java.awt.Color(0, 102, 153));
        jButtonGenererRapport.setText("Générer Rapport");
        jButtonGenererRapport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenererRapportActionPerformed(evt);
            }
        });

        jButtonAjouterVendeur.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonAjouterVendeur.setForeground(new java.awt.Color(0, 102, 153));
        jButtonAjouterVendeur.setText("Gestion des Vendeurs");
        jButtonAjouterVendeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterVendeurActionPerformed(evt);
            }
        });

        jButtonGestionClient.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonGestionClient.setForeground(new java.awt.Color(0, 102, 153));
        jButtonGestionClient.setText("Gestion des clients");
        jButtonGestionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionClientActionPerformed(evt);
            }
        });

        jButtonEnvoyerVoucher.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonEnvoyerVoucher.setForeground(new java.awt.Color(0, 102, 153));
        jButtonEnvoyerVoucher.setText("Envoyer Voucher");
        jButtonEnvoyerVoucher.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEnvoyerVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnvoyerVoucherActionPerformed(evt);
            }
        });

        jButtonAfficherReservation.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonAfficherReservation.setForeground(new java.awt.Color(0, 102, 153));
        jButtonAfficherReservation.setText("Reservations");
        jButtonAfficherReservation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAfficherReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAfficherReservationActionPerformed(evt);
            }
        });

        jToggleButtonRetour.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jToggleButtonRetour.setForeground(new java.awt.Color(0, 102, 153));
        jToggleButtonRetour.setText("Deconnexion");
        jToggleButtonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAjouterVendeur, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGestionClient, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGenererStatistique, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenererRapport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jToggleButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jButtonEnvoyerVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButtonAfficherReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAjouterDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAjouterCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAGestionDeals, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonAjouterDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonAjouterCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonAGestionDeals, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGenererStatistique, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGestionClient, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjouterVendeur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenererRapport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEnvoyerVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAfficherReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAjouterDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterDealActionPerformed
        // TODO add your handling code here:
        InterfaceAjoutDeal ajoutDeal=new InterfaceAjoutDeal();
        ajoutDeal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAjouterDealActionPerformed

    private void jButtonAfficherReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAfficherReservationActionPerformed
        // TODO add your handling code here:
        InterfaceGestionReservation f1 = new InterfaceGestionReservation();
        f1.setVisible(true); //afficher l'interface
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAfficherReservationActionPerformed

    private void jButtonAGestionDealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAGestionDealsActionPerformed
        // TODO add your handling code here:
        InterfaceListerDeal gestionDeal=new InterfaceListerDeal();
        gestionDeal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAGestionDealsActionPerformed

    private void jButtonAjouterCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterCategorieActionPerformed
        // TODO add your handling code here:
        InterfaceAjoutCatégorie ajoutCatégorie=new InterfaceAjoutCatégorie();
        ajoutCatégorie.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAjouterCategorieActionPerformed

    private void jButtonGestionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionClientActionPerformed
        // TODO add your handling code here:
        InterfaceGestionClients gestionClient=new InterfaceGestionClients();
        gestionClient.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonGestionClientActionPerformed

    private void jButtonEnvoyerVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnvoyerVoucherActionPerformed
        // TODO add your handling code here:
         InterfaceEnvoyerVoucher envoyervoucher=new InterfaceEnvoyerVoucher();
        envoyervoucher.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonEnvoyerVoucherActionPerformed

    private void jButtonAjouterVendeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterVendeurActionPerformed
        // TODO add your handling code here:
        InterfaceGestionVendeurs gestionvendeur=new InterfaceGestionVendeurs();
        gestionvendeur.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAjouterVendeurActionPerformed

    private void jToggleButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRetourActionPerformed
        // TODO add your handling code here:
         InterfaceChoixDeConnexion choixConn=new InterfaceChoixDeConnexion();
        choixConn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButtonRetourActionPerformed

    private void jButtonGenererStatistiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenererStatistiqueActionPerformed
        // TODO add your handling code here:
        InterfaceStatistiques stat = new InterfaceStatistiques();
        stat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGenererStatistiqueActionPerformed

    private void jButtonGenererRapportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenererRapportActionPerformed
        // TODO add your handling code here:
        InetrfaceGenererRapport genererrapport = new InetrfaceGenererRapport();
        genererrapport.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGenererRapportActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAGestionDeals;
    private javax.swing.JButton jButtonAfficherReservation;
    private javax.swing.JButton jButtonAjouterCategorie;
    private javax.swing.JButton jButtonAjouterDeal;
    private javax.swing.JButton jButtonAjouterVendeur;
    private javax.swing.JButton jButtonEnvoyerVoucher;
    private javax.swing.JButton jButtonGenererRapport;
    private javax.swing.JButton jButtonGenererStatistique;
    private javax.swing.JButton jButtonGestionClient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButtonRetour;
    // End of variables declaration//GEN-END:variables

}
