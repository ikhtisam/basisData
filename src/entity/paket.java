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
public class paket {

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getKode_paket() {
        return Kode_paket;
    }

    public void setKode_paket(String Kode_paket) {
        this.Kode_paket = Kode_paket;
    }

    public String getNama_paket() {
        return Nama_paket;
    }

    public void setNama_paket(String Nama_paket) {
        this.Nama_paket = Nama_paket;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
    @TableColumn(number=1,name="Id")
    int Id;
    @TableColumn(number=2,name="Kode paket")
    String Kode_paket;
    @TableColumn(number=3,name="Nama paket")
    String Nama_paket;
    @TableColumn(number=4,name="Harga")
    int Harga;
    @TableColumn(number=5,name="Waktu")
    String waktu;
}
