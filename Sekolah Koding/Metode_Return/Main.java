package com.tutorial;

public class Main {

    String warna = "putih";

    public static void main(String[] args) {

        Main nama = new Main();
        String variabel = nama.test();

        System.out.println(variabel);

    }

    // metode return
    // tipeData namafungsi(){ return warna; }
    String test(){
        warna = "hitam";
        return warna;

    }

}

