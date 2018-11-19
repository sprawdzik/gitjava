package pl.infoshare.eleven.zad1;

public interface OperacjeMath {

    <T extends Number> double dodwanie(T a, T b);
    <T extends Number> double odejmowanie(T a,T b);
    <T extends Number> double mnozenie(T a,T b);
    <T extends Number> double dzielenie(T a,T b);



}
