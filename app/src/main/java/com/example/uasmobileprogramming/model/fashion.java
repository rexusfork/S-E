package com.example.uasmobileprogramming.model;

public class fashion {
    private int id_fashion;
    private String nama_fashion, category_fashion, description;
    private long price;

    public fashion(){

    }

    public fashion(int id_fashion, String nama_fashion, String category_fashion, String description, long price) {
        this.id_fashion = id_fashion;
        this.nama_fashion = nama_fashion;
        this.category_fashion = category_fashion;
        this.description = description;
        this.price = price;
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

    public void setNama_fashion(String nama_fashion) {
        this.nama_fashion = nama_fashion;
    }

    public String getCategory_fashion() {
        return category_fashion;
    }

    public void setCategory_fashion(String category_fashion) {
        this.category_fashion = category_fashion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
