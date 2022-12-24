package com.tutorial;

import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder("hello world");
        printData(builder);

        // append
        builder.append(" all");
        printData(builder);

        builder.append(" warga Gresik");
        printData(builder);

        // insert 
        builder.insert(21, " Kota");
        printData(builder);

        // delete
        builder.delete(21, 26);
        printData(builder);

        // merubah karakter pada indeks terntentu
        builder.setCharAt(16, 'W');
        printData(builder);

        // replace
        builder.replace(22,29,"Surabaya");
        printData(builder);

        // casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));
    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }

}