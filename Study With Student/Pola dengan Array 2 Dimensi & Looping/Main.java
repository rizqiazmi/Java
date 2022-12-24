package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan Jumlah Baris : ");
        int baris = input.nextInt();
        System.out.print("Masukkan Jumlah Baris : ");
        int kolom = input.nextInt();

        int [][] barisan = new int [baris][kolom];
        
        // program 1

        for( int iBaris = 0; iBaris < baris; iBaris++ ){
            for (int jKolom = 0; jKolom < kolom; jKolom++) {

                // kalau baris yang kita inputkan genap
                if ( baris % 2 == 0 ){

                    if ( iBaris % 2 == 0 ) {
                       barisan [iBaris][jKolom] = 0;
                    } else {
                        barisan [iBaris][jKolom] = 1;
                    }

                } else {

                    if ( iBaris % 2 == 0 ) {
                        barisan [iBaris][jKolom] = 1;
                     } else {
                         barisan [iBaris][jKolom] = 0;
                     }

                }
                
            }
        } // tutup pengisian program 1

        // tampilkan program 1
        for (int iBaris = 0; iBaris < baris; iBaris++) {
            
            for (int jKolom = 0; jKolom < kolom; jKolom++) {

                System.out.print(barisan[iBaris][jKolom] + " ");

            }
            System.out.println();

        }
        System.out.println("\n");

        // program 2 
        // pengisian
        for (int iBaris = 0; iBaris < baris; iBaris++) {
            
            for (int jKolom = 0; jKolom < kolom; jKolom++) {
                
                if (iBaris == 0 || iBaris == baris - 1) {
                    barisan[iBaris][jKolom] = 1;
                } else {

                    if ( jKolom == 0 || jKolom == kolom - 1 ) {
                        barisan [iBaris][jKolom] = 1;
                    } else {
                        barisan[iBaris][jKolom] = 0;
                    }

                }

            }

        } 

        // tampilkan program 2 
        for (int iBaris = 0; iBaris < baris; iBaris++) {
            
            for (int jKolom = 0; jKolom < kolom; jKolom++) {

                System.out.print(barisan[iBaris][jKolom] + " ");

            }
            System.out.println();

        }
    } 
}