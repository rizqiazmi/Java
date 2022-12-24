package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Stack -LIFO- && Deque

        ArrayDeque<String> nama = new ArrayDeque<String>();

        nama.push("Rizqi"); nama.push("Endy"); nama.push("Koko"); nama.push("Tiqa");

        nama.pollFirst();

        Iterator<String> iterator = nama.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }
}