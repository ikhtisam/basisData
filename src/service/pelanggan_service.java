/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import entity.pelanggan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class pelanggan_service {
 private Connection koneksi;
     public pelanggan_service(){
      koneksi = Koneksi.getkoneksi();
     }
  public List<pelanggan>Tampil(){
      PreparedStatement prepare = null;
      ResultSet result = null;
      List<pelanggan>list = new ArrayList<>();
      try{
          String sql = "select * from pelanggan";
          prepare = koneksi.prepareStatement(sql);
          result = prepare.executeQuery();
          while(result.next()){
              pelanggan pel = new pelanggan();
              pel.setId_pelanggan(result.getInt("Id"));
              pel.setKode_pelanggan(result.getString("Kode_pelanggan"));
              pel.setNama(result.getString("Nama_pelanggan"));
              pel.setGender(result.getString("Gender"));
              pel.setAlamat(result.getString("Alamat"));
              pel.setNo_telp(result.getString("No_telepon"));
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
  public void insertproduk(pelanggan pel){
       PreparedStatement prepare = null;
       try{
           String sql ="INSERT INTO pelanggan(Kode_pelanggan,Nama_pelanggan,Gender,Alamat,No_telepon)"
                        + "VALUES (?,?,?,?,?)";
           prepare = koneksi.prepareStatement(sql);
           prepare.setString(1, pel.getKode_pelanggan());
           prepare.setString(2, pel.getNama());
           prepare.setString(3, pel.getGender());
           prepare.setString(4, pel.getAlamat());
           prepare.setString(5, pel.getNo_telp());
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
           public void Update_pelanggan (pelanggan pel){
       PreparedStatement prepare = null;
       
       try{
           String sql = "UPDATE pelanggan SET Nama_pelanggan=?,Gender=?,Alamat=?,No_telepon=? where Id=?";
                   
           prepare = koneksi.prepareStatement(sql);
           
           prepare.setString(1, pel.getNama());
           prepare.setString(2,pel.getGender() );
           prepare.setString(3,pel.getAlamat());
           prepare.setString(4,pel.getNo_telp());
           prepare.setInt(5,pel.getId_pelanggan());
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
       public void delete_pelanggan(int Id_pelanggan){
       PreparedStatement prepare = null;
       
       try{
           String sql ="DELETE FROM pelanggan WHERE Id=?";
           prepare= koneksi.prepareStatement(sql);
           prepare.setInt(1, Id_pelanggan);
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
       
   


