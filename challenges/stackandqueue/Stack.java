import data.Node;

public class Stack<T> {
    private Node<T> head;

    public Stack() {
        this.head = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            head = newNode;
            head.setNext(temp);
        }

    }

    public T pop() {
        Node<T> dummyHead = head;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else if (dummyHead.next == null) {
            head = null;
        } else {
            head = head.next;
            dummyHead.setNext(null);
        }

        return dummyHead.value;
    }


    public T peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return head.value;
        }
    }


    public boolean isEmpty() {
        return head == null;
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