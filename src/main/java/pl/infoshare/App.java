package pl.infoshare;

import java.util.Random;
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
//        int age = 30;
//        switch (age) {
//            case 18: {
//                System.out.println("Wiek 18");
//                break;
//            }
//            case 25: {
//                System.out.println("Wiek 25");
//
//            }
//            case 30: {
//                System.out.println("Wiek 30");
//                System.out.println("Wiek 30");
//                break;
//            }
//            default: {
//                System.out.println("errror");
//
//            }
//        }
//
//        //warunki skrocone
//        short wiekBis = 15;
//        System.out.println("Wiek wiekszy od 18? : " + (wiekBis > 18 ? "TAK" : "NIE"));
//
//        //inicjalizacja obiektu , wczytywanie danych z klawiatury
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj swoj wiek: ");
//        int ageFromKeyboard = scanner.nextInt();
//        double ageFromKeyboard2 =  ageFromKeyboard;
//        System.out.printf("Podales: " + ageFromKeyboard2);

        /*ZAJECIA 3 - 15.10.2018*/
        //FIXME: zeby dzialalo
        /*TODO: zrobic to dzis! 15.10.2018*/

//        int[] array = new int[6];
//        array[0]=5;
//        array[1]=7;
//        array[2]=0;
//        array[3]=3;
//        array[4]=5;
//        array[5]=6;

//        System.out.println("Elementy: "+array[0]+" "+array[2]+" "+array[4]);
//
//        int[] arrayFor = new int[1000];
//
//        for(int i=0;i<1000;i++){
//            arrayFor[i]=i+1;
//        }
//
//        for(int element:arrayFor){
//            System.out.println(element);
//        }

//        int[][] array2D=new int[10][10];
//        for(int i=0; i<array2D.length;i++){
//            System.out.println("I'm in row no. " + i);
//            for(int j=0; j<array2D.length;j++){
//                System.out.println("I'm in column no. " + j);
//            }
//        }

//        int[][] array2D=new int[10][10];
//
//        for(int i=1; i<array2D.length+1;i++){
//            System.out.print(i + ". ");
//            for(int j=1; j<array2D.length+11;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        int[][] array2D=new int[10][10];
//
//        for(int i=1; i<array2D.length;i++){
//            //System.out.print(i + ". ");
//            for(int j=1; j<array2D.length+11;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //zadanie1
//        int[] array = new int[11];
//        //Losowanie dowolnej liczby int w przedziale 1 do 100
//        Random random = new Random();
//        int randomInt = random.nextInt(100)+1;
//
//        for(int i=0; i < array.length;i++){
//            array[i]=random.nextInt(100)+1;
//        }
//
//
//        for(int i=0;i<array.length;i++){
//            if(i%2!=0) System.out.println(i + ". " + array[i]);
//        }

        //zadanie 2

//        char[][] array2DTask = new char[10][10];
//
//        for(int i=1; i < array2DTask.length;i++){
//            for(int j = 0; j<array2DTask.length;j++){
//            array2DTask[i][j]='*';
//            }
//        }
//
//
//        for(int i=1;i<array2DTask.length;i++){
//            System.out.print(i + ". ");
//            for(int j =0; j<array2DTask.length;j++){
//                if(i%2==0) System.out.print(array2DTask[i][j]);
//                else System.out.print(" ");
//            }
//            System.out.println();
//
//        }

        //zadanie 3
        //inicjalizacja obiektu , wczytywanie danych z klawiatury
        int winningNumber = new Random().nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("Podaj liczbe od 1 do 10 ");
        int liczba = scanner.nextInt();

        if(liczba<1 || liczba>11){
            System.out.println("Podales licze z innego przedzialu");

        }
        if(liczba == winningNumber){System.out.println("Wygrales");
        break;}
        else System.out.println("Zagraj jeszcze raz");
        }

    }
}
