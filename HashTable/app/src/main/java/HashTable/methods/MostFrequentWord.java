package HashTable.methods;

import java.util.HashMap;
import java.util.Map;

class MostFrequentWord {
    public static void FrequentWord(String array[]) {
        Map<String, Integer> hash = new HashMap<String, Integer>();
        for (String str : array) {
            if (hash.keySet().contains(str)) {
                hash.put(str, hash.get(str) + 1);
            } else {
                hash.put(str, 1);
            }
        }
        String maxStr = "";
        int maxVal = 0;
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > maxVal) {
                maxVal = count;
                maxStr = key;
            }
        }
        System.out.println(hash);
        System.out.println(maxStr);
        System.out.println(maxVal);
    }

    public static void main(String[] args) {
        String stringToRead = "It was the best of times," +
                "it was the worst of times," +
                " it was the age of wisdom," +
                " it was the age of foolishness, " +
                "it was the epoch of belief," +
                " it was the epoch of incredulity," +
                " it was the season of Light, " +
                "it was the season of Darkness," +
                " it was the spring of hope," +
                " it was the winter of despair," +
                " we had everything before us," +
                " we had nothing before us," +
                " we were all going direct to Heaven," +
                " we were all going direct the other way – in short," +
                " the period was so far like the present period," +
                " that some of its noisiest authorities insisted on its being received," +
                " for good or for evil, in the superlative degree of comparison only..";
//        String stringToRead = " ";
        stringToRead = stringToRead.toLowerCase();
        String[] arr = stringToRead.split(" ");
        FrequentWord(arr);
    }
}