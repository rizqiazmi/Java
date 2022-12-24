package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // collections
    ArrayList<String> al = new ArrayList<String>(); // generic
    String[] nama = new String[]{"Hilman", "Endy", "Tiqa", "Azmi"};
    al.addAll( Arrays.asList(nama));
    al.removeAll(al);
    Iterator it = al.iterator();

    while(it.hasNext()){
        System.out.println(it.next());
    }
}
    
}