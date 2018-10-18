package pl.infoshare.three;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;
/**
 * Hello world!
 */
public class three {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //tablica do zmiennych ktore zostana wylosowane
        int[] systemArray = new int[6];
        //tab do liczb uzytkownika
        int[] userArray = new int[6];
        //zmienna do ilosci trafionych liczb
        byte win = 0;

        System.out.println("Podaj 6 cyfr z przedzialu od 1 do 49");

        //Pobierz elementy do tablicy - kupon uzytkownika
        for (int i=0; i<userArray.length; ) {
            System.out.println("Podaj "+(i+1)+" liczbe");

            int zmienna = scanner.nextInt();

            if(zmienna<1||zmienna>49){
                System.out.println("Podales liczbe z innego przedzialu, podaj jeszcze raz");
            }else {

                //sprawdzam czy podana liczba jest w tablicy
                boolean result = IntStream.of(userArray).anyMatch(x -> x == zmienna);

                if (!result) {
                    userArray[i]=zmienna;
                    System.out.println("Liczba: " + zmienna + " dodana do kuponu");
                    i++;
                } else {
                    System.out.println("Skresliles juz " + zmienna + " w tym kuponie! Podaj jeszcze raz");
                }
            }

        }
        System.out.println("");
        System.out.println("####Komora losowania jest pusta, prosze o zwolnienie blokady###");
        System.out.println("");

        //Pobieram,losuje elementy do zwycieskiej tablicy
        for (int i=0; i<systemArray.length; ) {
            int systemNumber = new Random().nextInt(49) + 1;

            //sprawdzenie czy wylosowana, przypadkiem nie jest z innego przedzialu
            //teoretycznie niemozliwe
            if(systemNumber<1||systemNumber>49){
                System.out.println("losuj automacie jeszcze raz!");
            }else {

                //sprawdzam czy podana liczba jest w tablicy
                boolean result = IntStream.of(systemArray).anyMatch(x -> x == systemNumber);

                if (!result) {
                    systemArray[i]=systemNumber;
                    System.out.println("Liczba: " + systemNumber + " dodana do liczb zwycieskich");
                    i++;
                } else {
                    System.out.println("Liczba losowana w kolejce: " +i+" - " + systemNumber + " jest juz w gronie zwycieskim, maszyna losuje jeszcze raz");
                }
            }

        }
        System.out.println("");
        System.out.println("####Sprawdzam Twoj wynik###");
        System.out.println("");
        for (int j=0; j<userArray.length; j++) {

            int winNumber = userArray[j];
            boolean result = IntStream.of(systemArray).anyMatch(x -> x == winNumber);

            if (result) {
                //userArray[i] = zmienna;
                System.out.println("Liczba: " + winNumber + " TRAFIONA!!!!");
                win++;
            } else {
                System.out.println("Liczba " + winNumber + " pudlo");
            }
        }

        System.out.printf("Trafiłeś: " + win + " z 49");

        }

    }

