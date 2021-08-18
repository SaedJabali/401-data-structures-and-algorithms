package HashTable.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;


public class RepeatedWord {

    private static final String PATTERN = "\\W+";

    public String repeatedWord(String str) {
            int count = 0;
        String[] words = str.toLowerCase().split(PATTERN);

        ArrayList<String> wordTable = new ArrayList<>();

        System.out.println("Most common word is : ");

        for (String word : words) {
            if (wordTable.contains(word)) {
                return word;
            } else {
                wordTable.add(word);
            }
        }

//        System.out.println(word);
        return null;
    }

    public String repeatedWords(String book) {

        int count;
        ArrayList<String> repeatedWordsFound = new ArrayList<>();

        String[] words = book.toLowerCase().split(PATTERN);

        System.out.println("Duplicate words : ");

        for (int i = 0; i < words.length; i++) {
            count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && !words[i].equals("0"))
                repeatedWordsFound.add(words[i]);
        }
        return repeatedWordsFound.toString();
    }
}
