import HashTable.type.HashTable;
import HashTable.methods.RepeatedWord;

public class HashApp {
   public static void main(String[] args) {
      System.out.println("OKOK");

      HashTable<Integer> hashTable = new HashTable<Integer>();

       hashTable.add("saad",17121994);
       hashTable.add("mk",2051995);
       hashTable.add("jaradat",23031996);

      System.out.println(hashTable.getSize());
      System.out.println(hashTable.get("mk"));
      System.out.println(hashTable.remove("saad"));
      hashTable.add("sufian",111992);
      System.out.println("after adding sufian and removing saad " + hashTable.getSize());

       RepeatedWord any = new RepeatedWord();

       String text = "It was the best of times," +
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

       System.out.println(any.repeatedWords(text));
   }
}
