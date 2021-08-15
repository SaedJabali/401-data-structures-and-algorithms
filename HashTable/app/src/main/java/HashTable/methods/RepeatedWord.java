package HashTable.methods;

import java.util.ArrayList;


public  class  RepeatedWord {

    private static final String PATTERN = "\\W+";

    public String repeatedWords(String book) {

        int count;
        ArrayList<String> repeatedWordsFound = new ArrayList<>();

        String lowerString = book.toLowerCase();

        String[] words = book.split(PATTERN);

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
