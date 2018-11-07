package pl.infoshare.four;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
    //zajecia 4
    // operacje na plikach
        //ODCZYT
//        File file = new File("/home/prawdzik/workspace/gitjava/zajecia_4.txt");
//        Scanner sc = new Scanner(file);
//        String line = sc.nextLine();
//        //String line2 = sc.nextLine();
//
//        System.out.println(line + "\n");

        //ZAPIS
//        PrintWriter write = new PrintWriter("./moj_nowy_plik.txt");
//        write.print("Pierwsza linia");
//        write.close();

        /*
        *
        * FILES - nowy plik
        *
        * */

        //Path a = Files.createFile(Paths.get("./plik_files2.txt"));
        //System.out.println("Plik zapisany w "+a);

        //Files - nowy folder

        //Files.createDirectory(Paths.get("./myFolder"));

        //Wczytywanie pliku
//        List<String> lines = Files.readAllLines(Paths.get("./moj_nowy_plik.txt"));
//
//        for(String lineInFile:lines){
//            System.out.println(lineInFile);
//        }
        //KOPIOWANIE

//        Files.copy(
//                Paths.get("./moj_nowy_plik.txt"),
//                Paths.get("/home/prawdzik/Desktop/moj_nowy_plik.txt"),
//                StandardCopyOption.REPLACE_EXISTING
//        );

        //zadanie 1
//        String[] nameTab = {"Sebastian","Robert","Marcin","Mateusz","Tomek"};
//
//        PrintWriter write = new PrintWriter("./zajecia4_zadanie1.txt");
//
//        for (String name:nameTab
//             ) {
//            write.print(name + "\n");
//        }
//        write.close();

        //zadanie 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj imie ");
//        String name = scanner.next();
//        System.out.println("Podaj nazwisko ");
//        String surName = scanner.next();
//
//        PrintWriter write2 = new PrintWriter("./zajecia4_zadanie2.txt");
//
//        //System.out.println("Imie: " name + "\n" + "Nazwisko: " + surName);
//        write2.print("Imie: " + name + "\n" + "Nazwisko: " + surName);
//        write2.close();

        //zadanie 3

//        int[] arrayRandom1= new int[100];
//        int[] arrayRandom2= new int[100];
//
//        //inicjalizacja losowania
//        Random random = new Random();
//
//        PrintWriter write = new PrintWriter("./zajecia4_zadanie3_1.txt");
//        PrintWriter write2 = new PrintWriter("./zajecia4_zadanie3_2.txt");
//        for(int i=0; i < arrayRandom1.length;i++){
//            //Losowanie dowolnej liczby int w przedziale 1 do 100
//            arrayRandom1[i]=random.nextInt(100)+1;
//            arrayRandom2[i]=random.nextInt(100)+1;
//            write.print(arrayRandom1[i] + "\n");
//            write2.print(arrayRandom2[i] + "\n");
//        }
//        write.close();
//        write2.close();
//
//        List<String> listLos1 = Files.readAllLines(Paths.get("./zajecia4_zadanie3_1.txt"));
//        List<String> listLos2 = Files.readAllLines(Paths.get("./zajecia4_zadanie3_2.txt"));
//
//        int hits = 0;
//
//        for (String elementLos1: listLos1
//             ) {
//            for (String elementLos2 : listLos2) {
//                if (Integer.parseInt(elementLos1) == Integer.parseInt(elementLos2)) {
//                    hits++;
//                }
//            }
//        }
//        System.out.println(hits);

        //zadanie 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj text ");
        String text = scanner.next();

        PrintWriter reverse = new PrintWriter("./zajecia4_zadanie4.txt");
//        reverse.print(new StringBuilder(text).reverse().toString());
//        reverse.close();



       }

}
