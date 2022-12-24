package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // OPERATOR

        // 1. Penegasan = 
        // int bilangan = 10;

        // 2. Aritmatika +,-, *, /, %, ++, --, +=, -=
        // int bil1 = 12,
        // bil2 = 2,
        // hasil = bil1 % bil2;
        // bil1 += 5;

        // 3. Pembanding <, >, <=, >=, ==, !=
        // int bil1 = 12,
        // bil2 = 2;
        // boolean hasil = bil1 <= bil2;

        // 4. Logika &&, \\, !
            // diskon harga
            int totalBayar = 150000;
            boolean shoopingCard = false;

            boolean hasil = totalBayar >= 100000 || shoopingCard == true;
            hasil = !hasil;
            hasil = !hasil;
            System.out.println(hasil);

    }

}