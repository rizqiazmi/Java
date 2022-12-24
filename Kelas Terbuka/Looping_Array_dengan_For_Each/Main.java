package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int arrayAngka[] = {11,12,13,14,15,16,17,18,19,20};
        
        // looping standard
        System.out.println("looping standart");
        for (int i = 0; i < 10; i++){
            System.out.println("index ke-" +i+ " adalah = " +arrayAngka[i]);
        }

        // looping dengan properti Array
        System.out.println("looping dengan properti lenght");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-" +i+ " adalah = " + arrayAngka[i]);
        }

        // looping khusus untuk collcetion <- array
        System.out.println("looping for each");
        for( int angka : arrayAngka){
            System.out.println("angka pada looping ini = " + angka);
        }

    }
}
