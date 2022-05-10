/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MainFrame;

import View.DangNhap.DangNhap;
import View.KhachHang.ViewCustomer;
import View.NguyenLieu.NguyenLieuView;
import View.NhanVien.ViewEmployee;
import View.ThongKeDoanhThuThang;
import View.TraCuuBan;

/**
 *
 * @author DELL
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        setTitle("Quản Lý Nhà Hàng");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        khoNguyenLieuButton = new javax.swing.JButton();
        quanLyNhanVienButton = new javax.swing.JButton();
        quanLyKhachHangButton = new javax.swing.JButton();
        dangXuatButton = new javax.swing.JButton();
        quanLyBanAnButton = new javax.swing.JButton();
        thongKeDoanhThuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));

        titlePanel.setBackground(new java.awt.Color(51, 255, 204));
        titlePanel.setPreferredSize(new java.awt.Dimension(659, 90));

        titleLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nhahang.png"))); // NOI18N
        titleLabel.setText("Quản Lý Nhà Hàng");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        khoNguyenLieuButton.setBackground(new java.awt.Color(255, 255, 255));
        khoNguyenLieuButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        khoNguyenLieuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nguyenlieu.png"))); // NOI18N
        khoNguyenLieuButton.setText("Kho nguyên liệu");
        khoNguyenLieuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khoNguyenLieuButtonActionPerformed(evt);
            }
        });

        quanLyNhanVienButton.setBackground(new java.awt.Color(255, 255, 255));
        quanLyNhanVienButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quanLyNhanVienButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nhanvien.png"))); // NOI18N
        quanLyNhanVienButton.setText("Quản lý nhân viên");
        quanLyNhanVienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyNhanVienButtonActionPerformed(evt);
            }
        });

        quanLyKhachHangButton.setBackground(new java.awt.Color(255, 255, 255));
        quanLyKhachHangButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quanLyKhachHangButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/khachang.png"))); // NOI18N
        quanLyKhachHangButton.setText("Quản lý khách hàng");
        quanLyKhachHangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyKhachHangButtonActionPerformed(evt);
            }
        });

        dangXuatButton.setBackground(new java.awt.Color(255, 255, 255));
        dangXuatButton.setForeground(new java.awt.Color(255, 0, 0));
        dangXuatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        dangXuatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangXuatButtonActionPerformed(evt);
            }
        });

        quanLyBanAnButton.setBackground(new java.awt.Color(255, 255, 255));
        quanLyBanAnButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quanLyBanAnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/banAn.png"))); // NOI18N
        quanLyBanAnButton.setText("Quản lý bàn ăn");
        quanLyBanAnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyBanAnButtonActionPerformed(evt);
            }
        });

        thongKeDoanhThuButton.setBackground(new java.awt.Color(255, 255, 255));
        thongKeDoanhThuButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        thongKeDoanhThuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/money.png"))); // NOI18N
        thongKeDoanhThuButton.setText("Thống kê doanh thu");
        thongKeDoanhThuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongKeDoanhThuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(khoNguyenLieuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quanLyBanAnButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thongKeDoanhThuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dangXuatButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quanLyNhanVienButton, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quanLyKhachHangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quanLyNhanVienButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quanLyKhachHangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quanLyBanAnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thongKeDoanhThuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khoNguyenLieuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dangXuatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quanLyBanAnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyBanAnButtonActionPerformed
        // TODO add your handling code here:
        new TraCuuBan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quanLyBanAnButtonActionPerformed

    private void dangXuatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangXuatButtonActionPerformed
        // TODO add your handling code here:
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dangXuatButtonActionPerformed

    private void quanLyNhanVienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyNhanVienButtonActionPerformed
        // TODO add your handling code here:
        new ViewEmployee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quanLyNhanVienButtonActionPerformed

    private void quanLyKhachHangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyKhachHangButtonActionPerformed
        // TODO add your handling code here:
        new ViewCustomer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quanLyKhachHangButtonActionPerformed

    private void thongKeDoanhThuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongKeDoanhThuButtonActionPerformed
        // TODO add your handling code here:
        new ThongKeDoanhThuThang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_thongKeDoanhThuButtonActionPerformed

    private void khoNguyenLieuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khoNguyenLieuButtonActionPerformed
        // TODO add your handling code here:
        new NguyenLieuView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_khoNguyenLieuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangXuatButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton khoNguyenLieuButton;
    private javax.swing.JButton quanLyBanAnButton;
    private javax.swing.JButton quanLyKhachHangButton;
    private javax.swing.JButton quanLyNhanVienButton;
    private javax.swing.JButton thongKeDoanhThuButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
