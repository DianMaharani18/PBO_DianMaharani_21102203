package com.Dian.PBO.pertemuan4;

public class WarungMakan extends Menu {
    private String namaWarung;
    private String alamatWarung;
    private String noTelp;

    public String getNamaWarung() {
        return namaWarung;
    }

    public void setNamaWarung(String namaWarung) {
        this.namaWarung = namaWarung;
    }

    public String getAlamatWarung() {
        return alamatWarung;
    }

    public void setAlamatWarung(String alamatWarung) {
        this.alamatWarung = alamatWarung;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void detailWarung() {
        System.out.println("Warung  : " + namaWarung);
        System.out.println("Alamat  : " + alamatWarung);
        System.out.println("No Telp : " + noTelp);
    }


    public void beliMakanan(Menu menu, int jumlah) {
        if (menu.getStock() < jumlah ){
            System.out.println("Stok Tidak Cukup");
            System.exit(0);
        }
        System.out.println("<<<< Detail Pembelian >>>>");
        System.out.println("Nama Makanan  : " + menu.getNamaMakanan());
        System.out.println("Harga Satuan  : " + menu.getHarga());
        System.out.println("Jumlah Beli   : " + jumlah);
        menu.totalHarga(jumlah);
        System.out.println("<<<< Detail Pembelian)");

        int stok = menu.getStock() - jumlah;
        menu.setStock(stok);

    }
    public void cekStock(Menu menu, int jumlah){
        System.out.println("Sisa Stok     : " + menu.getStock());
    }
}




