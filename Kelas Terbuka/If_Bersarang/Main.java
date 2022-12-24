package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // nested if atau if bersarang

        int a = 5;
        int b = 2;

        System.out.println("ini adalah awal dari program");

        if (a == 5){

            if (b == 10){

                System.out.println("ini adalah dimana a = 5 dan b = 10");


            } else {

                System.out.println("ini adalah dimana a dan b salah");

            }
        } else {

            System.out.println("ini adalah dimana a salah");

        }

        System.out.println("ini adalah akhir dari program");

    }
}