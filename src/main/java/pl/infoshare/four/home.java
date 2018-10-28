package pl.infoshare.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 */
public class home {
    public static void main(String[] args) throws IOException {
    /*
    zajecia 4
    praca domowa
     */

        try {

            URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");

            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            String myString;
            byte i = 0; // przejscie petli

            PrintWriter writeAlfa = new PrintWriter("./zajecia4_domowe_alfa.txt");
            PrintWriter writeDigit = new PrintWriter("./zajecia4_domowe_digit.txt");

            while ((line = in.readLine()) != null) {
                //pominięcie nagłówka pobieranego textu
                if(i>7){
                        System.out.println(line + " - przejscie petli: " + i + " dlugosc: " +line.length());
                        //sprawdzam czy linia dluzsza niz 31 znakow
                        //jezeli tak to dziele na 2 stringi
                        if(line.length()>31) {
                            //dziele linie od 0 do 31 znaku
                            myString = ((line.substring(0,31)).trim());
                            sprawdzenie(writeAlfa, writeDigit, myString);
                            //dziele linie od 32 znaku
                            myString = ((line.substring(32)).trim());
                            sprawdzenie(writeAlfa, writeDigit, myString);
                        }else  {
                            myString = line.trim();
                            sprawdzenie(writeAlfa, writeDigit, myString);
                    }
                }
                i++;
            }
            in.close();
            writeAlfa.close();
            writeDigit.close();
        }
        catch (MalformedURLException e) {
            System.out.println("Upss..., należy podać link do dokumentu: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Sprawdź podany link: " + e.getMessage());
        }
    }

    private static void sprawdzenie(PrintWriter writeAlfa, PrintWriter writeDigit, String myString) {
        if (myString.length()>0 && Character.isDigit(myString.charAt(0)))
        {
            System.out.println("String begins with a digit: " + myString + " dlugosc: " +myString.length());
            writeDigit.print(myString + "\n");
        }else if(myString.length()>0){
            System.out.println("String begins with a NO digit: " + myString+ " dlugosc: " +myString.length());
            writeAlfa.print(myString + "\n");
        }
    }

}
