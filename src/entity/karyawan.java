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
public class karyawan {

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getKode_karyawan() {
        return Kode_karyawan;
    }

    public void setKode_karyawan(int Kode_karyawan) {
        this.Kode_karyawan = Kode_karyawan;
    }

    public String getNama_karyawan() {
        return Nama_karyawan;
    }

    public void setNama_karyawan(String Nama_karyawan) {
        this.Nama_karyawan = Nama_karyawan;
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

    public String getNo_telpn() {
        return No_telpn;
    }

    public void setNo_telpn(String No_telpn) {
        this.No_telpn = No_telpn;
    }
    @TableColumn(number=1,name="Id")
    int Id;
    @TableColumn(number=2,name="Kode Pegawai")
    int Kode_karyawan;
    @TableColumn(number=3,name="Nama karyawan")
    String Nama_karyawan;
    @TableColumn(number=4,name="Gender")
    String Gender;
    @TableColumn(number=5,name="Alamat")
    String Alamat;
    @TableColumn(number=6,name="No telepon")
    String No_telpn;

   
}
