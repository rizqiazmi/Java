package com.tutorial;

public class Main {
    
    public static void main(String[] args) {
        
        // Array 1 Dimensi
            // Assignment

            int[] angka = {1,5,4,7,6,9};
            
            for (int i = 0; i < angka.length; i++) {
                System.out.print(angka[i] + " ");
            }

            System.out.println();

            // Declaration
            int[] bilangan = new int[5];

            bilangan[0] = 10;
            bilangan[3] = 19;

            for (int i = 0; i < bilangan.length; i++) {
                System.out.print(bilangan[i] + " ");
            }

            System.out.println("\n");

        // Arrays 2 Dimensi
            // Assignment

            int[][] angka2 = { {2,4,5,9}, {10,50,30,40} };
            
            for (int i = 0; i < angka2.length; i++) {
                
                for (int y = 0; y < angka2[i].length; y++) {
                    System.out.print(angka2[i][y] + " ");
                }

                System.out.println();
            }

            System.out.println("\n");

            // declaration
            int[][] bilangan2 = new int[3][5];

            bilangan2[1][2] = 9;
            bilangan2[0][1] = 9;
            bilangan2[0][3] = 9;
            bilangan2[2][1] = 9;
            bilangan2[2][3] = 9;

            for (int i = 0; i < bilangan2.length; i++) {
                
                for (int y = 0; y < bilangan2[i].length; y++) {
                    System.out.print(bilangan2[i][y] + " ");
                }

                System.out.println();
            }

    }
}