
package service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.karyawan;


public class Karyawan_service {
 private Connection koneksi;
     public Karyawan_service(){
      koneksi = Koneksi.getkoneksi();
     }
  public List<karyawan>Tampil(){
      PreparedStatement prepare = null;
      ResultSet result = null;
      List<karyawan>list = new ArrayList<>();
      try{
          String sql = "select * from karyawan";
          prepare = koneksi.prepareStatement(sql);
          result = prepare.executeQuery();
          while(result.next()){
              karyawan pel = new karyawan();
              pel.setId(result.getInt("Id"));
              pel.setKode_karyawan(result.getInt("Id_karyawan"));
              pel.setNama_karyawan(result.getString("Nama_karyawan"));
              pel.setGender(result.getString("Gender"));
              pel.setAlamat(result.getString("Alamat"));
              pel.setNo_telpn(result.getString("No_telepon"));
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
   public void insertproduk(karyawan kar){
       PreparedStatement prepare = null;
       try{
           String sql ="INSERT INTO karyawan(Id_Karyawan,Nama_karyawan,Gender,Alamat,No_telepon)"
                        + "VALUES (?,?,?,?,?)";
           prepare = koneksi.prepareStatement(sql);
           prepare.setInt(1, kar.getKode_karyawan());
           prepare.setString(2, kar.getNama_karyawan());
           prepare.setString(3, kar.getGender());
           prepare.setString(4, kar.getAlamat());
           prepare.setString(5, kar.getNo_telpn());
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
    public void Update_karywan (karyawan pel){
       PreparedStatement prepare = null;
       
       try{
           String sql = "UPDATE karyawan SET Id_karyawan=?,Nama_karyawan=?,Gender=?,Alamat=?,No_telepon=? where Id=?";
                   
           prepare = koneksi.prepareStatement(sql);
           
           prepare.setInt(1, pel.getKode_karyawan());
           prepare.setString(2,pel.getNama_karyawan() );
           prepare.setString(3,pel.getGender());
           prepare.setString(4,pel.getAlamat());
           prepare.setString(5,pel.getNo_telpn());
           prepare.setInt(6,pel.getId());
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
     public void delete_karyawan(int Id_karyawan){
       PreparedStatement prepare = null;
       
       try{
           String sql ="DELETE FROM karyawan WHERE Id=?";
           prepare= koneksi.prepareStatement(sql);
           prepare.setInt(1, Id_karyawan);
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
     public void TampilConbo(){
          koneksi = Koneksi.getkoneksi();
        PreparedStatement prepare = null;
        ResultSet result = null;

        try {
            String sql = "SELECT * FROM karyawan";
            prepare = koneksi.prepareStatement(sql);
            result = prepare.executeQuery();
            while (result.next()){
                karyawan kar = new karyawan();
              kar.setId(result.getInt("Id"));
              kar.setKode_karyawan(result.getInt("Id_Karyawan"));
            }
            
        }catch(SQLException e){
            
        }
     }
}
