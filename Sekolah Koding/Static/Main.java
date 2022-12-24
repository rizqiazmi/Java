package com.tutorial;

public class Main {

   static int tinggi; 
   String warna;

    public static void main(String[] args) {
        // Main test = new Main();
        tinggi = 200;
        System.out.println(get_tinggi());
    }

    // static hanya mendeklarasi variabel static sendiri
    static int get_tinggi(){
        printWarna();
        this.tinggi = 250;
        return warna;
    }

    void printWarna(){
        System.out.println(warna);
    }

}