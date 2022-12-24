package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // tipe data primitive di java:
        // integer, byte, short, long, float, char, boolean

        // integer (satuan)
        int i = 10;
        System.out.println("======INTEGER======");
        System.out.println("nilai integer i = " + (i + 1));
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("besar integer = " + Integer.BYTES + " bytes");
        System.out.println("besar integer = " + Integer.SIZE + " bit" + "\n");

        // byte (satuan)
        byte b = 10;
        System.out.println("======BYTE======");
        System.out.println("nilai byte b = " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("besar byte = " + Byte.BYTES + " bytes");
        System.out.println("besar byte = " + Byte.SIZE + " bit" + "\n");

        // short (satuan)
        short s = 10;
        System.out.println("======SHORT======");
        System.out.println("nilai shorts i = " + s);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("besar short = " + Short.BYTES + " bytes");
        System.out.println("besar short = " + Short.SIZE + " bit" + "\n");

        // long (satuan)
        long l = 10L;
        System.out.println("======LONG======");
        System.out.println("nilai long l = " + l);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("besar long = " + Long.BYTES + " bytes");
        System.out.println("besar long = " + Long.SIZE + " bit" + "\n");

        // double (koma, bilangan real)
        double d = 10.5D;
        System.out.println("======DOUBLE======");
        System.out.println("nilai double d = " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("besar double = " + Double.BYTES + " bytes");
        System.out.println("besar double = " + Double.SIZE + " bit" + "\n");
        
        // float (koma, bilangan real)
        float f = -8.5f;
        System.out.println("======FLOAT======");
        System.out.println("nilai float i = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("besar float = " + Float.BYTES + " bytes");
        System.out.println("besar float = " + Float.SIZE + " bit" + "\n");

        // char (koma, bilangan real) berdasarkan ASCII table (American Standard Code for Information Interchange)
        char c = 'c';
        System.out.println("======CHAR======");
        System.out.println("nilai char c = " + c);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai min = " + Character.MIN_VALUE);
        System.out.println("besar char = " + Character.BYTES + " bytes");
        System.out.println("besar char = " + Character.SIZE + " bit" + "\n");

        // boolean (nilai true atau false)
        boolean val = false;
        System.out.println("======BOOLEAN======");
        System.out.println("nilai float val = " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);
    }
}