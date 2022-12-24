package kelasterbuka.util;

public class Aplikasi {

    public static void dagingPublic(){
        System.out.println("kelas terbuka: Aplikasi: public");
    }

    private static void dagingPrivate(){
        System.out.println("kelas terbuka: Aplikasi: private");
    }

    static void dagingDefault(){
        System.out.println("kelas terbuka: Aplikasi: default");
    }

    protected static void dagingProtected(){
        System.out.println("kelas terbuka: Aplikasi: protected");
    }

}