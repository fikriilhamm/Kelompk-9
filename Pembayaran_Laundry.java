/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaran;

import javax.swing.DefaultListModel;

/**
 *
 * @author asus
 */
public class Pembayaran_Laundry extends javax.swing.JFrame {
    DefaultListModel<classpembayaran> Baju = new DefaultListModel<>();
    private String  No_Pemesanan;
    private String Status_Pemesanan;
    private float Harga_Pemesanan;
    /**
     * Creates new form Pembayaran_Laundry
     */
    public Pembayaran_Laundry() {
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

        jPanel1 = new javax.swing.JPanel();
        Profile_Pemesanan = new javax.swing.JButton();
        Pemesanan_1 = new javax.swing.JButton();
        Lihat_Pemesanan = new javax.swing.JButton();
        Pembayaran_1 = new javax.swing.JButton();
        Delivery_Pemesanan = new javax.swing.JButton();
        Log_out = new javax.swing.JButton();
        hasil_nopemesanan = new javax.swing.JTextField();
        No_Pemesanan = new javax.swing.JLabel();
        Harga_Pemesanan = new javax.swing.JLabel();
        hasil_harga = new javax.swing.JTextField();
        hasil_status = new javax.swing.JTextField();
        Status_Pemesanan = new javax.swing.JLabel();
        List_Pemesanan = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Profile_Pemesanan.setText("Profile");
        getContentPane().add(Profile_Pemesanan);
        Profile_Pemesanan.setBounds(20, 30, 130, 25);

        Pemesanan_1.setText("Pemesanan");
        Pemesanan_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pemesanan_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Pemesanan_1);
        Pemesanan_1.setBounds(20, 80, 130, 25);

        Lihat_Pemesanan.setText("Lihat Pemesanan");
        Lihat_Pemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lihat_PemesananActionPerformed(evt);
            }
        });
        getContentPane().add(Lihat_Pemesanan);
        Lihat_Pemesanan.setBounds(20, 130, 130, 25);

        Pembayaran_1.setText("Pembayaran");
        Pembayaran_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pembayaran_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Pembayaran_1);
        Pembayaran_1.setBounds(20, 180, 130, 25);

        Delivery_Pemesanan.setText("Delivery");
        getContentPane().add(Delivery_Pemesanan);
        Delivery_Pemesanan.setBounds(20, 230, 130, 25);

        Log_out.setText("Log Out");
        Log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_outActionPerformed(evt);
            }
        });
        getContentPane().add(Log_out);
        Log_out.setBounds(20, 280, 130, 25);

        hasil_nopemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasil_nopemesananActionPerformed(evt);
            }
        });
        getContentPane().add(hasil_nopemesanan);
        hasil_nopemesanan.setBounds(220, 120, 200, 22);

        No_Pemesanan.setText("No. Pemesanan");
        getContentPane().add(No_Pemesanan);
        No_Pemesanan.setBounds(220, 100, 100, 16);

        Harga_Pemesanan.setText("Harga");
        getContentPane().add(Harga_Pemesanan);
        Harga_Pemesanan.setBounds(220, 160, 34, 16);
        getContentPane().add(hasil_harga);
        hasil_harga.setBounds(220, 180, 200, 22);
        getContentPane().add(hasil_status);
        hasil_status.setBounds(220, 240, 200, 22);

        Status_Pemesanan.setText("Status");
        getContentPane().add(Status_Pemesanan);
        Status_Pemesanan.setBounds(220, 220, 36, 16);

        List_Pemesanan.setText("List Pembayaran");
        getContentPane().add(List_Pemesanan);
        List_Pemesanan.setBounds(400, 30, 100, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hasil_nopemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasil_nopemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasil_nopemesananActionPerformed

    private void Lihat_PemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lihat_PemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lihat_PemesananActionPerformed

    private void Pemesanan_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pemesanan_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pemesanan_1ActionPerformed

    private void Pembayaran_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pembayaran_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pembayaran_1ActionPerformed

    private void Log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_outActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Log_outActionPerformed

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
            java.util.logging.Logger.getLogger(Pembayaran_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran_Laundry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delivery_Pemesanan;
    private javax.swing.JLabel Harga_Pemesanan;
    private javax.swing.JButton Lihat_Pemesanan;
    private javax.swing.JLabel List_Pemesanan;
    private javax.swing.JButton Log_out;
    private javax.swing.JLabel No_Pemesanan;
    private javax.swing.JButton Pembayaran_1;
    private javax.swing.JButton Pemesanan_1;
    private javax.swing.JButton Profile_Pemesanan;
    private javax.swing.JLabel Status_Pemesanan;
    private javax.swing.JTextField hasil_harga;
    private javax.swing.JTextField hasil_nopemesanan;
    private javax.swing.JTextField hasil_status;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
