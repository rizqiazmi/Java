package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        short batas = input.nextShort();
        
        for ( int nilaiAwal = batas; nilaiAwal >= 1; nilaiAwal--) {
            System.out.println(nilaiAwal);
        }

    }

}