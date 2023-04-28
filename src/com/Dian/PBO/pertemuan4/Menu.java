package com.Dian.PBO.pertemuan4;

public class Menu {
    private int nomor;
    private String namaMakanan;
    private int harga;
    private int stock;

    public void detailMakanan() {
        System.out.println("Nomor Makanan : " + nomor);
        System.out.println("Nama Makanan  : " + namaMakanan);
        System.out.println("Harga Makanan : " + harga);
        System.out.println("Stock Makanan : " + stock);
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int totalHarga(int jumlah) {
        return harga * jumlah;
    }
}

