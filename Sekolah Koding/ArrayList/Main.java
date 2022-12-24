package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // collections
        ArrayList<String> al = new ArrayList<String>(); //generic
        
        al.add("Hilman");
        al.add("endy"); al.add("Tiqa");

        Iterator it = al.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }



}