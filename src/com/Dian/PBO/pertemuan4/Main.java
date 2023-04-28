package com.Dian.PBO.pertemuan4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WarungMakan warung = new WarungMakan();
        warung.setNamaWarung("Rumah Makan Nasi Goyeng");
        warung.setAlamatWarung("Jl. kemana aja 123");
        warung.setNoTelp("081312345432");

        Menu nasiGoreng = new Menu();
        nasiGoreng.setNomor(1);
        nasiGoreng.setNamaMakanan("Nasi Goreng");
        nasiGoreng.setHarga(10000);
        nasiGoreng.setStock(10);

        Menu nasiGorengS = new Menu();
        nasiGorengS.setNomor(2);
        nasiGorengS.setNamaMakanan("Nasi Goreng Spesial");
        nasiGorengS.setHarga(15000);
        nasiGorengS.setStock(4);

        Menu nasiGorengST = new Menu();
        nasiGorengST.setNomor(3);
        nasiGorengST.setNamaMakanan("Nasi Goreng Spesial + Telur");
        nasiGorengST.setHarga(20000);
        nasiGorengST.setStock(20);

        System.out.println("<<<< RUMAH MAKAN NASI GOYENG >>>>");
        warung.detailWarung();
        System.out.println("<<<< MENU MAKANAN >>>>");
        nasiGoreng.detailMakanan();
        nasiGorengS.detailMakanan();
        nasiGorengST.detailMakanan();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nomor Makanan  : ");
        int nomormakanan = input.nextInt();
        System.out.print("Masukkan Jumlah Makanan : ");
        int jumlahmakanan = input.nextInt();

        if (nomormakanan == 1){
            warung.beliMakanan(nasiGoreng, jumlahmakanan);
            int totalharga = jumlahmakanan * nasiGoreng.getHarga();
            System.out.println("Total Harga   : " + totalharga);
            warung.cekStock(nasiGoreng, jumlahmakanan);
            System.out.println();

        } else if (nomormakanan == 2) {
            warung.beliMakanan(nasiGorengS, jumlahmakanan);
            int totalharga = jumlahmakanan * nasiGorengS.getHarga();
            System.out.println("Total Harga   : " + totalharga);
            warung.cekStock(nasiGorengS, jumlahmakanan);
            System.out.println();

        } else if (nomormakanan == 3) {
            warung.beliMakanan(nasiGorengST, jumlahmakanan);
            int totalharga = jumlahmakanan * nasiGorengST.getHarga();
            System.out.println("Total Harga   : " + totalharga);
            warung.cekStock(nasiGorengST, jumlahmakanan);
            System.out.println();

        } else {
            System.out.println("Menu Tidak Tersedia");
        }

    }
}



//                Manager manager = new Manager();
//                Pegawai pegawai = new Pegawai();
//
//                manager.nip = 181910024;
//                manager.nama = "Basuki";
//
//                pegawai.nip = 191220032;
//                pegawai.nama = "Ahmad";
//
//                manager.showInfo();
//                manager.extraInfo();
//                manager.bonus(1000000);
//                manager.bonus();
//
//                pegawai.showInfo();
//                pegawai.extraInfo();