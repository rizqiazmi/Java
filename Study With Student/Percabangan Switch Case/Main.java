package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //  warung makan

        short jumlah;
        int harga;

        Scanner input = new Scanner(System.in);
         System.out.print("== Menu Mkanan ==\n"
         + "1. Nasi Groeng (Rp. 12.000)\n" 
         + "2. Nasi Ayam (Rp. 11.000)\n"
         + "3. Nasi Ikan (Rp. 10.000)\n"
         + "Masukkan Pilihan Anda [1/2/3] : ");

         String pilihan = input.next();

         System.out.print("Masukkan Jumlah Pesanan : ");
         jumlah = input.nextShort();

        /* if () {
            
        } */

         switch (pilihan) {
            case "1":
                harga = jumlah * 12000;
                System.out.println("Total Pembelian anda adalah : Rp." + harga);

                 break;

            case "2":
                harga = jumlah * 11000;
                System.out.println("Total Pembelian anda adalah : Rp." + harga);
 
                break;
            
            case "3":
                harga = jumlah * 10000;
                System.out.println("Total Pembelian anda adalah : Rp." + harga);

                 break;

            default :
            System.out.println("Pilihan yang anda masukkan salah!");
            break;
         }

    }
}