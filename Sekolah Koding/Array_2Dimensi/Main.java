package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // array 2
        String[][] kotak = new String[][]{
            {"indonesia", "jakarta"},
            {"italia", "roma"},       
            {"prancis", "paris"}
        };

        for (int i = 0; i < kotak.length; i++) {
            for (int j = 0; j < kotak[i].length; j++) {
                    System.out.println(kotak[i][j]);
            }

            System.out.println("=======");

        }

    }
}