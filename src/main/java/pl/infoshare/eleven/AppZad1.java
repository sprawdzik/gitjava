package pl.infoshare.eleven;

import pl.infoshare.eleven.zad1.OperacjeMath;
import pl.infoshare.eleven.zad1.OperacjeMathImpl;

public class AppZad1 {
    public static void main(String[] args) {
        OperacjeMath operacjeMath = new OperacjeMathImpl();

        System.out.println("Dodawanie: " + operacjeMath.dodwanie(3,3.0));
        System.out.println("Odejmowanie: " +operacjeMath.odejmowanie(3,3));
        System.out.println("Mnozenie: " +operacjeMath.mnozenie(3,3));
        System.out.println("Dzielenie: " +operacjeMath.dzielenie(3,3));

    }
}
