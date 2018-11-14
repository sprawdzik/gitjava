package pl.infoshare.ten.home;

import pl.infoshare.ten.home.model.Stypendysta;

import java.time.LocalDate;

public class App {
    public static void main(String[] args){

        Stypendysta stypendysta = new Stypendysta(LocalDate.of(2018,11,14),'M',667899,460.58);
        stypendysta.setImie("Sebastian");
        stypendysta.setNazwisko("Iksinski");

        System.out.println(stypendysta);
    }
}
