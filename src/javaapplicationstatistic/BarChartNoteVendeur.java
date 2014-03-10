
package javaapplicationstatistic;

import edu.esprit.dao.ReservationDAO;
import edu.esprit.dao.VendeurDAO;

import edu.esprit.entities.NbrReservation;
import edu.esprit.entities.Vendeur;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class BarChartNoteVendeur extends javax.swing.JFrame {

    DefaultCategoryDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe
    ChartPanel cp;            //Panel
    

    public BarChartNoteVendeur() {
        
        dataset = new DefaultCategoryDataset();
//Statique
        VendeurDAO vendeurDAO = new VendeurDAO();
        List<Vendeur> vendeurs=new ArrayList<Vendeur>();
        vendeurs=vendeurDAO.DisplayAllVendeur();
                for(Vendeur v:vendeurs)
        dataset.addValue(v.getNote(), v.getNom(), " ");
        
        graphe = ChartFactory.createBarChart3D(
                " Les vendeurs les mieux notés ", // chart title
                " ", // domain axis label
                "  les notes ", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                true // urls
                );
        cp = new ChartPanel(graphe);
        cp.setPreferredSize(new java.awt.Dimension(400, 400));
        this.add(cp);
        this.setSize(400, 400);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public static void main(String[] arg) {
        
        new BarChartNoteVendeur().setVisible(true);

    }
}
