/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_system;

import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class pencarianForm extends javax.swing.JFrame {

    /**
     * Creates new form menuForm
     */
    public pencarianForm() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Judul = new javax.swing.JTextField();
        Norak = new javax.swing.JTextField();
        Pengarang = new javax.swing.JTextField();
        Nobuk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cariBuku = new javax.swing.JButton();
        kembaliBuku = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pinjamBuku = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Silahkan Masukan Judul Buku");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 630, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("No. Rak");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Judul");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 60, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Pengarang");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 100, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("No. Buku");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 100, -1));

        Judul.setBackground(new java.awt.Color(255, 255, 255));
        Judul.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(255, 255, 255)));
        Judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JudulActionPerformed(evt);
            }
        });
        Judul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JudulKeyReleased(evt);
            }
        });
        jPanel1.add(Judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 450, 30));

        Norak.setEditable(false);
        Norak.setBackground(new java.awt.Color(255, 255, 255));
        Norak.setForeground(new java.awt.Color(0, 51, 102));
        Norak.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(Norak, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 450, 30));

        Pengarang.setEditable(false);
        Pengarang.setBackground(new java.awt.Color(255, 255, 255));
        Pengarang.setForeground(new java.awt.Color(0, 51, 102));
        Pengarang.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(Pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 450, 30));

        Nobuk.setEditable(false);
        Nobuk.setBackground(new java.awt.Color(255, 255, 255));
        Nobuk.setForeground(new java.awt.Color(0, 51, 102));
        Nobuk.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(Nobuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 450, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/kotak biru tuo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 450, 2));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/kotak biru tuo.jpg"))); // NOI18N
        jLabel9.setText("jLabel4");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 450, 2));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/kotak biru tuo.jpg"))); // NOI18N
        jLabel10.setText("jLabel4");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 450, 2));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/kotak biru tuo.jpg"))); // NOI18N
        jLabel11.setText("jLabel4");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 450, 2));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setForeground(new java.awt.Color(0, 0, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cariBuku.setBackground(java.awt.SystemColor.controlLtHighlight);
        cariBuku.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cariBuku.setForeground(new java.awt.Color(255, 255, 255));
        cariBuku.setText("Pencarian Buku");
        cariBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cariBuku.setContentAreaFilled(false);
        cariBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBukuActionPerformed(evt);
            }
        });
        jPanel3.add(cariBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 40));

        kembaliBuku.setBackground(new java.awt.Color(0, 102, 153));
        kembaliBuku.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kembaliBuku.setForeground(new java.awt.Color(255, 255, 255));
        kembaliBuku.setText("Pengembalian Buku");
        kembaliBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kembaliBuku.setContentAreaFilled(false);
        kembaliBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembaliBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBukuActionPerformed(evt);
            }
        });
        jPanel3.add(kembaliBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Angkasa");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Perpustakaan");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        pinjamBuku.setBackground(new java.awt.Color(0, 102, 153));
        pinjamBuku.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pinjamBuku.setForeground(new java.awt.Color(255, 255, 255));
        pinjamBuku.setText("Peminjaman Buku");
        pinjamBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pinjamBuku.setContentAreaFilled(false);
        pinjamBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinjamBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamBukuActionPerformed(evt);
            }
        });
        jPanel3.add(pinjamBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 500));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    loadingbar obj = new loadingbar();
    
    public void databuku(){
        String judul;
        String pengarang;
        int nobuk, norak;
        judul = (Judul.getText());
        
        if (Judul.getText().equals("Si Kancil")){
            pengarang = "Yudistira";
            nobuk = 1111;
            norak = 0010;
        }
        else if (Judul.getText().equals("Tuhan Ada di Hatimu")){
            pengarang = "Habib Jafar";
            nobuk = 2222;
            norak = 0012;
        }    
        else if (Judul.getText().equals("Matematika")){
            pengarang = "Abimanyu";
            nobuk = 3333;
            norak = 0003;
        }
        else if (Judul.getText().equals("Fisika")){
            pengarang = "Prayoga";
            nobuk = 4444;
            norak = 0024;
        }
        else {
            pengarang = "Tidak Ditemukan";
            nobuk = 0000;
            norak = 0000;
        }
        Pengarang.setText(String.valueOf(pengarang));
        Nobuk.setText(""+nobuk);
        Norak.setText(""+norak);
    }
    private void kembaliBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBukuActionPerformed
        // TODO add your handling code here:
        new pengembalianForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliBukuActionPerformed

    private void cariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBukuActionPerformed
        // TODO add your handling code here
        JOptionPane.showMessageDialog(null, "Anda Berada Pada Halaman Ini");
    }//GEN-LAST:event_cariBukuActionPerformed

    private void pinjamBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamBukuActionPerformed
        // TODO add your handling code here:
        obj.panggilpinjam();
        this.setVisible(false);
    }//GEN-LAST:event_pinjamBukuActionPerformed

    private void JudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JudulActionPerformed

    private void JudulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JudulKeyReleased
        // TODO add your handling code here:
        databuku();
    }//GEN-LAST:event_JudulKeyReleased

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        obj.panggillogin();
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(pencarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pencarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pencarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pencarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pencarianForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Judul;
    private javax.swing.JTextField Nobuk;
    private javax.swing.JTextField Norak;
    private javax.swing.JTextField Pengarang;
    private javax.swing.JButton cariBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kembaliBuku;
    private javax.swing.JButton logout;
    private javax.swing.JButton pinjamBuku;
    // End of variables declaration//GEN-END:variables
}
