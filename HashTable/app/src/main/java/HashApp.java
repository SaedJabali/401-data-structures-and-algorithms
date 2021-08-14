import HashTable.type.HashTable;

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
   }
}
