//package com.Dian.PBO.pertemuan3;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Buku buku1 = new Buku(
//                1,
//                "Pemrograman Berbasis Objek dengan Java",
//                "Indrajani",
//                2007,
//                70000);
//        Buku buku2 = new Buku(
//                2,
//                "Dasar Pemrograman Java",
//                "Abdul Kadir",
//                2004,
//                30000);
//
//        // tampilkan detail buku
//        System.out.println("Detail Buku:");
//        System.out.println("No Buku: " + buku1.getNo_buku());
//        System.out.println("Judul Buku: " + buku1.getJudul_buku());
//        System.out.println("Pengarang: " + buku1.getPengarang());
//        System.out.println("Tahun Terbit: " + buku1.getTahun_terbit());
//        System.out.println("Harga: " + buku1.getHarga() + "\n");
//
//        System.out.println("No Buku: " + buku2.getNo_buku());
//        System.out.println("Judul Buku: " + buku2.getJudul_buku());
//        System.out.println("Pengarang: " + buku2.getPengarang());
//        System.out.println("Tahun Terbit: " + buku2.getTahun_terbit());
//        System.out.println("Harga: " + buku2.getHarga() + "\n");
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Masukkan nomor buku yang ingin dibeli: ");
//        int nomorBuku = input.nextInt();
//        System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
//        int jumlahBuku = input.nextInt();
//
//        Buku bukuPilihan = null;
//
//        if (nomorBuku == buku1.getNo_buku()) {
//            bukuPilihan = buku1;
//        } else if (nomorBuku == buku2.getNo_buku()) {
//            bukuPilihan = buku2;
//        } else {
//            System.out.println("Nomor buku tidak valid.");
//            System.exit(0);
//        }
//
//        int totalHarga = jumlahBuku * bukuPilihan.getHarga();
//
//        System.out.println("Total harga: " + totalHarga);
//
//        System.out.print("Masukkan jumlah uang: ");
//        int jumlahUang = input.nextInt();
//
//        if (jumlahUang < totalHarga) {
//            System.out.println("Maaf bro uang Anda tidak cukup.");
//            System.exit(0);
//        }
//
//        int kembalian = jumlahUang - totalHarga;
//
//        System.out.println();
//        System.out.println("Rincian Pembelian Buku");
//        System.out.println("No. buku: " + bukuPilihan.getNo_buku());
//        System.out.println("Judul buku: " + bukuPilihan.getJudul_buku());
//        System.out.println("Pengarang: " + bukuPilihan.getPengarang());
//        System.out.println("Tahun terbit : " + bukuPilihan.getTahun_terbit());
//        System.out.println("Harga : " + bukuPilihan.getHarga());
//
//        System.out.println();
//        System.out.println("Rincian Pembayaran");
//        System.out.println("Jumlah Uang Dibayarkan: " + jumlahUang);
//        System.out.println("Kembalian : " + kembalian);
//    }
//}
//
//
//
////    public static void main(String[] args) {
////        SepedaMotor suzuki = new SepedaMotor(
////                "Suzuki",
////                "DSX 150R",
////                200000000);
////        SepedaMotor yamaha = new SepedaMotor(
////                "Yamaha",
////                "YZF R15",
////                250000000);
////        SepedaMotor honda = new SepedaMotor(
////                "Honda",
////                "CBR 150R",
////                235000000);
////
//////jalankan method dari showInfo
////        suzuki.showInfo();
////        yamaha.showInfo();
////        honda.showInfo();
////
//////uji coba getter & setter
////        System.out.println("Motor merek " + suzuki.getMerek() + "dengan tipe (before) : " + suzuki.getTipe());
////        suzuki.setTipe("Satria FU");
////        System.out.println("Motor merek " + suzuki.getMerek() + "dengan tipe (after   : " + suzuki.getTipe());
////    }
////}
//
////    public static void main(String[] args) {
////        // buat barang pertama
////        Koperasi barang1 = new Koperasi();
////        barang1.setNamaBarang("Buku Tulis");
////        barang1.setHargaBarang(5000);
////        barang1.setJumlahBarang(10);
////
////        // buat barang kedua
////        Koperasi barang2 = new Koperasi();
////        barang2.setNamaBarang("Pensil");
////        barang2.setHargaBarang(3000);
////        barang2.setJumlahBarang(20);
////
////        // tampilkan detail barang
////        System.out.println("Nama Barang: " + barang1.getNamaBarang());
////        System.out.println("Harga Satuan: " + barang1.getHargaBarang());
////        System.out.println("Jumlah Barang: " + barang1.getJumlahBarang());
////        System.out.println("Total Harga: " + barang1.getHargaBarang()*barang1.getJumlahBarang() + "\n");
////
////        System.out.println("Nama Barang: " + barang2.getNamaBarang());
////        System.out.println("Harga Satuan: " + barang2.getHargaBarang());
////        System.out.println("Jumlah Barang: " + barang2.getJumlahBarang());
////        System.out.println("Total Harga: " + barang2.getHargaBarang()*barang2.getJumlahBarang() + "\n");
////
////        // tampilkan total semua harga barang yang telah dibuat
////        int totalHarga = barang1.getHargaBarang()*barang1.getJumlahBarang() + barang2.getHargaBarang()*barang2.getJumlahBarang();
////        System.out.println("Total Semua Harga Barang: " + totalHarga);
////    }
