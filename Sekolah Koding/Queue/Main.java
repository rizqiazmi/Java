package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Queue FIFO
        PriorityQueue<String> nama = new PriorityQueue<String>();

        nama.add("Rizqi"); nama.add("koko"); nama.add("Tiqa");

        System.out.println("hasil dari poll " + nama.poll());

        Iterator<String> iterator = nama.iterator();

        while (iterator.hasNext()) {
            System.out.println("Antrian sekarang.. " + iterator.next() + " ");
        }

    }
}