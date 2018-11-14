package pl.infoshare.ten.home.model;

import java.time.LocalDate;

public class Student extends Osoba {
    private int numerIndeksu;

    public Student(LocalDate rokUrodzenia, char plec, int numerIndeksu) {
        super(rokUrodzenia, plec);
        this.numerIndeksu = numerIndeksu;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    
}
