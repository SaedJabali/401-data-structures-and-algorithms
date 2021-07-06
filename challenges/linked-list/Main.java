import type.LinkedList;

import java.io.Serializable;


public class Main {
    public static void main(String[] args) {
        LinkedList<java.io.Serializable> List = new LinkedList<>();
        LinkedList<java.io.Serializable> firstList = new LinkedList<>();
        LinkedList<java.io.Serializable> secondList = new LinkedList<>();
        LinkedList<Serializable> zipList = new LinkedList<>();
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
        List.insertAfter(8, "Bye Added");
        System.out.println(" ");
        List.valuesToString();
        System.out.println(" ");
        List.append("Bye Added");
        List.valuesToString();
        System.out.println(" ");
        List.insertBefore(19,5648);
        List.insertBefore(3,21212121);
        List.valuesToString();
        System.out.println(" ");
        System.out.println(" ");

        firstList.insert(1);
        firstList.insert(3);
        firstList.insert(2);
        secondList.insert(5);
        secondList.insert(9);
        secondList.insert(4);


        System.out.println(firstList);
        System.out.println(secondList);
        System.out.println(zipList.linkedListZip(firstList, secondList));

    }

}
