package com.Dian.PBO.pertemuan2;

public class Break {
    public static void main(String[] args) {
        int p = 0;
        while (p <= 100) {
            System.out.println("Perulangan Ke- " + p);
            if (p == 50) {
                System.out.println("Capek Woi !");
                break;
            }
            p += 10;
        }
    }
}
