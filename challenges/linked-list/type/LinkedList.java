package type;

import data.Node;

import java.io.Serializable;


public class LinkedList<T> {
    private Node<T> head;
    public int size;
//    private Object quote;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insertAtEnd(T value) {
        Node<T> node = new Node<>(value);
        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
        node.next = this.head;
        this.head = node;
        size++;
    }

    public boolean includes(T value) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void append(T data) {
        Node<T> node = new Node<>(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    public void insertAfter(T after, T value) {
        Node<T> newNode = new Node(value);
        Node<T> current = this.head;
        Node<T> aftCurrent;
        while (current != null) {
            if (current.getValue() == after) {
                aftCurrent = current.getNext();
                current.setNext(newNode);
                newNode.setNext(aftCurrent);
                break;
            }
            current = current.getNext();
        }
    }

    public void insertBefore(T index, T indexBefore) {
        Node<T> node = new Node<>(indexBefore);
        Node<T> current;
        if (this.head.value == index) {
            current = this.head;
            this.head = node;
            this.head.next = current;
        }

        Node<T> dummyRef = this.head;
        Node<T> dummyRef1 = dummyRef;
        while (dummyRef.value != index) {
            dummyRef1 = dummyRef;
            dummyRef = dummyRef.next;
        }

        dummyRef1.next = node;
        node.next = dummyRef;

        size++;
    }

    public LinkedList<T> linkedListZip(LinkedList<T> first, LinkedList<T> second) {

        Node<T> dummyRef = first.head;
        Node<T> dummyRef1 = second.head;

        LinkedList<T> zipList = new LinkedList<>();

        while (dummyRef != null || dummyRef1 != null) {
            if (dummyRef != null) {
                zipList.insert(dummyRef.value);
                dummyRef = dummyRef.next;
            }
            if (dummyRef1 != null) {
                zipList.insert(dummyRef1.value);
                dummyRef1 = dummyRef1.next;
            }
        }
        return zipList;
    }

    public void reversList() {
        Node<T> before = null;
//    Node<T> current = this.head;
        Node<T> after;
        while (this.head.getNext() != null) {
            after = this.head.getNext();
            this.head.setNext(before);
            before = this.head;
            this.head = after;
        }
        this.head.next = before;
//    return fromTheEnd;
    }
public void palindrome(){

}
    public void valuesToString() {
        Node<T> current = this.head;
        String allValues = "";
        while (current != null) {
            System.out.print("{ " + current.value + " } -> ");
            allValues = allValues + "{ " + current.value + " } -> ";
            current = current.next;
        }
        allValues = allValues + "NULL";
        System.out.print("NULL");

    }

}
