import type.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<java.io.Serializable> List = new LinkedList<>();
        System.out.println("NULL");
        System.out.println("the size of the list is " + List.size);
        List.insertAtEnd(3);
        List.insertAtEnd(85);
        List.valuesToString();
        System.out.println("  ");
        System.out.println("the size of the list is " + List.size);
        List.insert("Hello Added");
        List.insert(8);
        List.valuesToString();
        System.out.println("  ");
        System.out.println("the size of the list is " + List.size);
        System.out.println(" ");
        System.out.println("Does the list have value 3? " + List.includes(3));
        System.out.println("Does the list have value 10? " + List.includes(10));
        System.out.println(" ");
        List.valuesToString();
        System.out.println(" ");
        List.insertAfter(3, 19);
        System.out.println(" ");
        List.valuesToString();

    }

}
