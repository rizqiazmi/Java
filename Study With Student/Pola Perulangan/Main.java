package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        int batas, x , y;

        batas = 5;

        // perulangan y
        for ( y = 1; y <= batas; y++) {
            
            // perulangan spasi
            for (int spasi = y; spasi > 1; spasi--) {
                System.out.print(" ");
            }

            // perulangan x
            x = 1;
            while ( x <= batas ) {
                System.out.print(x);
                x++;
            }

            System.out.println();

        }

        // perulangan y
        for ( y = 1; y < batas; y++) {
            
            // perulangan spasi
            for (int spasi = y; spasi < batas-1; spasi++) {
                System.out.print(" ");
            }

            // perulangan x
            x = 1;
            while ( x <= batas ) {
                System.out.print(x);
                x++;
            }

            System.out.println();

        }

        System.out.println();

        // pola 2
        for ( y = batas; y >= 1; y--) {
            
            x = 1;
            while (x <= y) {
                System.out.print(x);
            x++;
            }
            System.out.println();

        }

        for ( y = 1; y <= batas; y++) {
            
            x = 1;
            while (x <= y) {
                System.out.print(x);
            x++;
            }
            System.out.println();

        }

    }
}