package com.tutorial;

class binatang {

    int umur;
    String warna;

    int get_umur(){
        return umur;
    }

}

class Main extends binatang {

    public static void main(String[] args) {
        
        Main h = new Main();
        h.set_umur(20);
        System.out.println(h.get_umur());

    }

    void set_umur(int umur){
        this.umur = umur;
    }
}