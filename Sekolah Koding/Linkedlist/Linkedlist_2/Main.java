package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll =  new LinkedList<String>();
        ll.add("test"); 
        ll.add("test2");
        
        ll.set(1, "Hehe");

        System.out.println(ll.get(0));
        
    }
}