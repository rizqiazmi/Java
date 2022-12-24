package com.tutorial;

public class Main {

    int tinggi;
    String warna;

    public Main(int tinggi, String warna){
        this.tinggi = tinggi;
        this.warna = warna;
    }

    public static void main(String[] args) {
        
        Main test = new Main(100, "putih");
        Main test2 = new Main(120, "hitam");

        System.out.println(test.tinggi + " " + test.warna);
        System.out.println(test2.tinggi + " " + test2.warna);

    }
}