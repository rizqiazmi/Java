package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");

        int batas = input.nextInt();

        int nilaiAwal = batas;

        while( nilaiAwal >= 1 ) {
            // lakukan apa
            System.out.println(nilaiAwal);
            nilaiAwal--;
        }

    }
}