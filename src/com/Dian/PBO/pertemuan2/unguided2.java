package com.Dian.PBO.pertemuan2;

import java.util.Scanner;

public class unguided2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("~~~~~ PROGRAM FORM PENDAFTARAN MAHASISWA ~~~~~");

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        if (nama.isEmpty()) {
            System.out.println("ERROR!! nama tidak boleh kosong!");
            System.exit(0);
        }

        System.out.print("Masukkan Umur: ");
        int umur = scanner.nextInt();
        if (umur < 17) {
            System.out.println("ERROR!! belum cukup umur dek!");
            System.exit(0);
        }

        System.out.println("Pilih Jurusan");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Rekayasa Perangkat Lunak");

        System.out.print("Masukkan Pilihan: ");

        int jurusan = scanner.nextInt();
        if (jurusan == 1) {
            System.out.println("~~~~~ DATA MAHASISWA ~~~~~");
            System.out.println("Nama    : " + nama);
            System.out.println("Umur    : " + umur);
            System.out.println("Jurusan : " + "Teknik Informatika");
        } else if (jurusan == 2) {
            System.out.println("~~~~~ DATA MAHASISWA ~~~~~");
            System.out.println("Nama    : " + nama);
            System.out.println("Umur    : " + umur);
            System.out.println("Jurusan : " + "Sistem Informasi");
        } else if (jurusan == 3) {
            System.out.println("~~~~~ DATA MAHASISWA ~~~~~");
            System.out.println("Nama    : " + nama);
            System.out.println("Umur    : " + umur);
            System.out.println("Jurusan : " + "Rekayasa Perangkat Lunak");
        }
    }

    }

