package pl.infoshare.six.exe1;

import pl.infoshare.six.exe1.zad1.User;

import java.util.Scanner;

public class Zad1Main {

    public static void main(String[]args){
        System.out.print("Provide username: ");
        String username = redUserInput();
        System.out.print("Provide password: ");
        String password = redUserInput();

        User user = new User(username,password);

        System.out.println("Stworzono uzytkownika: " + user.getName() + "\nhaslo: "+user.getPassword());
    }

    private static String redUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}