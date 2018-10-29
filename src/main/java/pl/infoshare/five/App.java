package pl.infoshare.five;


import pl.infoshare.five.calculator.Operacje;
import pl.infoshare.five.pojazdy.Car;

/**
 *  zajecia 5
 *  OOP
 */
public class App {
    public static void main(String[] args) {
        Operacje calculator = new Operacje();

        String myString = calculator.dopisanie("cos_tam");
        myString = calculator.dopisanie(myString);
        myString = calculator.dopisanie(myString);
        myString = calculator.dopisanie(myString);

        System.out.println(myString);


//        System.out.println(calculator.add(5,5));
//        System.out.println(calculator.divide(5,5));
//        System.out.println(calculator.multiply(5,5));
//        System.out.println(calculator.substract(5,5));
//
//    myMethod("a","b","c");
//
//    }

//    public static void myMethod2(Car arg1, String arg2, int arg3){
//        System.out.println(arg1);
//    }

//    public static void myMethod(String... args){
//        for(String arg:args){
//            System.out.println(arg);
//        }
//    }

    }

    public static void myMethodDopisanie(){

    }
}
