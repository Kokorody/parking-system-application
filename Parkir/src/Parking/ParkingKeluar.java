
package Parking;

import java.sql.*;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

public class ParkingKeluar extends javax.swing.JFrame {

    
int xx, xy;
LocalDateTime currentTime = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = currentTime.format(formatter);
private Connection conn;
    
    
    public ParkingKeluar()  {
        initComponents();
        conn = koneksi.getConnection();
        getData();
        txt_ID.setEditable(false);
        txt_plat.setEditable(false);
        txt_masuk.setEditable(false);
        txt_keluar.setEditable(false);
        txt_lama.setEditable(false);
        txt_total.setEditable(false);
        txt_kembalian.setEditable(false);
        txt_jenis.setEditable(false);
        txt_status.setEditable(false);
        btn_jumlah.setEnabled(false);
        btn_bayar.setEnabled(false);
        btn_selesai.setEnabled(false);
        // Menambahkan MouseListener pada tabel
        tbl_parking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_parkingMouseClicked(evt);
            }
        });
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
        Logger.getLogger(ParkingKeluar.class.getName()).log(Level.SEVERE, null, e);
    }
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGradient1 = new jpanelgradient.JPanelGradient();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_jumlah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_kembalian = new javax.swing.JTextField();
        btn_bayar = new javax.swing.JButton();
        txt_jenis = new javax.swing.JTextField();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_plat = new javax.swing.JTextField();
        txt_keluar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_lama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        btn_selesai = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        btn_jumlah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_parking = new javax.swing.JTable();
        t_cari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_masuk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        minimize1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

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

        jLabel7.setText("Jenis Kendaraan");

        jLabel8.setText("Jumlah Bayar");

        jLabel9.setText("Jumlah Kembalian");

        txt_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembalianActionPerformed(evt);
            }
        });

        btn_bayar.setText("BAYAR");
        btn_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bayarActionPerformed(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
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

        jLabel2.setText("Jam Masuk");

        txt_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_keluarActionPerformed(evt);
            }
        });

        jLabel3.setText("Jam Keluar");

        jLabel4.setText("Lama Parkir");

        jLabel5.setText("Total Bayar");

        btn_selesai.setText("BAYAR SELESAI");
        btn_selesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_selesaiMouseClicked(evt);
            }
        });
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });

        btn_kembali.setText("KEMBALI");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        btn_jumlah.setText("JUMLAH");
        btn_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jumlahActionPerformed(evt);
            }
        });

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
        tbl_parking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_parkingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_parking);

        t_cari.setText("Pencarian");
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        jLabel1.setText("Plat Nomor");

        jLabel6.setText("ID Parkir");

        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("PARKIR 77");

        minimize1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minimize1.setText("-");
        minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimize1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize1MouseExited(evt);
            }
        });

        jLabel11.setText("Status Pembayaran");

        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGradient1Layout = new javax.swing.GroupLayout(jPanelGradient1);
        jPanelGradient1.setLayout(jPanelGradient1Layout);
        jPanelGradient1Layout.setHorizontalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minimize, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(minimize1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit))
                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(471, 471, 471)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                    .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                            .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(btn_jumlah))
                                            .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                                    .addGap(87, 87, 87)
                                                    .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(txt_status, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txt_kembalian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btn_bayar)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton1))))
                                        .addComponent(jLabel1)
                                        .addComponent(txt_plat, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(txt_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(txt_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(62, 62, 62))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(265, 265, 265)))
                            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)))
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                                        .addComponent(btn_selesai)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_kembali)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelGradient1Layout.setVerticalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimize1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_plat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_jumlah)
                    .addComponent(btn_bayar)
                    .addComponent(btn_selesai)
                    .addComponent(btn_kembali)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
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

    private void btn_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jumlahActionPerformed
        String plat = txt_plat.getText();
    String bayar = txt_total.getText();
    String jenis = txt_jenis.getText();

    // Mengambil ID parkir berdasarkan plat nomor atau waktu masuk terakhir
    int idParkir = getIDByPlat(plat); // Ganti dengan fungsi getIDByPlat() yang sesuai

    if (idParkir != -1) { // Pastikan ID parkir ditemukan
        LocalDateTime waktuMasuk = getJamMasuk(idParkir); // Mendapatkan waktu masuk dari database

        if (waktuMasuk != null) {
            // Mendapatkan waktu keluar saat ini
            LocalDateTime waktuKeluar = LocalDateTime.now();

            // Menghitung durasi parkir antara waktu masuk dan waktu keluar dalam menit
            Duration durasiParkir = Duration.between(waktuMasuk, waktuKeluar);
            long menitTotal = durasiParkir.toMinutes(); // Konversi durasi ke dalam menit

            // Hitung total bayar berdasarkan lama parkir sebelum update database
            int lama = (int) menitTotal; // Mengambil menit sebagai lama parkir
            int total;
            if (jenis.equals("Mobil")) {
                total = ((lama/60) + 1) * 3000 + 1000;
            } else {
                total = ((lama/60) + 1) * 2000;
            }

            String lamaParkir = String.format("%d menit", lama); // Format lama parkir dalam menit

            // Set nilai pada komponen GUI
            txt_lama.setText(lamaParkir); // Set lama parkir
            txt_keluar.setText(waktuKeluar.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))); // Set waktu keluar
            txt_total.setText("Rp " + total); // Set total bayar dengan format "Rp "
            btn_jumlah.setEnabled(false);
        } else {
            System.out.println("Waktu masuk tidak ditemukan untuk ID parkir " + idParkir);
        }
    } else {
        System.out.println("ID parkir tidak ditemukan untuk plat nomor " + plat);
    }
    btn_bayar.setEnabled(true);
    }//GEN-LAST:event_btn_jumlahActionPerformed

    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cariActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void txt_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_keluarActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
         ParkingMasuk masuk = null;
         masuk = new ParkingMasuk ();
                             
         
                               masuk.setVisible(true);
                               masuk.setLocationRelativeTo(null);
                               //disposing your LoginIndex
                               dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_selesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selesaiMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_selesaiMouseClicked

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
    // Mendapatkan nilai ID dari text field txt_ID
    String id = txt_ID.getText().trim();

    // Validasi ID
    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan ID yang akan diakhiri transaksinya");
        return;
    }

    // Konfirmasi pengakhiran transaksi
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda ingin mengakhiri transaksi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

    // Jika pengguna menekan tombol YES
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // Persiapan statement DELETE
            String sql = "DELETE FROM parkinggg WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, id); // Mengatur parameter ID pada statement DELETE

            // Eksekusi pernyataan DELETE
            int rowDelete = st.executeUpdate();

            // Jika penghapusan berhasil
            if (rowDelete > 0) {
                JOptionPane.showMessageDialog(this, "Transaksi berhasil diakhiri");
                resetForm(); // Mereset formulir atau komponen GUI
                getData(); // Memperbarui tampilan tabel dengan data terbaru dari database
                btn_selesai.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengakhiri transaksi. ID tidak ditemukan.");
            }

            st.close(); // Menutup PreparedStatement
        } catch (SQLException e) {
            Logger.getLogger(ParkingKeluar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengakhiri transaksi: " + e.getMessage());
        }
    }

    // Mengosongkan kolom jumlah, kembalian, dan ID setelah pengakhiran transaksi
    txt_ID.setText("");
    txt_jumlah.setText("");
    txt_kembalian.setText("");
    txt_status.setText("");

        
        
    }//GEN-LAST:event_btn_selesaiActionPerformed

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
         DefaultTableModel model = (DefaultTableModel) tbl_parking.getModel();
        model.setRowCount(0);
        
        String cari = t_cari.getText();
                
        try {
            String sql = "Select * from parkinggg WHERE `ID` LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1,"%" + cari + "%");
                
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
            int id = rs.getInt("ID");
            String PlatNomor = rs.getString("Plat Nomor");
            String JenisKendaraan = rs.getString("Jenis Kendaraan");
            String JamMasuk = rs.getString("Jam Masuk");
            String JamKeluar = rs.getString("Jam Keluar");
            String LamaParkir = rs.getString("Lama Parkir");
            String TotalBayar = rs.getString("Total Bayar");
            String StatusPembayaran = rs.getString("Status Pembayaran");
            
                Object[] rowData = {id, PlatNomor, JenisKendaraan, JamMasuk, JamKeluar, LamaParkir, TotalBayar, StatusPembayaran};
                model.addRow(rowData);
            }
            rs.close();
            st.close();

        } catch (Exception e) {
             Logger.getLogger(ParkingKeluar.class.getName()).log(Level.SEVERE,null,e);
        }
    
    }//GEN-LAST:event_t_cariKeyTyped

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked

    private void txt_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembalianActionPerformed
      
    }//GEN-LAST:event_txt_kembalianActionPerformed

    private void btn_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bayarActionPerformed
      // Get the total amount and amount paid as strings from text fields
    String totalStr = txt_total.getText();
    String bayarStr = txt_jumlah.getText();

    try {
        // Convert the string amounts to doubles (assuming these are currency values)
        double total = parseCurrencyValue(totalStr);
        double bayar = parseCurrencyValue(bayarStr);

        // Calculate the change (kembalian)
        double kembalian = bayar - total;

        if (kembalian >= 0) {
            // Display the change with two decimal places
            txt_kembalian.setText(String.format("%.2f", kembalian));
            btn_selesai.setEnabled(true); // Enable the "Selesai" button

            // Get vehicle details from text fields
            String plat = txt_plat.getText();
            String jenis = txt_jenis.getText();
            String status = "Sudah Bayar";

            // Get parking ID based on plate number
            int idParkir = getIDByPlat(plat);

            if (idParkir != -1) { // Ensure parking ID is found
                LocalDateTime waktuMasuk = getJamMasuk(idParkir); // Get entry time from database

                if (waktuMasuk != null) {
                    // Get current exit time
                    LocalDateTime waktuKeluar = LocalDateTime.now();

        // Menghitung durasi parkir antara waktu masuk dan waktu keluar
        Duration durasiParkir = Duration.between(waktuMasuk, waktuKeluar);
        long durasiDetik = durasiParkir.getSeconds();

        // Konversi durasiDetik ke format menit:detik
        long menitTotal = durasiDetik / 60;
        long detik = durasiDetik % 60;

        String lamaParkir = String.format("%d:%02d", menitTotal, detik); // Format lama parkir (mm:ss)
        try {
        // Hitung total bayar berdasarkan lama parkir sebelum update database
        int lama = (int) menitTotal; // Mengambil menit sebagai lama parkir (asumsi menit sudah dihitung sebelumnya)
        int totalBayar;
        if (jenis.equals("Mobil")){
            total = ((lama/60) + 1) * 3000 + 1000;
        }
        else {
            total = ((lama/60) + 1) * 2000;
        }

                        // Update parking data in the database
                        String sql = "UPDATE parkinggg SET `Plat Nomor` = ?, `Jenis Kendaraan` = ?, `Jam Keluar` = ?, `Lama Parkir` = ?, `Total Bayar` = ?, `Status Pembayaran` = ? WHERE ID = ?";
                        PreparedStatement st = conn.prepareStatement(sql);
                        st.setString(1, plat);
                        st.setString(2, jenis);
                        st.setString(3, waktuKeluar.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))); // Exit time
                        st.setString(4, lamaParkir); // Parking duration
                        st.setString(5, "Rp " + total); // Total payment in string format
                        st.setString(6, status); 
                        st.setInt(7, idParkir); // Parking ID

                        int rowUpdated = st.executeUpdate();
                        if (rowUpdated > 0) {
                            // If successful, update parking data display in GUI
                            JOptionPane.showMessageDialog(this, "Data Parkir Berhasil Diperbarui");
                            getData(); // Update parking data display
                            btn_bayar.setEnabled(false);
                            txt_lama.setText(lamaParkir); // Set parking duration
                            txt_keluar.setText(waktuKeluar.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))); // Set exit time
                            txt_total.setText("Rp " + total); // Set total payment with "Rp " format
                            txt_status.setText(status);
                        }

                        st.close(); // Close PreparedStatement for updating parking data
                    } catch (SQLException e) {
                        Logger.getLogger(ParkingKeluar.class.getName()).log(Level.SEVERE, null, e);
                    }
                } else {
                    System.out.println("Entry time not found for parking ID " + idParkir);
                }
            } else {
                System.out.println("Parking ID not found for plate number " + plat);
            }
        } else {
            // If payment is insufficient, show error message and disable the "Selesai" button
            txt_kembalian.setText(""); // Clear the change field
            JOptionPane.showMessageDialog(this, "Jumlah Bayar Kurang");
            btn_selesai.setEnabled(false); // Disable the "Selesai" button
        }
    } catch (NumberFormatException e) {
        // Handle parsing errors if the input is not a valid number
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
    }
    }//GEN-LAST:event_btn_bayarActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

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

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void tbl_parkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_parkingMouseClicked
        int selectedRow = tbl_parking.getSelectedRow();
    if (selectedRow != -1) {
        Object idObj = getValueAt(selectedRow, 0);
        String plat = getValueAsString(getValueAt(selectedRow, 1));
        String jenis = getValueAsString(getValueAt(selectedRow, 2));
        String masuk = getValueAsString(getValueAt(selectedRow, 3));
        String keluar = getValueAsString(getValueAt(selectedRow, 4));
        String lama = getValueAsString(getValueAt(selectedRow, 5));
        String total = getValueAsString(getValueAt(selectedRow, 6));
        String status = getValueAsString(getValueAt(selectedRow, 7));

        if (status != null && status.equalsIgnoreCase("Sudah Bayar")) {
            // Jika status sudah "Sudah Bayar", nonaktifkan pemilihan baris
            tbl_parking.clearSelection();
            JOptionPane.showMessageDialog(this, "Status pembayaran sudah 'Sudah Bayar'.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Jika status bukan "Sudah Bayar", tampilkan nilai pada JTextField
            // Konversi nilai ID ke tipe data int dengan aman
            int id = parseId(idObj);

            // Set nilai ke JTextField
            txt_ID.setText(String.valueOf(id));
            txt_plat.setText(plat);
            txt_jenis.setText(jenis);
            txt_masuk.setText(masuk);
            txt_keluar.setText(keluar);
            txt_lama.setText(lama);
            txt_total.setText(total);
            txt_status.setText(status);
        }
    }
    btn_selesai.setEnabled(false);
    btn_jumlah.setEnabled(true);
    }//GEN-LAST:event_tbl_parkingMouseClicked

    private void minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize1MouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_exitMouseExited

    private void minimize1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseEntered
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_minimize1MouseEntered

    private void minimize1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseExited
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_minimize1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    txt_ID.setText("");
    txt_plat.setText("");
    txt_jenis.setText("");
    txt_masuk.setText("");
    txt_keluar.setText("");
    txt_lama.setText("");
    txt_total.setText("");
    txt_jumlah.setText("");
    txt_kembalian.setText("");
    txt_status.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ParkingKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkingKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkingKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkingKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new ParkingKeluar().setVisible(true);
    }
});
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bayar;
    private javax.swing.JButton btn_jumlah;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
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
    private jpanelgradient.JPanelGradient jPanelGradient1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel minimize1;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTable tbl_parking;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_jenis;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_keluar;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_lama;
    private javax.swing.JTextField txt_masuk;
    private javax.swing.JTextField txt_plat;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

private LocalDateTime getJamMasuk(int idParkir) {
    LocalDateTime waktuMasuk = null;
    try {
        String sql = "SELECT `Jam Masuk` FROM parkinggg WHERE `ID` = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, idParkir); // Bind nilai parameter (ID parkir)

        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            waktuMasuk = rs.getTimestamp("Jam Masuk").toLocalDateTime();
        }

        rs.close();
        st.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return waktuMasuk;
}

private int getIDByPlat(String plat) {
    try {
        String sql = "SELECT ID FROM parkinggg WHERE `Plat Nomor` = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, plat);
        ResultSet result = statement.executeQuery();

        if (result.next()) {
            return result.getInt("ID"); // Mengembalikan ID parkir jika ditemukan
        }
    } catch (SQLException e) {
        Logger.getLogger(ParkingKeluar.class.getName()).log(Level.SEVERE, null, e);
    }
    return -1; // Mengembalikan nilai -1 jika ID parkir tidak ditemukan
}
private void resetForm() {
        txt_ID.setText((""));
        
        txt_plat.setText("");
        txt_masuk.setText("");
        
        txt_keluar.setText("");
        txt_lama.setText("");
        txt_total.setText("");
   }
private double parseCurrencyValue(String value) {
    // Remove non-numeric characters (except decimal point for fractional values)
    String cleanedValue = value.replaceAll("[^0-9.]", "");
    
    // Parse the cleaned string into a double
    return Double.parseDouble(cleanedValue);
}

// Metode untuk mengambil nilai dari JTable pada baris dan kolom tertentu
private Object getValueAt(int row, int column) {
    return tbl_parking.getValueAt(row, column);
}

// Metode untuk mengambil nilai sebagai string dengan aman
private String getValueAsString(Object value) {
    if (value != null) {
        return value.toString();
    }
    return ""; // Nilai default jika value null
}

// Metode untuk mengonversi nilai ID ke tipe data int dengan aman
private int parseId(Object idObj) {
    int id = 0; // Nilai default jika konversi gagal
    if (idObj instanceof Integer) {
        id = (Integer) idObj;
    } else if (idObj instanceof String) {
        try {
            id = Integer.parseInt((String) idObj);
        } catch (NumberFormatException e) {
            // Tangani jika string tidak dapat diubah menjadi integer
            e.printStackTrace(); // Atau lakukan penanganan lain sesuai kebutuhan
        }
    }
    return id;
}

}

