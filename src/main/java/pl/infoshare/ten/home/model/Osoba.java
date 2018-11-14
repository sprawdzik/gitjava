package pl.infoshare.ten.home.model;

import java.time.LocalDate;

public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate rokUrodzenia;
    private char plec;

    public Osoba(LocalDate rokUrodzenia, char plec) {
        this.rokUrodzenia = rokUrodzenia;
        this.plec = plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getRokUrodzenia() {
        return rokUrodzenia;
    }

    public char getPlec() {
        return plec;
    }

    @Override
    public String toString(){
        return "imie: " + imie+ "Data urodzenia: " + rokUrodzenia + " Plec " + plec;
    }
}
