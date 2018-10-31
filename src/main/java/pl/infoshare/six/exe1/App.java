package pl.infoshare.six.exe1;

import pl.infoshare.six.exe1.Bike;
import pl.infoshare.six.exe1.Home;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        Bike bike = new Bike();

        System.out.println(bike.numberOfWheels);
        System.out.println(bike.getFrameMaterial());

        Home home = new Home();

        System.out.println(home.number);
        home.printModel();


       }

}
