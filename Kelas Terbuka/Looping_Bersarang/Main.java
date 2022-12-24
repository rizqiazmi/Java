package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // looping bersarang

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 10; j > i; j--){
                System.out.print("* ");
                if((i == j)){
                    break;
                }
            }
            System.out.println("\n");
        }

        /* for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if((i+j) == 4){
                    break;
                }
            }
            System.out.println("\n");
        } */

        /* System.out.println("\n");

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("* ");
                if(i == j){
                    break;
                } else if ((i+j) == 8){
                    break;
                }
            }
            System.out.println("\n");
        } */
        
        int a = 10; 
        int b = 5; 
        
        for(int i = 0; i < 10; i++) {

        for(int c = 10; c > i; c--) { 

            System.out.print(" ");   

        } for(int d = 0; d < i; d++) {

            System.out.print(" *");   

        }   
            System.out.println(""); 

        } for(int j = 0; j < 10; j++) {

        for(int c = 0; c < j; c++) {    

            System.out.print(" ");   

        } for(int d = 10; d > j; d--) {     

            System.out.print(" *");   
        }    
        
        System.out.println(""); } 

    }
}