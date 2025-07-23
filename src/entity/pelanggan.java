/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import com.stripbandunk.jwidget.annotation.TableColumn;
/**
 *
 * @author MyBook Hype
 */
public class pelanggan {
  @TableColumn(number=1,name="Id Pelanggan")
 int Id_pelanggan;

    public String getKode_pelanggan() {
        return Kode_pelanggan;
    }

    public void setKode_pelanggan(String Kode_pelanggan) {
        this.Kode_pelanggan = Kode_pelanggan;
    }
 @TableColumn(number=2,name="Kode Pelanggan")
 String Kode_pelanggan;
 @TableColumn(number=3,name="Nama")
 String Nama;
 @TableColumn(number=4,name="Gender")
 String Gender;
 @TableColumn(number=5,name="Alamat")
 String Alamat;
 @TableColumn(number=6,name="No Telepon")
 String No_telp;

    public String getNo_telp() {
        return No_telp;
    }

    public void setNo_telp(String No_telp) {
        this.No_telp = No_telp;
    }
    public int getId_pelanggan() {
        return Id_pelanggan;
    }

    public void setId_pelanggan(int Id_pelanggan) {
        this.Id_pelanggan = Id_pelanggan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
  
}
