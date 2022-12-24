package com.tutorial;

class binatang{
    // final
    final int umur = 20;
    
    int get_umur(){
        
        return umur;
    }
        
    }

class Main extends binatang{

    int umur;

    int get_umur(){
        return umur;
    }

    public static void main(String[] args) {
        Main h = new Main();
    }
}