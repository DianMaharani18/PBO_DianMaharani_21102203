package com.Dian.PBO.pertemuan5;

public class barang {
    // atributs
    String nama;
    int harga;

    //constructor
    public barang(){}

    public barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    //method
    public void showInfo(){
        System.out.println("Nama Barang  : " + this.nama);
        System.out.println("Harga Barang : " +this.harga);
        System.out.println();
    }
}
