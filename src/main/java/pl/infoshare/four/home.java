package pl.infoshare.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Hello world!
 */
public class home {
    public static void main(String[] args) throws IOException {
    //zajecia 4
    // operacje na plikach
        //praca domowa
//        URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
//        Scanner s = new Scanner(url.openStream());

//        for(int i=0;i<104;i++){
//            String line = s.nextLine();
//            System.out.println(line + "");
//            //System.out.println(s);
//        }


        try {

            URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");

            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                
            }
            in.close();

        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }




    }

}
