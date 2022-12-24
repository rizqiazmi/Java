package com.tutorial;

public class Main {

    int tinggi = 150;
    String warna = "putih";

    public static void main(String[] args) {
        // namaKeals nama = new namaKelas();
        Main udin = new Main();
        udin.berlari("set ketoprak", 20);

    }

    // parameter
    // method = fungsi void
    void berlari(String suara, int angka){
        System.out.println("berlari " + suara + " " + angka);
    }

}