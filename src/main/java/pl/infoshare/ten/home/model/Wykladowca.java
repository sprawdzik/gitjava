package pl.infoshare.ten.home.model;

import java.time.LocalDate;

public class Wykladowca extends Osoba {
    private String tytulNaukowy;

    public Wykladowca(LocalDate rokUrodzenia, char plec, String tytulNaukowy) {
        super(rokUrodzenia, plec);
        this.tytulNaukowy = tytulNaukowy;
    }

    public String getTytulNaukowy() {
        return tytulNaukowy;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }
}
