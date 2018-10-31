package pl.infoshare.six.exe1.zad1;

//klasa user
public class User {
    private String name, password;


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }



    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
