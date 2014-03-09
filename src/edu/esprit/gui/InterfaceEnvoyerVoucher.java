/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.gui;


import edu.esprit.metier.Mail;
import edu.esprit.metier.MailConstruction;
import edu.esprit.dao.ClientDAO;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFileChooser;
/**
 *
 * @author olfa
 */
public class InterfaceEnvoyerVoucher extends javax.swing.JFrame {
 URL url;
    Mail mail = new Mail();
    /**
     * Creates new form InterfaceSupprimerClient
     */
    public InterfaceEnvoyerVoucher() {
        
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxClient = new javax.swing.JComboBox();
        client1 = new javax.swing.JLabel();
        iComboBoxDeal = new javax.swing.JComboBox();
        deal1 = new javax.swing.JLabel();
        jToggleRetour = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabelPiecteJointe = new javax.swing.JLabel();
        jButtonValider = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "envoyer voucher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 18), new java.awt.Color(0, 102, 153))); // NOI18N

        jComboBoxClient.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jComboBoxClient.setForeground(new java.awt.Color(0, 102, 153));
        jComboBoxClient.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Client 1", "Client 2", "Client 3", "Client 4" }));
        jComboBoxClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClientActionPerformed(evt);
            }
        });

        client1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        client1.setForeground(new java.awt.Color(0, 102, 153));
        client1.setText("Client");

        iComboBoxDeal.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        iComboBoxDeal.setForeground(new java.awt.Color(0, 102, 153));
        iComboBoxDeal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deal1", "Deal 2", "Deal 3", "Deal 4" }));

        deal1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        deal1.setForeground(new java.awt.Color(0, 102, 153));
        deal1.setText("Deal");

        jToggleRetour.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jToggleRetour.setForeground(new java.awt.Color(0, 102, 153));
        jToggleRetour.setText("retour");
        jToggleRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleRetourActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("Choose File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelPiecteJointe.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabelPiecteJointe.setForeground(new java.awt.Color(0, 102, 153));
        jLabelPiecteJointe.setText("piece jointe");

        jButtonValider.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonValider.setForeground(new java.awt.Color(0, 102, 153));
        jButtonValider.setText("Envoyer");
        jButtonValider.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jButtonAnnuler.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButtonAnnuler.setForeground(new java.awt.Color(0, 102, 153));
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(client1)
                    .addComponent(deal1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleRetour)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iComboBoxDeal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxClient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPiecteJointe, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAnnuler, jButtonValider});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(client1)
                    .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iComboBoxDeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPiecteJointe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAnnuler, jButtonValider});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        // TODO add your handling code here:
        ClientDAO clientDAO =new ClientDAO();
        mail.setMailAddressRecipient("mahdi.benelhadj@gmail.com");
        // mail.setMailAddressRecipient(clientDAO.findClientByNom(jComboBoxClient.getSelectedItem().toString()).getEmail());
        
        mail.getPwd();
        mail.getMailAddressSender();
        mail.getMailObject();
        
        
        //System.out.println(jTextArearObject.getToolTipText());
        
        MailConstruction mc = new MailConstruction();
        mc.getMailProperties();
        
        String s = this.cleanUrl(url);
        mc.getMailMessage(s, mail);
        mc.SendMessage();
        
        
       
        
        
    }
        public String cleanUrl(URL url){
        
        String s = url.toString();
        System.out.println("Before Clean");
        System.out.println(s);
        String delims = "/";
        String[] tokens = s.split(delims);
        System.out.println("After Clean");
        String mailPart="";
        for (int i=1;i<tokens.length;i++){
            mailPart+=tokens[i]+"\\\\";
        }
        System.out.println(mailPart);
        return mailPart;
    
        
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int option = chooser.showOpenDialog(null);
        //String s= "C:\\logo-170x80.jpg";
        if(option == JFileChooser.APPROVE_OPTION){
            try{
                chooser.setSelectedFile(new File("C:\\Users\\Mahdi\\Desktop\\classic.pdf"));
                url = chooser.getSelectedFile().toURL();
                System.out.println(url);
                jLabelPiecteJointe.setText(url.toString());

            }
            catch(MalformedURLException exception){
                System.out.println("The URL was malformed ... ");

            }
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jComboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClientActionPerformed

    private void jToggleRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleRetourActionPerformed
        // TODO add your handling code here:
        InterfaceAccueil acceuil = new InterfaceAccueil();
        acceuil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleRetourActionPerformed
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
            java.util.logging.Logger.getLogger(InterfaceEnvoyerVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceEnvoyerVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceEnvoyerVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceEnvoyerVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceEnvoyerVoucher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel client1;
    private javax.swing.JLabel deal1;
    private javax.swing.JComboBox iComboBoxDeal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox jComboBoxClient;
    private javax.swing.JLabel jLabelPiecteJointe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleRetour;
    // End of variables declaration//GEN-END:variables
}
