package com.tutorial;

class binatang {
    int umur = 12;

    public binatang(int umur){
        this.umur = umur;
    }

    int get_umur(){
        return umur;
    }

}

class Main extends binatang{
    // overriding
    int umur;

    public Main(int umur){
        super(20);
        this.umur = umur;
    }

    void test(){
        System.out.println(super.get_umur());
    }

    public static void main(String[] args) {
        Main h = new Main(12);
        h.test();
    }
}