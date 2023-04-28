package com.Dian.PBO.pertemuan3;

public class Buku {
    private int no_buku;
    private String judul_buku;
    private String pengarang;
    private int tahun_terbit;
    private int harga;

    public int getNo_buku() {
        return no_buku;
    }

    public void setNo_buku(int no_buku) {
        this.no_buku = no_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Buku(int no_buku, String judul_buku, String pengarang, int tahun_terbit, int harga) {
        this.no_buku = no_buku;
        this.judul_buku = judul_buku;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
        this.harga = harga;

    }
}
