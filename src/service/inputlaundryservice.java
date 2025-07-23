/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.detail_transaksi;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.text.ParseException;
/**
 *
 * @author MyBook Hype
 */
public class inputlaundryservice {
    private Connection koneksi;
    public inputlaundryservice(){
        koneksi = Koneksi.getkoneksi();
    }
    public void insertdetail(detail_transaksi detail){
        PreparedStatement prepare = null;
        try {
            String sql = "insert into detail_transaksi(Id_karyawan,Id_pelanggan,Id_Transaksi,Id_paket,Jenis_barang,Berat,Total_harga,Uang,Kembalian)"
                    + "values(?,?,?,?,?,?,?,?,?)";
            prepare = koneksi.prepareStatement(sql);
            prepare.setInt(1,detail.getId_karyawan());
            prepare.setInt(2, detail.getId_pelanggan());
            prepare.setInt(3, detail.getId_transaksi());
            prepare.setInt(4, detail.getId_paket());
            prepare.setString(5, detail.getJenis_barang());
            prepare.setInt(6, detail.getBerat_barang());
            prepare.setInt(7, detail.getTotal());
            prepare.setInt(8, detail.getUang());
            prepare.setInt(9, detail.getKembalian());
            prepare.executeUpdate();
            System.out.println("Berhasil insert data");
            
        }catch(SQLException e){
               System.out.println("gagal update dengan kesalahan = " + e);
        }finally {
           if(prepare != null){
               try{
                   prepare.close();
               }catch(SQLException e){
           System.out.println("ada kesalahan = " + e);
               }
           }
       }
    }
}
