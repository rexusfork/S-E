package com.example.uasmobileprogramming.model;

public class transaksi {
    private int id_transaksi;
    private int id_user;
    private int id_fashion;
    private int id_image;
    private String nama_fashion;
    private String price;
    private String waktu_transaksi;
    private String tanggal_transaksi;
    private String metode_pembayaran;

    public transaksi(){

    }

    public transaksi(int id_image, String nama_fashion, String price, String waktu_transaksi, String tanggal_transaksi) {
        this.id_image = id_image;
        this.nama_fashion = nama_fashion;
        this.price = price;
        this.waktu_transaksi = waktu_transaksi;
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public transaksi(int id_transaksi, int id_user, int id_fashion, int id_image, String nama_fashion, String price, String waktu_transaksi, String tanggal_transaksi, String metode_pembayaran) {
        this.id_transaksi = id_transaksi;
        this.id_user = id_user;
        this.id_fashion = id_fashion;
        this.id_image = id_image;
        this.nama_fashion = nama_fashion;
        this.price = price;
        this.waktu_transaksi = waktu_transaksi;
        this.tanggal_transaksi = tanggal_transaksi;
        this.metode_pembayaran = metode_pembayaran;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getWaktu_transaksi() {
        return waktu_transaksi;
    }

    public void setWaktu_transaksi(String waktu_transaksi) {
        this.waktu_transaksi = waktu_transaksi;
    }

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public String getMetode_pembayaran() {
        return metode_pembayaran;
    }

    public void setMetode_pembayaran(String metode_pembayaran) {
        this.metode_pembayaran = metode_pembayaran;
    }

    public int getId_fashion() {
        return id_fashion;
    }

    public void setId_fashion(int id_fashion) {
        this.id_fashion = id_fashion;
    }

    public String getNama_fashion() {
        return nama_fashion;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public void setNama_fashion(String nama_fashion) {
        this.nama_fashion = nama_fashion;
    }
}
