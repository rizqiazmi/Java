package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Namanya siapa : ");
        String nama = scan.nextLine();

        System.out.print("Umur berapa : ");
        Byte umur = scan.nextByte();
        // nextInt, nextByte()

        System.out.print("Hallo " + nama + " Umurmu : " + umur);



    }
}