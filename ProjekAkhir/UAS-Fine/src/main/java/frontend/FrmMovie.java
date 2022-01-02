/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Pranata
 */
public class FrmMovie extends javax.swing.JFrame {


    public FrmMovie() {
        initComponents();
        tampilkanData();
        tampilkanCmbKategori();
        kosongkanForm();
    }
    
    public void kosongkanForm() {
        txtIdMovie.setText("0");
        cmbKategori.setSelectedIndex(0);
        txtNama.setText("");
        txtGenre.setText("");
        txtHarga.setText("");
        txtTahunRilis.setText("");
        
    }
    
    public void tampilkanData() {
        String[] kolom = {"ID", "Kategori", "Nama", "Genre", "Harga", "Tahun Rilis"};
        ArrayList<Movie> list = new Movie().getAll();
        Object rowData[] = new Object[6];
        
        tblMovie.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getIdmovie();
            rowData[1] = list.get(i).getKategori().getJenis();
            rowData[2] = list.get(i).getNama();
            rowData[3] = list.get(i).getGenre();
            rowData[4] = list.get(i).getHarga();
            rowData[5] = list.get(i).getTahunRilis();
            
            ((DefaultTableModel) tblMovie.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword) {
        String[] kolom = {"ID", "Kategori", "Nama", "Genre", "Harga", "Tahun Rilis"};
        ArrayList<Movie> list = new Movie().search(keyword);
        Object rowData[] = new Object[6];
        
        tblMovie.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (Movie movie : list) {
            rowData[0] = movie.getIdmovie();
            rowData[1] = movie.getKategori().getJenis();
            rowData[2] = movie.getNama();
            rowData[3] = movie.getGenre();
            rowData[4] = movie.getHarga();
            rowData[5] = movie.getTahunRilis();
            
            ((DefaultTableModel) tblMovie.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanCmbKategori() {
        cmbKategori.setModel(new DefaultComboBoxModel(new Kategori().getAll().toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdMovie = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        txtGenre = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovie = new javax.swing.JTable();
        txtTahunRilis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Movie");

        jLabel2.setText("Kategori");

        jLabel3.setText("Nama");

        jLabel4.setText("Genre");

        jLabel5.setText("Tahun Rilis");

        txtIdMovie.setEnabled(false);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMovieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMovie);

        jLabel6.setText("Harga");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel7.setText("Tabel Movie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(txtGenre)))
                        .addGap(0, 428, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTambahBaru)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari)
                        .addGap(18, 18, 18)
                        .addComponent(btnCari)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(25, 25, 25)
                                    .addComponent(txtTahunRilis, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTahunRilis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Movie movie = new Movie();
        
        movie.setIdmovie(Integer.parseInt(txtIdMovie.getText()));
        movie.setKategori((Kategori) cmbKategori.getSelectedItem());
        
        movie.setNama(txtNama.getText());
        movie.setGenre(txtGenre.getText());
        movie.setHarga(Integer.parseInt(txtHarga.getText()));
        movie.setTahunRilis(txtTahunRilis.getText());
        
        movie.save();
        
        txtIdMovie.setText(Integer.toString(movie.getIdmovie()));
        
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblMovie.getModel();
        int row = tblMovie.getSelectedRow();
        
        Movie movie = new Movie().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        movie.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMovieMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblMovie.getModel();
        int row = tblMovie.getSelectedRow();
        Movie movie = new Movie();
        
        movie = movie.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        
        txtIdMovie.setText(String.valueOf(movie.getIdmovie()));
        cmbKategori.getModel().setSelectedItem(movie.getKategori());
        txtNama.setText(movie.getNama());
        txtGenre.setText(movie.getGenre());
        txtHarga.setText(String.valueOf(movie.getHarga()));
        txtTahunRilis.setText(movie.getTahunRilis());
    }//GEN-LAST:event_tblMovieMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMovie;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdMovie;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTahunRilis;
    // End of variables declaration//GEN-END:variables
}
