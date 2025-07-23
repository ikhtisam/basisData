package laundry;

import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import service.Koneksi;
import entity.pelanggan;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//import java.util.Set;
import javax.swing.table.DefaultTableModel;
import service.pelanggan_service;
import entity.detail_transaksi;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
//import service.inputlaundryservice;
//import laundry.Riwayat;

public class From_inputLaundry extends javax.swing.JFrame {
  public Connection koneksi;
   private void Combobox(){
       koneksi = Koneksi.getkoneksi();
        PreparedStatement prepare = null;
        ResultSet result = null;

        try {
            String sql = "SELECT * FROM paket_laundry";
            prepare = koneksi.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                cb_paket.addItem(result.getString("Nama_paket"));
                
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
   
   private void Table (){
      
        model = new DefaultTableModel();
       
       model.addColumn("Id karyawan");
       model.addColumn("Nama karyawan");
       model.addColumn("Kode pelanggan");
       model.addColumn("Nama pelanggan");
       model.addColumn("Kode paket");
       model.addColumn("Nama paket");
       model.addColumn("Harga paket");
       model.addColumn("Pengerjaan");
       model.addColumn("Transaksi");
       model.addColumn("Jenis barang");
       model.addColumn("Berat");
       model.addColumn("Total harga");
       model.addColumn("Uang");
       model.addColumn("Kembalian");
       table1.setModel(model);
       
       
  
}
   
private DynamicTableModel<pelanggan> tablemodel;
private JDynamicTable jDynamicTable;
private DefaultTableModel model;
private void reload(){
    tablemodel.clear();
    pelanggan_service service =new pelanggan_service();
    List<pelanggan>list =service.Tampil();
    for(pelanggan pel : list){
        tablemodel.add(pel);
        
        
    }
}
//}
//public void hitungtotal(){
//    int ber = Integer.parseInt(berat.getText());
//    int hara = Integer.parseInt(harga.getText());
//    int total = ber * hara;
//    subtotal.setText(Integer.toString(total));
//    
//}
    public From_inputLaundry() {
    initComponents();
       
    tablemodel = new DynamicTableModel<>(pelanggan.class);
    jDynamicTable= new JDynamicTable(tablemodel);
    jScrollPane1.setViewportView(jDynamicTable);
//    inputTable();

    reload();
    
    Combobox3();
    Combobox2();
    Date date = new Date();
    SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
    Tanggal.setText(s.format(date));
    Combobox();
    Table();
    }


public void Combobox2(){
       koneksi = Koneksi.getkoneksi();
        PreparedStatement prepare = null;
        ResultSet result = null;

        try {
            String sql = "SELECT * FROM karyawan";
            prepare = koneksi.prepareStatement(sql);
            result = prepare.executeQuery();
            while (result.next()){
                karyawann.addItem(result.getString("Nama_karyawan"));
                
            }
            
        }catch(SQLException e){
            
        }
}
public void Combobox3(){
       koneksi = Koneksi.getkoneksi();
        PreparedStatement prepare = null;
        ResultSet result = null;

        try {
            String sql = "SELECT * FROM transaksi";
            prepare = koneksi.prepareStatement(sql);
            result = prepare.executeQuery();
            while (result.next()){
                cb_transaksi.addItem(result.getString("Nama_transaksi"));
            }
            
        }catch(SQLException e){
            
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pilih = new javax.swing.JButton();
        subtotal = new javax.swing.JTextField();
        input = new javax.swing.JButton();
        uang = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        inputt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_transaksi = new javax.swing.JComboBox<>();
        Id_transaksi = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        kode_transaksi = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        waktu = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        Kode_paket = new javax.swing.JTextField();
        Id_paket = new javax.swing.JTextField();
        cb_paket = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        barang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        berat = new javax.swing.JTextField();
        Id_pelanggan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Kode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Tanggal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        karyawann = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Id_karyawan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Kode_karyawan = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        pilih.setBackground(new java.awt.Color(0, 102, 102));
        pilih.setForeground(new java.awt.Color(255, 255, 255));
        pilih.setText("pilih");
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });

        subtotal.setEnabled(false);

        input.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        input.setForeground(new java.awt.Color(0, 102, 102));
        input.setText("Hitung");
        input.setEnabled(false);
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        uang.setEnabled(false);
        uang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uangKeyTyped(evt);
            }
        });

        kembalian.setEnabled(false);

        inputt.setBackground(new java.awt.Color(0, 102, 102));
        inputt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputt.setForeground(new java.awt.Color(255, 255, 255));
        inputt.setText("Input");
        inputt.setEnabled(false);
        inputt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputtActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Transaksi");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Id Transaksi");

        cb_transaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_transaksi.setEnabled(false);
        cb_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_transaksiActionPerformed(evt);
            }
        });

        Id_transaksi.setEnabled(false);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Kode Transaksi");

        kode_transaksi.setEnabled(false);
        kode_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_transaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cb_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kode_transaksi)
                            .addComponent(Id_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Id_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(kode_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        waktu.setEnabled(false);

        harga.setEnabled(false);
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        Kode_paket.setEnabled(false);
        Kode_paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kode_paketActionPerformed(evt);
            }
        });

        Id_paket.setEnabled(false);
        Id_paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_paketActionPerformed(evt);
            }
        });

        cb_paket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_paket.setEnabled(false);
        cb_paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_paketActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama paket");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Id paket");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kode paket");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga paket");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Waktu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(waktu)
                        .addComponent(Id_paket)
                        .addComponent(cb_paket, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Kode_paket, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_paket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Id_paket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Kode_paket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        barang.setEnabled(false);
        barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangActionPerformed(evt);
            }
        });
        barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barangKeyPressed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jenis Barang");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Berat Barang");

        berat.setEnabled(false);
        berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratActionPerformed(evt);
            }
        });
        berat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                beratKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                beratKeyTyped(evt);
            }
        });

        Id_pelanggan.setEnabled(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id pelanggan");

        Kode.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kode pelanggan");

        Nama.setEnabled(false);
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(Nama)
                            .addComponent(Id_pelanggan)
                            .addComponent(Kode)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(berat, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(berat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Uang");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Kembalian");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Total yang harus di bayarkan");

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Riwayat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(pilih)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(276, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(uang, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel15)
                                        .addGap(153, 153, 153)
                                        .addComponent(jLabel23))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(input)
                                .addGap(127, 127, 127)
                                .addComponent(inputt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jButton3)))))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel23))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pilih)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(inputt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addContainerGap())))
        );

        Tanggal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tanggal.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama karyawan");

        karyawann.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        karyawann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawannActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Id");

        Id_karyawan.setEnabled(false);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Kode Karyawan");

        Kode_karyawan.setEnabled(false);

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(table1);

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tanggal");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(karyawann, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Kode_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(karyawann, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(Id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(Kode_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void karyawannActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawannActionPerformed
String selct = karyawann.getSelectedItem().toString();
koneksi = Koneksi.getkoneksi();
PreparedStatement prepare = null;
ResultSet result = null;
try{
    String sql = "select * from karyawan where Nama_karyawan=?";
    prepare = koneksi .prepareStatement(sql);
    prepare.setString(1, selct);
    result = prepare.executeQuery();
    
    while (result.next()){
        int id = result.getInt("Id");
                int kodeKaryawan = result.getInt("Id_Karyawan");
                String nama = result.getString( "Nama_karyawan");
                
                Id_karyawan.setText(Integer.toString(id));
                Kode_karyawan.setText(Integer.toString(kodeKaryawan));
    }
}catch (SQLException e) {
            e.printStackTrace();
        }
pilih.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_karyawannActionPerformed

    private void inputtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputtActionPerformed
        detail_transaksi detail = new detail_transaksi();
        detail.setId_karyawan(Integer.parseInt(Id_karyawan.getText()));
        detail.setId_pelanggan(Integer.parseInt(Id_pelanggan.getText()));
        detail.setId_transaksi(Integer.parseInt(Id_transaksi.getText()));
        detail.setId_paket(Integer.parseInt(Id_paket.getText()));
        detail.setJenis_barang(barang.getText());
        detail.setBerat_barang(Integer.parseInt(berat.getText()));
        detail.setTotal(Integer.parseInt(subtotal.getText()));
        detail.setUang(Integer.parseInt(uang.getText()));
        detail.setKembalian(Integer.parseInt(kembalian.getText()));

        PreparedStatement prepare = null;
        try {
            String sql = "INSERT INTO detail_transaksi( Id_karyawan,Id_pelanggan, Id_Transaksi, Id_paket, Jenis_barang, Berat, Total_harga, Uang, Kembalian) " +
            "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            prepare = koneksi.prepareStatement(sql);
            prepare.setInt(1, detail.getId_karyawan());
            prepare.setInt(2, detail.getId_pelanggan());
            prepare.setInt(3, detail.getId_transaksi());
            prepare.setInt(4, detail.getId_paket());
            prepare.setString(5, detail.getJenis_barang());
            prepare.setInt(6,detail.getBerat_barang());
            prepare.setInt(7, detail.getTotal());
            prepare.setInt(8, detail.getUang());
            prepare.setInt(9, detail.getKembalian());

            prepare.executeUpdate();
            System.out.println("Berhasil insert data");
        } catch (SQLException e) {
            System.out.println("Gagal insert dengan kesalahan = " + e);
        } finally {
            if (prepare != null) {
                try {
                    prepare.close();
                } catch (SQLException e) {
                    System.out.println("Ada kesalahan = " + e);
                }
            }
        }
        detail.setKode_karyawan(Kode_karyawan.getText());
        detail.setNama_kayawan(karyawann.getSelectedItem().toString());
        detail.setKode_pelanggan(Kode.getText());
        detail.setNama_pelanggan(Nama.getText());
        detail.setKode_paket(Kode_paket.getText());
        detail.setNama_paket(cb_paket.getSelectedItem().toString());
        detail.setHarga_paket(Integer.parseInt(harga.getText()));
        detail.setWaktu(waktu.getText());
        detail.setNama_transaksi(cb_transaksi.getSelectedItem().toString());
 model.addRow(new Object[]{
                detail.getKode_karyawan(),
                detail.getNama_kayawan(),
                detail.getKode_pelanggan(),
                detail.getNama_kayawan(),
                detail.getKode_paket(),
                detail.getNama_paket(),
                detail.getHarga_paket(),
                detail.getWaktu(),
                detail.getNama_transaksi(),
                detail.getJenis_barang(),
                detail.getBerat_barang(),
                detail.getTotal(),
                detail.getUang(),
                detail.getKembalian(),
            });
 
 Id_karyawan.setText("");
 Kode_karyawan.setText("");
 Id_pelanggan.setText("");
 Kode.setText("");
 Nama.setText("");
 barang.setText("");
 berat.setText("");
 Id_paket.setText("");
 Kode_paket.setText("");
 harga.setText("");
 waktu.setText("");
 Id_transaksi.setText("");
 kode_transaksi.setText("");
 subtotal.setText("");
 uang.setText("");
 kembalian.setText("");
 karyawann.setEnabled(true);
 karyawann.requestFocus();
 inputt.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_inputtActionPerformed

    private void kode_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_transaksiActionPerformed

    private void cb_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_transaksiActionPerformed
        String selct = cb_transaksi.getSelectedItem().toString();
     koneksi = Koneksi.getkoneksi();
PreparedStatement prepare = null;
ResultSet result = null;
try{
    String sql = "select * from transaksi where Nama_transaksi=?";
    prepare = koneksi .prepareStatement(sql);
    prepare.setString(1, selct);
    result = prepare.executeQuery();
    
    while (result.next()){
        int id = result.getInt("Id");
                String kodetransaksi = result.getString("Kode_transaksi");
                String nama = result.getString("Nama_transaksi");
                
                Id_transaksi.setText(Integer.toString(id));
                kode_transaksi.setText(kodetransaksi);
               
    }
}catch (SQLException e) {
            e.printStackTrace();
        }
            uang.setEnabled(true);
            uang.requestFocus();
            input.setEnabled(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_cb_transaksiActionPerformed

    private void Id_paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_paketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_paketActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

        int tot = Integer.parseInt(subtotal.getText());
        int Uang = Integer.parseInt(uang.getText());
        if (Uang >= tot){
            int kembali = Uang - tot;
            kembalian.setText(Integer.toString(kembali));
            uang.setEnabled(false);
inputt.setEnabled(true);
input.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "Maaf Uang Anda kurang","Peringatan",JOptionPane.INFORMATION_MESSAGE);
            uang.setText("");
            input.setEnabled(true);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void beratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratActionPerformed

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        int selectedRow = jDynamicTable.getSelectedRow();

        if (selectedRow != -1) {
            // Mengambil data dari tabel
            String id = jDynamicTable.getValueAt(selectedRow, 0).toString();
            String kode = jDynamicTable.getValueAt(selectedRow, 1).toString();
            String nama = jDynamicTable.getValueAt(selectedRow, 2).toString();

            // Menampilkan data di text field
            Id_pelanggan.setText(id);
            Kode.setText(kode);
            Nama.setText(nama);
        } else {

        }
barang.setEnabled(true);
barang.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void cb_paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paketActionPerformed
        String selct = cb_paket.getSelectedItem().toString();
        koneksi = Koneksi.getkoneksi();
PreparedStatement prepare = null;
ResultSet result = null;
try{
    String sql = "select * from paket_laundry where Nama_paket=?";
    prepare = koneksi .prepareStatement(sql);
    prepare.setString(1, selct);
    result = prepare.executeQuery();
    
    while (result.next()){
        int id = result.getInt("Id");
                String kodepaket = result.getString("Kode_paket");
                int hargaa = result.getInt("Harga_1_kg");
                String wak = result.getString("Waktu");
                String nama = result.getString("Nama_paket");
                
                Id_paket.setText(Integer.toString(id));
                Kode_paket.setText(kodepaket);
                harga.setText(Integer.toString(hargaa));
                waktu.setText(wak);
    }
}catch (SQLException e) {
            e.printStackTrace();
        }
int ber =Integer.parseInt( berat.getText());
int har = Integer.parseInt(harga.getText());
int total = ber * har;
subtotal.setText(Integer.toString(total));
cb_transaksi.setEnabled(true);
cb_transaksi.requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_cb_paketActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void Kode_paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kode_paketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kode_paketActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
FromTampilan_menu menu = new FromTampilan_menu(null,false);
menu.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangActionPerformed
  
        // TODO add your handling code here:
    }//GEN-LAST:event_barangActionPerformed

    private void barangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barangKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (barang.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Jangan Dikosongkan","peringatan",JOptionPane.WARNING_MESSAGE); 
                barang.requestFocus();   
            }else{
                berat.setEnabled(true);
                berat.requestFocus();
                barang.setEnabled(false);
            }
  }
        // TODO add your handling code here:
    }//GEN-LAST:event_barangKeyPressed

    private void beratKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beratKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (berat.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Jangan Dikosongkan","peringatan",JOptionPane.WARNING_MESSAGE); 
                berat.requestFocus();   
            }else{
                cb_paket.setEnabled(true);
                cb_paket.requestFocus();
                berat.setEnabled(false);
            }
  }
        // TODO add your handling code here:
    }//GEN-LAST:event_beratKeyPressed

    private void beratKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beratKeyTyped
char c = evt.getKeyChar();
if(!Character.isDigit(c)) {
    evt.consume();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_beratKeyTyped

    private void uangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uangKeyTyped
char c = evt.getKeyChar();
if(!Character.isDigit(c)) {
    evt.consume();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_uangKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         while(tablemodel.getRowCount()>0){
            model.removeRow(0);  
        }
         karyawann.requestFocus();
         cb_paket.setEnabled(false);
         cb_transaksi.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Riwayat ri = new Riwayat();
ri.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(From_inputLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From_inputLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From_inputLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From_inputLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new From_inputLaundry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_karyawan;
    private javax.swing.JTextField Id_paket;
    private javax.swing.JTextField Id_pelanggan;
    private javax.swing.JTextField Id_transaksi;
    public static javax.swing.JTextField Kode;
    private javax.swing.JTextField Kode_karyawan;
    private javax.swing.JTextField Kode_paket;
    public static javax.swing.JTextField Nama;
    private javax.swing.JTextField Tanggal;
    private javax.swing.JTextField barang;
    private javax.swing.JTextField berat;
    private javax.swing.JComboBox<String> cb_paket;
    private javax.swing.JComboBox<String> cb_transaksi;
    private javax.swing.JTextField harga;
    private javax.swing.JButton input;
    private javax.swing.JButton inputt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> karyawann;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField kode_transaksi;
    private javax.swing.JButton pilih;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable table1;
    private javax.swing.JTextField uang;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}
