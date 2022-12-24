package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama : ");

        String nama = input.next();

        System.out.print("masukkan nilai : ");
        int nilai = input.nextInt();

        System.out.println("Selamat datang " + nama );

        System.out.println("Nilai yang ada di variabel nilai adalah = " + nilai);
        

    }
}