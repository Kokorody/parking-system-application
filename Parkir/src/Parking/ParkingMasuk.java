
package Parking;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

public class ParkingMasuk extends javax.swing.JFrame {

    
int xx, xy;
    // Mendapatkan waktu saat ini
LocalDateTime currentTime = LocalDateTime.now();

// Format waktu menjadi string sesuai kebutuhan
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = currentTime.format(formatter);
    
    private Connection conn;
    
    public ParkingMasuk() {
        initComponents();
        conn = koneksi.getConnection();
        getData();
    }
    
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tbl_parking.getModel();
        model.setRowCount(0); // Kosongkan model tabel

    try {
        String sql = "SELECT * FROM parkinggg"; 
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            int ID = rs.getInt("ID");
            String PlatNomor = rs.getString("Plat Nomor");
            String JenisKendaraan = rs.getString("Jenis Kendaraan");
            String JamMasuk = rs.getString("Jam Masuk");
            String JamKeluar = rs.getString("Jam Keluar");
            String LamaParkir = rs.getString("Lama Parkir");
            String TotalBayar = rs.getString("Total Bayar");
            String StatusPembayaran = rs.getString("Status Pembayaran");

            Object[] rowData = {ID, PlatNomor, JenisKendaraan, JamMasuk, JamKeluar, LamaParkir, TotalBayar, StatusPembayaran};
            model.addRow(rowData);
        }

        rs.close();
        st.close();
    } catch (Exception e) {
        Logger.getLogger(ParkingMasuk.class.getName()).log(Level.SEVERE, null, e);
    }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGradient1 = new jpanelgradient.JPanelGradient();
        minimize = new javax.swing.JLabel();
        cmb_jenis = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_parking = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_masuk = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_plat = new javax.swing.JTextField();
        btn_keluar = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanelGradient1.setColorEnd(new java.awt.Color(204, 0, 51));
        jPanelGradient1.setColorStart(new java.awt.Color(204, 204, 204));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });

        cmb_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobil", "Motor" }));
        cmb_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_jenisActionPerformed(evt);
            }
        });

        jLabel3.setText("Jenis Kendaraan");

        tbl_parking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Parkir", "Plat Nomor", "Jenis Kendaraan", "Jam Masuk", "Jam Keluar", "Lama Parkir", "Total Bayar", "Status Pembayaran"
            }
        ));
        jScrollPane1.setViewportView(tbl_parking);

        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        jLabel1.setText("Plat Nomor");

        txt_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_masukActionPerformed(evt);
            }
        });

        jLabel2.setText("Jam Masuk");

        btn_keluar.setText("HITUNG PARKIR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("PARKIR 77");

        javax.swing.GroupLayout jPanelGradient1Layout = new javax.swing.GroupLayout(jPanelGradient1);
        jPanelGradient1.setLayout(jPanelGradient1Layout);
        jPanelGradient1Layout.setHorizontalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit))
                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                        .addComponent(btn_tambah)
                                        .addGap(31, 31, 31)
                                        .addComponent(btn_keluar))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_masuk)
                                    .addComponent(txt_plat))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGradient1Layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGradient1Layout.setVerticalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                        .addComponent(txt_plat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah)
                            .addComponent(btn_keluar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        String plat = txt_plat.getText();
    String jenis = cmb_jenis.getSelectedItem().toString();
    
    // Mendapatkan waktu saat ini
    LocalDateTime currentTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = currentTime.format(formatter);

    try {
        String sql = "INSERT INTO parkinggg (`Plat Nomor`, `Jenis Kendaraan`, `Jam Masuk`) VALUES (?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, plat);
        st.setString(2, jenis);
        st.setString(3, formattedDateTime); // Menggunakan waktu saat ini sebagai Jam Masuk
        

        int rowInserted = st.executeUpdate();
        if (rowInserted > 0) {
            JOptionPane.showMessageDialog(this, "Data Parkir Berhasil Ditambahkan");
            resetForm();
            getData();
        }

        st.close();
    } catch (SQLException e) {
        // Tangani pesan kesalahan khusus jika validasi trigger gagal
        if (e.getSQLState().equals("45000")) { // Contoh SQLState untuk validasi trigger
            JOptionPane.showMessageDialog(this, "Plat Nomor tidak valid. Mohon masukkan plat nomor yang benar.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Tangani kesalahan umum
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menambahkan data parkir: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        Logger.getLogger(ParkingMasuk.class.getName()).log(Level.SEVERE, null, e);
    }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
         ParkingKeluar keluar = null;
         keluar = new ParkingKeluar();
                             
         
                               keluar.setVisible(true);
                               keluar.setLocationRelativeTo(null);
                               //disposing your LoginIndex
                               dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
    // Tampilkan dialog konfirmasi
        int choice = JOptionPane.showConfirmDialog(
            this, 
            "Apakah Anda yakin ingin keluar?",
            "Konfirmasi Keluar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (choice == JOptionPane.YES_OPTION) {
            // Jika pengguna memilih 'Yes', buka halaman login baru
            LoginPage keluar = new LoginPage();
            keluar.setVisible(true);
            keluar.setLocationRelativeTo(null);

            // Tutup jendela login saat ini
            dispose();
        }
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
    this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void txt_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_masukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_masukActionPerformed

    private void cmb_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_jenisActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_exitMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_minimizeMouseExited

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
            java.util.logging.Logger.getLogger(ParkingMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkingMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkingMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkingMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkingMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> cmb_jenis;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private jpanelgradient.JPanelGradient jPanelGradient1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize;
    private javax.swing.JTable tbl_parking;
    private javax.swing.JTextField txt_masuk;
    private javax.swing.JTextField txt_plat;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txt_plat.setText("");
        txt_masuk.setText("");
    }
}
