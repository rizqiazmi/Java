package com.tutorial;

public class Lain {
    // bagian ini dapat diakses oleh siapapun
    public static void methodPublic(){
        System.out.println("Lain:public");
        methodPrivate();
    }

    // hanya dapat diakses oleh class yang bersangkutan
    private static void methodPrivate(){
        System.out.println("Lain:private");
    }

    // hanya dapat diakses oleh class dalam package yang sama
    static void methodDefault(){
        System.out.println("Lain:default");
    }

    // hanya dapat diakses oleh class dalam package yang sama dan subclassnya.
    protected static void methodProtected(){
        System.out.println("Lain:protected");
    }
}