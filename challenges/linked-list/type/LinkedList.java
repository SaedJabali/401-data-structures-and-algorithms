package type;

import data.Node;


public class LinkedList<T> {
    private Node<T> head;
    public int size;

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
        this.size++;
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
        node.next = this.head;
        this.head = node;
        this.size++;
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
        this.size++;
    }

    public void insertAfter(T after, T data) {
        boolean isIncludes = includes(after);

        if (isIncludes) {
            Node<T> newNode = new Node(data);
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
    }

    public void insertBefore(T before, T data) {
        boolean isIncludes = includes(before);
        if (isIncludes) {
            Node<T> newNode = new Node(data);
            Node<T> current = this.head;
            Node<T> prevCurrent = current;
            while (current != null) {
                if (current.getValue() == data) {
                    newNode.setNext(current);
                    prevCurrent.setNext(newNode);
                    break;
                }
                prevCurrent = current;
                current = current.getNext();
            }
        }

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


    public Node<T> getHead() {
        return this.head;
    }
}
