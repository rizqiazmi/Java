package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();
        

        // exception handling (try, catch,finally)
        System.out.println("handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d",index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        // runtime error jika file tidak ada
        System.out.println("handling IO not found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch(IOException e){
            System.err.println(e);
        }

        // mengabungkan dua exception
        System.out.println("menggabungkan dua buah exception");
        try {
            System.out.printf("index ke-%d, adalah %d",index,array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        } catch (IOException e){
            System.err.println("\nfile tidak ditemukan");
        }

        // finally

        System.out.println("menambahkan finally");

        try {
            System.out.printf("index ke-%d, adalah %d",index,array[index]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println(" \nfinally");
        }

        System.out.println("\nakhir dari program");
    }  
}