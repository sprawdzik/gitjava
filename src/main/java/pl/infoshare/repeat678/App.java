package pl.infoshare.repeat678;

import pl.infoshare.repeat678.zad2.WordProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        List<String> linesList = Files.readAllLines(Paths.get("./pliki_zajecia/zajecia7.txt"));
        WordProcessor wordProcessor = new WordProcessor();
        System.out.println("Words in a file: "+wordProcessor.countWords(linesList));
        //System.out.println("Words in a file without duplicates: "wordProcessor.countWords(linesList));
    }
}
