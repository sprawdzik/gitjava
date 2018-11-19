package pl.infoshare.eleven.zad1;

public class OperacjeMathImpl implements OperacjeMath {

    @Override
    public <T extends Number> double dodwanie(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    @Override
    public <T extends Number> double odejmowanie(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    @Override
    public <T extends Number> double mnozenie(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    @Override
    public <T extends Number> double dzielenie(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }
}
