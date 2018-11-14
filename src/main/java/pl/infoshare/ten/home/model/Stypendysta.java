package pl.infoshare.ten.home.model;

import java.time.LocalDate;

public class Stypendysta extends Student {
    private double kwotaStypendium;

    public Stypendysta(LocalDate rokUrodzenia, char plec, int numerIndeksu, double kwotaStypendium) {
        super(rokUrodzenia, plec, numerIndeksu);
        this.kwotaStypendium=kwotaStypendium;
    }

    public double getKwotaStypendium() {
        return kwotaStypendium;
    }

    public void setKwotaStypendium(double kwotaStypendium) {
        this.kwotaStypendium = kwotaStypendium;
    }

    @Override
    public String toString() {
        return super.toString() + "Kwota stypendium: " + kwotaStypendium + "\n";
    }

}
