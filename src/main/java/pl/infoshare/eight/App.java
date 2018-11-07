package pl.infoshare.eight;

import java.util.Calendar;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

//zajecia 05.11.2018
//struktury danych
public class App {
    public static void main(String[] args) {
        //System.out.println("Seven");
        Calendar calendar = Calendar.getInstance(Locale.GERMAN);
        /*         * */
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.get(Calendar.HOUR));
        /*        * */
        Properties prop = new Properties();
        prop.setProperty("username","test");
        System.out.println(prop.getProperty("username"));

        //zadanie 1


    }
}
