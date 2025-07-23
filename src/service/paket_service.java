/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.paket;
public class paket_service {
   private Connection koneksi;
     public paket_service(){
      koneksi = Koneksi.getkoneksi();
     }
     public List<paket>Tampil(){
      PreparedStatement prepare = null;
      ResultSet result = null;
      List<paket>list = new ArrayList<>();
      try{
          String sql = "select * from paket_laundry";
          prepare = koneksi.prepareStatement(sql);
          result = prepare.executeQuery();
          while(result.next()){
              paket pel = new paket();
              pel.setId(result.getInt("Id"));
              pel.setKode_paket(result.getString("Kode_paket"));
              pel.setNama_paket(result.getString("Nama_paket"));
              pel.setHarga(result.getInt("Harga_1_kg"));
              pel.setWaktu(result.getString("Waktu"));
              list.add(pel);
          }
          return list;
      }catch (SQLException e){
          System.out.println("keterangan" + e);
           return list;
      }finally{
          if(prepare != null){
               try {
                   prepare.close();
               }catch(SQLException e){
                   System.out.println(e);
               }
      }
         if (result != null){
               try{
                   result.close();
               }catch (SQLException e){
                   System.out.println(e);
               }
           }       
      }
  }
     public void insertproduk(paket pel){
       PreparedStatement prepare = null;
       try{
           String sql ="INSERT INTO paket_laundry(Kode_paket,Nama_paket,Harga_1_kg,Waktu)"
                        + "VALUES (?,?,?,?)";
           prepare = koneksi.prepareStatement(sql);
           prepare.setString(1, pel.getKode_paket());
           prepare.setString(2, pel.getNama_paket());
           prepare.setInt(3, pel.getHarga());
           prepare.setString(4, pel.getWaktu());
           prepare.executeUpdate();
           System.out.println("Berhasil insert data");
       }catch (SQLException e){
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
           public void Update_pelanggan (paket pel){
       PreparedStatement prepare = null;
       
       try{
           String sql = "UPDATE paket_laundry SET Nama_Paket=?,Harga_1_kg=?,Waktu=? where Id=?";
                   
           prepare = koneksi.prepareStatement(sql);
           
           prepare.setString(1, pel.getNama_paket());
           prepare.setInt(2,pel.getHarga());
           prepare.setString(3,pel.getWaktu());
           prepare.setInt(4,pel.getId());
           prepare.executeUpdate();
           System.out.println("berhasil update");
       }catch (SQLException ex){
         System.out.println("gagal update dengan error" + ex);
         
       }finally{
           if (prepare!=null){
               try{
                   prepare.close();
               }catch (SQLException ex){
                   
               }               
           }  
       }
           }
       public void delete_pelanggan(int Id_paket){
       PreparedStatement prepare = null;
       
       try{
           String sql ="DELETE FROM paket_laundry WHERE Id=?";
           prepare= koneksi.prepareStatement(sql);
           prepare.setInt(1, Id_paket);
           prepare.executeUpdate();
           System.out.println("berhasil delete");
           
       }catch(SQLException ex){
           System.out.println ("gagal update dengan error" + ex);
       }finally{
           if (prepare != null){
               try{
               prepare.close();
               }catch (SQLException ex){
                   
               }
           }
       }
   }
}
