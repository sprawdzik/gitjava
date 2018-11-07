package pl.infoshare.repeat678.zad3;

public class Pacjent {

    private String imie;
    private String nazwisko;
    private String choroba;

    public Pacjent(String imie, String nazwisko, String choroba) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.choroba = choroba;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getChoroba() {
        return choroba;
    }

    public void setChoroba(String choroba) {
        this.choroba = choroba;
    }
}
