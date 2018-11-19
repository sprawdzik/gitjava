package pl.infoshare.eleven;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("zajecia 11");
        Car car = new Ikarus();
        Bus bus = new Ikarus();
        Ikarus ikarus = new Ikarus();

        System.out.println(car.refuel(20.0));

        bus.stampTheTicket("Ulgowy");
        ikarus.honkTheHorn();

        //**************************
        GenericClass genericClass = new GenericClass();
        genericClass.setNumber(new Integer(1));
        genericClass.addToList(new Double(2.0));
        genericClass.addToList("dasdasd");

        System.out.println(genericClass.getFromList(0));
        System.out.println(genericClass.getFromList(1));

        List<String> stringList = new ArrayList<String>(){{
            add("A");
            add("B");
            add("C");
            add("D");
        }};
        List<Number> ikarusList = new ArrayList<Number>() {{
            add(new Integer(1));
            add(new Double(-25.17));
        }};




    }
    private static <T> void printList(List<T>someList){
        for (T elem:someList){
            System.out.println(elem);
        }
    }

    //**************************
}
