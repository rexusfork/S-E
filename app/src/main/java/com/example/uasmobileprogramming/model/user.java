package com.example.uasmobileprogramming.model;

public class user {
    private int id_user;
    private String nama, email, alamat, no_telephone, password;
    private long saldo;

    public user(){

    }

    public user(int id_user, String nama, String email, String alamat, String no_telephone, String password, long saldo) {
        this.id_user = id_user;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.no_telephone = no_telephone;
        this.password = password;
        this.saldo = saldo;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telephone() {
        return no_telephone;
    }

    public void setNo_telephone(String no_telephone) {
        this.no_telephone = no_telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
}
