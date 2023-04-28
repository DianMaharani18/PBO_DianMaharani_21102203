package com.Dian.PBO.pertemuan2;

import java.util.Scanner;

public class unguided1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~~~ PROGRAM MENAMPILKAN BILANGAN GENAP ~~~~~  ");

        System.out.print("Masukkan Batas Bilangan : ");
        int bilangan = scanner.nextInt();

            int p = 2;
            while (p <= bilangan) {
                System.out.println("Angka Genap :  " + p);
                if (p == bilangan) {
                    System.out.println("sudah selesai ya sayang <3 ");
                    break;
                }
                p += 2;
            }
        }
}
