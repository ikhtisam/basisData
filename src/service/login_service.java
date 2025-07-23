/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.login;
/**
 * 
 *
 * @author MyBook Hype
 */
public class login_service {
    private Connection koneksi;
    public login ceklogin (String Username, String Password){
     koneksi = Koneksi.getkoneksi();
        PreparedStatement prepare = null;
        ResultSet result = null;
        login Login = null;
        try{
            String sql = "Select * from login where Username = ? and Password = md5(?) ";
            prepare = koneksi.prepareStatement(sql);
            prepare.setString(1, Username);
            prepare.setString(2, Password);
            result = prepare.executeQuery();
            if(result.next()){
                Login = new login();
                Login.setId(result.getInt("Id"));
                Login.setId_karyawan(result.getInt("Id_karyawan"));
                Login.setUsername(result.getString("Username"));
                Login.setPassword(result.getString("Password"));
               
            }
            return Login;
        }catch(SQLException ex){
            System.out.print("Ada yang salah dengan query" + ex);
            return Login;
        }finally{
            if (prepare != null){
                try {
                    prepare.close();
                }catch(SQLException ex){                  
                }
            }
            if (result !=null){
                try {
                    result.close();
                }catch(SQLException ex){
                    
                }
            }
        }
        
    }
   
}
            
      
