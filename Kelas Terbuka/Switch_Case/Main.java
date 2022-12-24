package com.tutorial;

import java.util.*;

public class Main {
    // switch case
    public static void main(String[] args) {
        
        String input;
        
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama : ");
        input = inputUser.next();
        
        // ekspresi berupa satuan (int, long,byte,short), String, atau enun
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir");
                break;
                case "mario":
                System.out.println("saya mario dan hadir");
                break;
            default:
                System.out.println(input + " tidak hadir");
        } 
        System.out.println("selesai program");
    }
}