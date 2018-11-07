package pl.infoshare.repeat678.zad3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lekarz {

    private String imie;
    private String nazwisko;

    private Queue<Pacjent> kolejka;

    public Lekarz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        kolejka = new LinkedList<>();
    }

    public void setKolejka(Queue<Pacjent> kolejka) {
        this.kolejka = kolejka;
    }

    public String getImie() {

        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
