/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ThongKe;

import com.raven.chart.ModelChart;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducit
 */
public class ShowChart extends javax.swing.JFrame {

    /**
     * Creates new form demoCharFrame
     */
    public ShowChart(DefaultTableModel tableShow) {
        initComponents();
        init(tableShow);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\com\\raven\\icon\\shop (6).png");
        this.setIconImage(icon);
    }

    public ShowChart(DefaultTableModel model, String str) {
        initComponents();
        initRevenue(model);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public ShowChart() {

    }

    public String deleteLastKey(String str) {
        if (str.charAt(str.length() - 1) == 'đ') {
            str = str.replace(str.substring(str.length() - 1), "");
            return str;
        } else {
            return str;
        }
    }

    public String fomartFloat(String txt) {
        String pattern = deleteLastKey(txt);
        return pattern = pattern.replaceAll(",", "");
    }

    private void init(DefaultTableModel tableShow) {
        chart.addLegend("Sản phẩm", new Color(12, 84, 175), new Color(0, 108, 247));
        for (int j = 0; j < tableShow.getRowCount(); j++) {
            if (j == 10) {
                break;
            }
            chart.addData(new ModelChart((String) tableShow.getValueAt(j, 1), new double[]{(int) tableShow.getValueAt(j, 2)}));
        }
        chart.start();
    }

    private void initRevenue(DefaultTableModel tableShow) {
        chart.addLegend("Doanh thu", new Color(255, 240, 245), new Color(0, 108, 247));

        for (int j = 0; j < tableShow.getRowCount(); j++) {
            chart.addData(new ModelChart((int) tableShow.getValueAt(j, 0) + "", new double[]{
                //                (int) tableShow.getValueAt(j, 1),
                Float.parseFloat(fomartFloat((String) tableShow.getValueAt(j, 1))),

            }));
        }
        chart.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        chart = new com.raven.chart.CurveChart();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 1404, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ShowChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowChart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.CurveChart chart;
    private com.raven.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}