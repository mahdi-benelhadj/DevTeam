/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ajouter_deal.java
 *
 * Created on Feb 18, 2014, 4:31:48 PM
 */

package edu.esprit.gui;

import PIDEV.ENTITE.Deal;
import pidev.dao.DealDao;

/**
 *
 * @author mohamed amine
 */
public class ajouter_deal extends javax.swing.JFrame {

    /** Creates new form ajouter_deal */
    public ajouter_deal() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        panelaffiche = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelAjoutDeal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_titreDeal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtprix_deal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprix_promotion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcategorie = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtduree = new javax.swing.JTextField();
        valider = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetail_deal = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout panelafficheLayout = new javax.swing.GroupLayout(panelaffiche);
        panelaffiche.setLayout(panelafficheLayout);
        panelafficheLayout.setHorizontalGroup(
            panelafficheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelafficheLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        panelafficheLayout.setVerticalGroup(
            panelafficheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelafficheLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));

        panelAjoutDeal.setBackground(new java.awt.Color(255, 255, 255));
        panelAjoutDeal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("titre_deal  :");
        panelAjoutDeal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setText("detail_deal  :");
        panelAjoutDeal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        txt_titreDeal.setText("titre_deal");
        panelAjoutDeal.add(txt_titreDeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 30, 91, 35));

        jLabel3.setText("prix_deal :");
        panelAjoutDeal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        txtprix_deal.setText("   prix_deal");
        txtprix_deal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprix_dealActionPerformed(evt);
            }
        });
        panelAjoutDeal.add(txtprix_deal, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 255, 88, 29));

        jLabel4.setText(" prix _promotion :");
        panelAjoutDeal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 341, -1, -1));

        txtprix_promotion.setText("  prix_promotion");
        txtprix_promotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprix_promotionActionPerformed(evt);
            }
        });
        panelAjoutDeal.add(txtprix_promotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 333, 88, 31));

        jLabel5.setText("Categorie  :");
        panelAjoutDeal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 50, -1, -1));

        jLabel6.setText("Date  :");
        panelAjoutDeal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 111, -1, -1));

        jLabel7.setText("Durée  :");
        panelAjoutDeal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 185, -1, -1));

        txtcategorie.setText("categorie");
        panelAjoutDeal.add(txtcategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 40, 101, 35));

        txtdate.setText("date");
        panelAjoutDeal.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 101, 74, 35));

        txtduree.setText("duree");
        txtduree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdureeActionPerformed(evt);
            }
        });
        panelAjoutDeal.add(txtduree, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 177, 74, 30));

        valider.setText("valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });
        panelAjoutDeal.add(valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 326, -1, 44));

        annuler.setText("annuler");
        panelAjoutDeal.add(annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 326, -1, 44));

        txtDetail_deal.setColumns(20);
        txtDetail_deal.setRows(5);
        jScrollPane1.setViewportView(txtDetail_deal);

        panelAjoutDeal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jMenu1.setText("Ajouter_deal");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAjoutDeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAjoutDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprix_promotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprix_promotionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprix_promotionActionPerformed

    private void txtprix_dealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprix_dealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprix_dealActionPerformed

    private void txtdureeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdureeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdureeActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
DealDao dealdeao=new DealDao();
/////////creation de l''objet Deal////////////////

Deal deal=new Deal();
deal.setCategorie(txtcategorie.getText());
deal.setDate_deal(txtdate.getText());
deal.setDetail_deal(txtDetail_deal.getText());
deal.setPrix(Double.parseDouble(txtprix_deal.getText()));
deal.setPrix_promotion(Double.parseDouble(txtprix_promotion.getText()));
deal.setDuree(Integer.parseInt(txtduree.getText()));
deal.setTitre(txt_titreDeal.getText());

//////////////////

dealdeao.ajout_deal(deal);
        


// TODO add your handling code here:
    }//GEN-LAST:event_validerActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouter_deal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAjoutDeal;
    private javax.swing.JPanel panelaffiche;
    private javax.swing.JTextArea txtDetail_deal;
    private javax.swing.JTextField txt_titreDeal;
    private javax.swing.JTextField txtcategorie;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtduree;
    private javax.swing.JTextField txtprix_deal;
    private javax.swing.JTextField txtprix_promotion;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables

}
