package com.teknologiinformasi.restapi.order.model;

//model produk berperan sebagai DTO(Data Transfer Object)
public class Produk {
    private Long id;
    private String nama;
    private Double harga;
    private String deskripsi;
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Double getHarga() {
        return harga;
    }
    
    public void setHarga(Double harga) {
        this.harga = harga;
    }

     public String getDeskripsi() {
       return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
       this.deskripsi = deskripsi;
    }
}