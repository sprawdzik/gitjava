package pl;

import java.io.Console;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //inicjalizacja obiektu , wczytywanie danych z klawiatury
        Scanner scanner = new Scanner(System.in);
        Console cnsl = System.console();

        //zadanie 1
        System.out.println("#### ZADANIE 1 ####");
        System.out.print("Podaj dowolna liczbe: ");
        int numberFromKeyboard = scanner.nextInt();
        double numberFromKeyboard2 = numberFromKeyboard;
        System.out.println("Podales: " + numberFromKeyboard2);

        // zadanie 1 dodatkowe
        System.out.println("Podaj liczbe jako string: ");
        String stringNumber = scanner.next();
        int result = Integer.parseInt(stringNumber);
        System.out.println("Podana liczba jako string: "+result);


        //zadanie 2
        System.out.println("#### ZADANIE 2 ####");
        System.out.printf("Podaj wiek: ");
        byte age = scanner.nextByte();
        if (age <0 || age>123 ){
            System.out.printf("Podany wiek musi byc wiekszy od 0 i nie moze przekraczac 123");
        }
        else {
            if(age>=18 && age>0 && age<=123)
            {
                System.out.println("Jestes pelnoletni");
            }
            else {
                System.out.println("Jestes niepelnoletni");
            }
        }



       //zadanie 3
        System.out.println("#### ZADANIE 3 ####");
        // read password into the char array
        /*char[] passwordChars = cnsl.readPassword();
        String passwordString = new String(passwordChars);
        cnsl.printf(passwordString + "\n");
        // prints
        //System.out.println("Password is: "+pwd);
        */
        System.out.printf("Podaj login: ");
        String login = scanner.next();
        System.out.printf("Podaj haslo: ");
        String password = scanner.next();

        if(login.equals("admin") && password.equals("adminpass")){
            System.out.printf("Zalogowany admin");
        }
        else if(login.equals("user") && password.equals("userpass")){
            System.out.printf("Zalogowany user");
        }
        else {
            System.out.printf("Nie ma takiego uzytkownika");
        };




    }
}
