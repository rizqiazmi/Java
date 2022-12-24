package com.tutorial;

class hewan{
    
    // Inheritance || polymarphism || encapsulation || abstraction
    void suara(){
        System.out.println("suara hewan biasa");
    }

}

class kucing extends hewan{
    
    void suara(){
        System.out.println("meong miaw");
    }

}

class anjing extends hewan{
    
    // Inheritance || polymarphism || encapsulation || abstraction
    void suara(){
        System.out.println("guk guk!!!");
    }

}

class demo {
   
    public static void main(String[] args) {
    
        hewan h = new hewan();
        h.suara();

        hewan k = new kucing();
        k.suara();

        hewan a = new anjing();
        a.suara();

    }

}