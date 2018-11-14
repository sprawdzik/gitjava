package pl.infoshare.ten.home.model;

import java.time.LocalDate;

public class Stypendysta extends Student {
    private double kwotaStypendium;

    public Stypendysta(LocalDate rokUrodzenia, int numerIndeksu, char plec, double kwotaStypendium) {
        super(rokUrodzenia, plec, numerIndeksu);
        this.kwotaStypendium=kwotaStypendium;
    }

    public double getKwotaStypendium() {
        return kwotaStypendium;
    }

    public void setKwotaStypendium(double kwotaStypendium) {
        this.kwotaStypendium = kwotaStypendium;
    }
}
