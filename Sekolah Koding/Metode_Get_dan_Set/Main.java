package com.tutorial;

public class Main {

    int tinggi = 150;
    String warna = "putih";

    public static void main(String[] args) {
        Main andi = new Main();
        System.out.println(andi.warna);
        andi.setWarna("hitam");
        String warnaBaru = andi.getWarna();

        System.out.println(warnaBaru);

    }
    // metode set dan get

    // metode set = void
    void setWarna(String warnaParameter){
        warna = warnaParameter;
    }

    // method get = return
    String getWarna(){
        return warna;
    }

}