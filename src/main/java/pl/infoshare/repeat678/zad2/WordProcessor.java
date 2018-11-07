package pl.infoshare.repeat678.zad2;

import java.util.List;

public class WordProcessor {

    public int countWords(List<String> linesList){
        int wordCounter = 0;
        for (String line:linesList
             ) {
            if(!line.isEmpty()){
            String textWithRemovedCommas = removeSign(line,",");
            String textWithRemovedDotsAndCommas = removeSign(textWithRemovedCommas,"//.");
            wordCounter += textWithRemovedDotsAndCommas.split(" ").length;
            }

        }
        return wordCounter;

    }

    private String removeSign(String text, String c){
        return text.replaceAll(String.valueOf(c),"");
    }
}
