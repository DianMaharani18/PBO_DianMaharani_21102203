package com.Dian.PBO.pertemuan5;

public class main {
    public static void main(String[] args){
        barang[] keranjang = new barang[10];

        barang[] etalase = {
                new barang("indomie", 2000),
                new barang("mie sedap", 2000),
                new barang("beras", 12000),
                new barang("gula", 15000),
        };

        //melihat panjang array
        System.out.println("banyak barang di etalase : " +etalase.length);

        //menampilkan array ke-i
        //etalase[0].showInfo();

        //menampilkan daftar barang dalam array
        System.out.println("daftar barang dalam etalase : ");

        //for yg tdk diketahui panjangnya berapa
//        int i = 1;
//        for(barang barang : etalase){
//            System.out.println("barang ke-" + i);
//            barang.showInfo();
//            i++;
//        }

        //for yang harus diketahui panjang array
        for (int j=0; j<etalase.length; j++){
            System.out.println("Barang ke-" +(j+1));
            etalase[j].showInfo();
        }

        //memasukkan barang ke keranjang
        keranjang[0] = etalase[0];
        System.out.println("barang di keranjang :");
        keranjang[0].showInfo();
    }
}
