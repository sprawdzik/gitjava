package pl.infoshare;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        String name ="Sebix";
//        String lastName ="Praw";
//        String homeCity ="Suwalki";

//        System.out.println("Moj wiek: " + age + "\n" + "Moje miasto: " + homeCity);
//        double a = (double)5;
//        System.out.println(a);
//        int b = (char) a;
//        System.out.println(b);

//        if(age >= 20 && age<=30){
//            System.out.println("Wiek wiekszy niz 18 mniej niz 30");
//        }else{
//            System.out.println("hindus");
//        }
        /*SWITCH*/
        int age = 30;
        switch (age) {
            case 18: {
                System.out.println("Wiek 18");
                break;
            }
            case 25: {
                System.out.println("Wiek 25");

            }
            case 30: {
                System.out.println("Wiek 30");
                System.out.println("Wiek 30");
                break;
            }
            default: {
                System.out.println("errror");

            }
        }

        //warunki skrocone
        short wiekBis = 15;
        System.out.println("Wiek wiekszy od 18? : " + (wiekBis > 18 ? "TAK" : "NIE"));

        //inicjalizacja obiektu , wczytywanie danych z klawiatury
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoj wiek: ");
        int ageFromKeyboard = scanner.nextInt();
        short ageFromKeyboard2 = (short) ageFromKeyboard;
        System.out.printf("Podales: " + ageFromKeyboard2);


    }
}
