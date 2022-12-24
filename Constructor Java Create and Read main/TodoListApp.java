import java.io.*;
import java.util.*;

class Login{
    //deklarasi
    private String username, password, nama;
    
    //constructor
    public Login() {
        username = "admin";
        password = "123";
        nama = "admin";
    }

    public Login(String username, String password, String nama){
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    public void UserLogin() throws Exception{
        String my_user,my_password;
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    //instance of class
        System.out.println("=============LOGIN===============");
        System.out.print("|  Masukan username = "); my_user=br.readLine();
        System.out.print("|  Masukan password = "); my_password=br.readLine();
        System.out.println("=================================");
        my_user = my_user.trim();
        my_password = my_password.trim();
        username = username.trim();
        password = password.trim();

    if(my_user.equals(username) && my_password.equals(password)) {
        System.out.println();
    }else{
        System.out.println("\ntidak dapat login cek username dan password\n");
        System.out.println("Username: admin");
        System.out.println("Password: 123\n");
        UserLogin();
    }
    }
}

public class TodoListApp {

    // deklarasi variabel global
    static String fileName;
    static ArrayList<String> todoLists;
    static boolean isEditing = false;
    static Scanner input;
    static String namaHotel;
    static int jumlahKamar;
    static float hargaPerKamar;
    static String namaPesawat;
    static int jumlahPenumpang;
    static float hargaTiketPesawat;
    static String Tujuan;
    

    public static void main(String[] args) throws Exception {
        
        Login login = new Login();
        login.UserLogin();

        // initialize
        todoLists = new ArrayList<>();
        input = new Scanner(System.in);
    
        String filePath = System.console() == null ? "/src/todolist.txt" : "/todolist.txt";
        fileName = System.getProperty("user.dir") + filePath;
    
        System.out.println("FILE: " + fileName);
    
        // run the program (main loop)
        while (true) {
            showMenu();
        }
    }
    
    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    static void showMenu() {
        System.out.println("=============Menu Tiket=============");
        System.out.println("|  [1] Input Data Transaksi");
        System.out.println("|  [2] Lihat Data Tiket");
        System.out.println("|  [3] Keluar");
        System.out.println("====================================");
        System.out.print("Pilih menu> ");
    
        String selectedMenu = input.nextLine();
    
        if (selectedMenu.equals("1")) {
            addTodoList();
        } else if (selectedMenu.equals("2")) {
            showTodoList();
        }  else if (selectedMenu.equals("3")) {
            System.exit(3);
        } else {
            System.out.println("Kamu salah pilih menu!");
            backToMenu();
        };
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    static void readTodoList() {
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
    
            // load isi file ke dalam array todoLists
            todoLists.clear();
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                todoLists.add(data);
            }
    
        } catch (FileNotFoundException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    static void addTodoList() {
        clearScreen();
        System.out.println("=============Input Data Transaksi=============");   
        System.out.print("Masukkan nama Hotel: ");
        namaHotel = input.nextLine();
        System.out.print("Jumlah Kamar: ");
        jumlahKamar = input.nextInt();
        System.out.print("Harga Per Kamar: ");
        hargaPerKamar = input.nextFloat();
        input.nextLine();
        System.out.print("Nama Pesawat: ");
        namaPesawat = input.nextLine();
        System.out.print("Jumlah Penumpang: ");
        jumlahPenumpang = input.nextInt();
        System.out.print("Harga Tiket Pesawat: ");
        hargaTiketPesawat = input.nextFloat();
        input.nextLine();
        System.out.print("Tujuan: ");
        Tujuan = input.nextLine();
        
        backToMenu();
    }

    static void showTodoList() {
        clearScreen();
        if(namaHotel == null || jumlahKamar ==  0 || hargaPerKamar == 0 || namaPesawat == null || jumlahPenumpang == 0 || hargaTiketPesawat == 0 || Tujuan == null){
            System.out.println("data kosong");
            backToMenu();
            return;
        }
        System.out.println("=============Transaksi Tiket Pesawat dan Hotel=============");
        System.out.println("Tujuan: " + Tujuan);
        System.out.println("Nama Hotel: " + namaHotel);
        float result = (float) (hargaPerKamar * jumlahKamar * 0.55);
        System.out.printf("Total Biaya Kamar Hotel dengan diskon 45%%: %.2f\n", result);
        System.out.println("Nama Pesawat: " + namaPesawat);
        result = (hargaTiketPesawat  + 29000) * jumlahPenumpang;
        System.out.println("Total Harga Tiket Pesawat: " + result + " dengan biaya asuransi 29.000/penumpang");
        System.out.println("please enter to continue");
        input.nextLine();
    }
}
