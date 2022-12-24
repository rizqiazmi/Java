package com.tutorial;

import kelasterbuka.util.*;

public class Main {
    public static void main(String[] args) {
        // public, private, default, dan protected

        // dengan access modifier public, dapat diakses
        Lain.methodPublic();

        // dengan access modifie private, tidak dapat diakses
        // Lain.methodPrivate();

        // karena ada dalam package yang sama, maka dapat diakses
        Lain.methodDefault();

        // karena ada dalam package yang sama, maka dapat diakses
        Lain.methodProtected();
        
        kelasterbuka.util.Aplikasi.dagingPublic();
        // kelasterbuka.util.Aplikasi.dagingPrivate(); tidak bisa
        // kelasterbuka.util.Aplikasi.dagingDefault(); tidak bisa
        // kelasterbuka.util.Aplikasi.dagingProtected(); tidak bisa
    }
}