package pl.infoshare.eleven;

import pl.infoshare.eleven.zad1.OperacjeMath;
import pl.infoshare.eleven.zad1.OperacjeMathImpl;

public class AppZad1 {
    public static void main(String[] args) {
        OperacjeMath operacjeMath = new OperacjeMathImpl();
        int a=5;
        double b=2.321;
        System.out.println("Dodawanie: " + operacjeMath.dodwanie(a,b));
        System.out.println("Odejmowanie: " +operacjeMath.odejmowanie(a,b));
        System.out.println("Mnozenie: " +operacjeMath.mnozenie(a,b));
        System.out.println("Dzielenie: " +operacjeMath.dzielenie(a,b));

    }
}
