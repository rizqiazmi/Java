package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<String> ll =  new LinkedList<String>();
        ll.add("test"); ll.add("test2");
        ll.removeAll(ll);

        Iterator<String> itr = ll.iterator();

        if(itr.hasNext()){
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    } else{
        System.out.println("list kosong gan");
    }

    }


}