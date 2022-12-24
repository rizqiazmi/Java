package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Map key-value : HashMap, LinkedHashMap, TreeMap
        LinkedHashMap<Integer, String> data = new LinkedHashMap<Integer, String>();

        data.put(300, "Tiqa");
        data.put(100, "Hilman");
        data.put(400, "Koko");
        data.put(200, "Endy");

        // tipeData namaBaru : namaMap.entrySet()
        for(Map.Entry nama: data.entrySet()){
            System.out.println("Kunci: " + nama.getKey() + " Nilai: " + nama.getValue());
        }

    }
}