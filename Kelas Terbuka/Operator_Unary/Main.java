package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // unary = operasi yang dilakukan pada satu variable 

        // unary + dan -
        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);

        // unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        // prefik
        int a = 5;
        // ++a = ditambah dulu bari ditampilkan 
        System.out.printf("nilai dengan '++' menjadi = %d \n", ++a);

        // postfik
        int b = 5;
        // ++b = ditampilkan dulu baru ditambah b
        System.out.printf("nilai dengan '++' menjadi = %d \n", b++);
        System.out.printf("nilai hasil dari postfix menjadi = '++' menjadi = %d \n", b);

        // unary boolean dengan (!) untuk negasi

        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);
    }

}