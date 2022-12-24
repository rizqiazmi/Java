package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int nilai = input.nextInt();
        String keterangan = nilai >= 70 && nilai <= 100 ? "Gitu dong" : "Gimana sih";

        // nilai >= 70 && <= 100
        // keterangan = LULUS
        // keterangan = TIDAK LULUS

        // if ( nilai >= 70 && nilai <= 100 ) {
        //     keterangan = "LULUS";
        // } else {
        //     keterangan = "TIDAK LULUS";
        // }

        System.out.println(keterangan);

    }
}