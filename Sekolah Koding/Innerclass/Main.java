package com.tutorial;

class luar {

    private int x = 10;

    class dalam{
        void tebak(){
            System.out.println("tebak: " + x);
        }
    }

    void tampilkan(){
        dalam d = new dalam();
        d.tebak();
    }
}

class Main {

    public static void main(String[] args) {
        luar l = new luar();
        l.tampilkan();
    }   
}