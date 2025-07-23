/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MyBook Hype
 */
public class Koneksi {
       private static Connection koneksi;
    public static Connection getkoneksi(){
    if (koneksi == null){
    try {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        String url = "jdbc:mysql://localhost:3306/laundrykumbahklambi";
        String user = "root";
        String pass = "";
        
        koneksi = DriverManager.getConnection(url, user,pass);
        System.out.println("Koneksi Sukses");
        
    }catch (SQLException e){
         e.printStackTrace();
        System.out.println("Koneksi gagal" + e);
    }
}
    return koneksi;
    }
}
