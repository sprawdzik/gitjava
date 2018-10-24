package pl.infoshare.repeat1234;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        /*rzutowanie*/
        byte a = 127;
        short b = (short)a;
        int c = (int) b;
        long d = (long) c;
        float e = d;
        double f = e;
        System.out.println(a + " " +
                b + " " +
                c + " " +
                d + " " +
                e + " " +
                f);
        /* ************************************************* */

        double g = 250.0;
        float h = (float) g;
        long i =(long) h;
        int j = (int) i;
        short k = (short) j;
        byte l = (byte) k;

        System.out.println(g+ " " +
                h+ " " +
                i+ " " +
                j+ " " +
                k+ " " +
                l);

        /* *********tablice wielowymiarowe*************** */

        double[] tab1 = new double[5];
        double[][] tab2 = new double[5][5];

        /*
        *
        *
        * */

    }
}
