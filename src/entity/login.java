/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author MyBook Hype
 */
public class login {
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_karyawan() {
        return Id_karyawan;
    }

    public void setId_karyawan(int Id_karyawan) {
        this.Id_karyawan = Id_karyawan;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
  private int Id;
  private int Id_karyawan;
   private String Username;
  private String Password;  
  
    private String karyawanNama;
   private String karyawanPosisi;

    public String getKaryawanNama() {
        return karyawanNama;
    }

    public void setKaryawanNama(String karyawanNama) {
        this.karyawanNama = karyawanNama;
    }

    public String getKaryawanPosisi() {
        return karyawanPosisi;
    }

    public void setKaryawanPosisi(String karyawanPosisi) {
        this.karyawanPosisi = karyawanPosisi;
    }
}
