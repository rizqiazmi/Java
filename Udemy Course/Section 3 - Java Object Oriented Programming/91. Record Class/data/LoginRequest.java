package programmer.zaman.now.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("Membuat object loginRequest");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest() {
        this("","");
    }

}
