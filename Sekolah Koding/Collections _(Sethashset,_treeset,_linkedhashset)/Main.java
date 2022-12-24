package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Set: HashSet, LinkedHashSet, Treeset
        TreeSet<String> nama = new TreeSet<String>();

        nama.add("Azmi"); nama.add("Endy"); nama.add("Tiqa"); nama.add("Endy");

        Iterator<String> iterator = nama.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }
}