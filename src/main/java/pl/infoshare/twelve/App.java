package pl.infoshare.twelve;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("zajecia 12");

        Krzeslo krzeslo1 = new Krzeslo(4,"material");
        Krzeslo krzeslo2 = new Krzeslo(4,"material");
        System.out.println(krzeslo1.hashCode());

        Map<Krzeslo,String> mapa = new HashMap<>();
        mapa.put(krzeslo1,"krzeeslo1");
        mapa.put(krzeslo2,"krzeeslo2");

        mapa.forEach((key,value)-> System.out.println(key+" "+value));

    }
}
