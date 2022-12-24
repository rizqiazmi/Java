import java.io.*;
import java.util.*;

class Login
{
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
        System.out.println("\nusername dan passowrd salah salah silahkan ulangi\n");
        UserLogin();
      }
    }

    public static void main (String [] args) throws Exception
    {
      Login login = new Login();
      login.UserLogin();
  }
}