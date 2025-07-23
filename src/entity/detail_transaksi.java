/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author MyBook Hype
 */
public class detail_transaksi {
 private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public int getId_karyawan() {
        return Id_karyawan;
    }

    public void setId_karyawan(int Id_karyawan) {
        this.Id_karyawan = Id_karyawan;
    }

    public String getKode_karyawan() {
        return Kode_karyawan;
    }

    public void setKode_karyawan(String Kode_karyawan) {
        this.Kode_karyawan = Kode_karyawan;
    }

    public String getNama_kayawan() {
        return Nama_kayawan;
    }

    public void setNama_kayawan(String Nama_kayawan) {
        this.Nama_kayawan = Nama_kayawan;
    }

    public int getId_pelanggan() {
        return Id_pelanggan;
    }

    public void setId_pelanggan(int Id_pelanggan) {
        this.Id_pelanggan = Id_pelanggan;
    }

    public String getKode_pelanggan() {
        return Kode_pelanggan;
    }

    public void setKode_pelanggan(String Kode_pelanggan) {
        this.Kode_pelanggan = Kode_pelanggan;
    }

    public String getNama_pelanggan() {
        return Nama_pelanggan;
    }

    public void setNama_pelanggan(String Nama_pelanggan) {
        this.Nama_pelanggan = Nama_pelanggan;
    }

    public String getJenis_barang() {
        return Jenis_barang;
    }

    public void setJenis_barang(String Jenis_barang) {
        this.Jenis_barang = Jenis_barang;
    }

    public int getBerat_barang() {
        return berat_barang;
    }

    public void setBerat_barang(int berat_barang) {
        this.berat_barang = berat_barang;
    }

    public int getId_paket() {
        return Id_paket;
    }

    public void setId_paket(int Id_paket) {
        this.Id_paket = Id_paket;
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

    public int getHarga_paket() {
        return Harga_paket;
    }

    public void setHarga_paket(int Harga_paket) {
        this.Harga_paket = Harga_paket;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String Waktu) {
        this.Waktu = Waktu;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    int Id_karyawan;
    String Kode_karyawan;
    String Nama_kayawan;
    int Id_pelanggan;
    String Kode_pelanggan;
    String Nama_pelanggan;
    String Jenis_barang;
    int berat_barang;
    int Id_paket;
    String Kode_paket;
    String Nama_paket;
    int Harga_paket;
    String Waktu;
    int Total;

  public LocalDate getTanggal() {
        return tanggal;
    }

    public void settanggal(String tanggal) {
        this.tanggal = LocalDate.parse(tanggal);
    }
    
    private LocalDate tanggal;

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }
    int uang;
    int kembalian;
    int id_transaksi;

    public String getNama_transaksi() {
        return Nama_transaksi;
    }

    public void setNama_transaksi(String Nama_transaksi) {
        this.Nama_transaksi = Nama_transaksi;
    }
       String Nama_transaksi;     
            
}
