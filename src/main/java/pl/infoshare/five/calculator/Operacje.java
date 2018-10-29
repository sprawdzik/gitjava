package pl.infoshare.five.calculator;

public class Operacje {

    public String dopisanie(String abc){
        return abc + "x";
    }

    public double add(double a, double b){
        return a+b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double substract(double a, double b){
        return a-b;
    }

    public double divide(double a, double b){
        if(b == 0) return 0;
        return a/b;
    }

}


