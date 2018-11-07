package pl.infoshare.six.exe1;

import pl.infoshare.six.exe1.zad1.User;

import java.io.PrintWriter;
import java.util.Scanner;

public class Zad2Main {

    public static void main(String[]args){
        System.out.print("Provide username: ");
        String username = redUserInput();
        System.out.print("Provide password: ");
        String password = redUserInput();

        User user = new User(username,password);

        System.out.println("Stworzono uzytkownika: " + user.getName() + "\nhaslo: "+user.getPassword());


    }
    
//    private static void saveToFile(User... users){
//        PrintWriter printWriter = new PrintWriter("./pliki_zajecia/user_zad2.txt");
//        for (User user:users) {
//            printWriter.append(user.getName()+";"+user.getPassword()+"\n");
//
//        }
//        printWriter.close();
//    }

    private static String redUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}