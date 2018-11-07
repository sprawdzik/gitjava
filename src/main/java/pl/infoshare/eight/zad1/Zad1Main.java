package pl.infoshare.eight.zad1;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Zad1Main {
    public static void main(String[] args) {

        Pracownik p1 = new Pracownik(LocalDate.of(1992, 7, 4), "Sebastian1", "Dudek1", "IT");
        Pracownik p2 = new Pracownik(LocalDate.of(1992, 7, 4), "Sebastian2", "Dudek2", "SD");
        Pracownik p3 = new Pracownik(LocalDate.of(1992, 7, 4), "Sebastian3", "Dudek3", "IT");

        Pracownik[] pracownicy = {p1, p2, p3};

        List <Pracownik> dzialIT = new ArrayList<>();
        //List <String> dzialIT = new ArrayList <String> ();
       // List <Pracownik> dzialSD = new ArrayList <> ();

        for (Pracownik p : pracownicy
        ) {
            if (p.getDepartment().equals("IT")) {
                dzialIT.add(p);
            }

        }

        printList(dzialIT, "IT");
        System.out.println();
        System.out.println();
        printList(dzialIT, "SD");
    }

    private static void printList(List<Pracownik> lista, String dzial) {
        System.out.println("Lista pracownikow dzialu: " + dzial);
        for (Pracownik p : lista
        ) {
            System.out.println(p.getName() + " " + p.getLastName() + " " + p.getDateOfBirth());
        }

    }
}
