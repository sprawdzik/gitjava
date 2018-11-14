package pl.infoshare.ten;

import pl.infoshare.ten.model.Animal;
import pl.infoshare.ten.model.Centipide;
import pl.infoshare.ten.zad1.Kot;
import pl.infoshare.ten.zad1.MojaLista;
import pl.infoshare.ten.zad1.Pies;
import pl.infoshare.ten.zad1.Zwierze;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        System.out.println("zajecia 10");
        Animal centipide = new Centipide();

        printNumberOflEgs(centipide);

        //ZAD1
        Zwierze kot = new Kot();
        Zwierze pies = new Pies();

        System.out.println("Kot: " + kot.dajGlos());
        System.out.println("Pies: " + pies.dajGlos());

        //ZAD2

        Zwierze kaczka = new Zwierze() {
            @Override
            public String dajGlos() {
                return "kwa kwa";
            }
        };
        System.out.println("Kaczka: "+kaczka.dajGlos());

        //ZAD3

        List lista = new MojaLista();

        for (int i=5;i<10;i++){
            lista.add(i);
        }

        System.out.println(lista.get(3));
        System.out.println(lista);

    }

    private static void printNumberOflEgs(Animal animal){
        System.out.println(animal.getLiczbaNog());
    }
}
