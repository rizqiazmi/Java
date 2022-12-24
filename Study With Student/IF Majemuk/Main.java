package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

            // pekerjaan : programer, desainer
            // menantu
            // ya gk diterima

            // validasi
            // 1. namanya gak boleh kosong
            // 2. pekerjaan nya harus programer / desainer

            System.out.print("Masukkan Nama Anda : ");
            String nama = input.nextLine();

            System.out.print("Masukkan Pekerjaan Anda : ");
            String pekerjaan = input.nextLine();

            if( !nama.isEmpty() && pekerjaan.equalsIgnoreCase("programer")) {
                System.out.println("Halo " + nama + ", Anda menantu idaman ");

            }else if(!nama.isEmpty() && pekerjaan.equalsIgnoreCase("desainer")){
                System.out.println("Halo " + nama + ", Anda menantu yang baik ");

            }else {
                System.out.println("Maaf, anda tidak diterima sebagai menantu");
            }
    }

}