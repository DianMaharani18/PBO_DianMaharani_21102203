package com.Dian.PBO.pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Perulangan For Ke- " + i);
        }
        System.out.println("Selesai Perulangan For");

        int j = 0;
        while (j < 10) {
            System.out.println("Perulangan While Ke- " + j);
            j++;
        }
        System.out.println("Selesai Perulangan While");

        int k = 10;
        do {
            System.out.println("Perulangan Do-While Ke- " + k);
            k --;
        } while (k > 0);
        System.out.println("Selesai Perulangan Do-While");
    }
}
