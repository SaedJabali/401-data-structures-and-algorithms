package all.Data;

import data.Node;

public class BQueue<T> {
    private Node<T> front;
    private Node<T> rear;

    public BQueue(Node<T> front, Node<T> rear) {
        this.front = null;
        this.rear = null;
    }

    public BQueue() {

    }


    public void enqueue(T data) {
        Node<T> temp = new Node<T>(data);
        if (rear == null) {
            rear = front = temp;
        } else {
            rear.setNext(temp);
            rear = temp;
        }
    }

    public T dequeue() {
        Node<T> dummyHead = front;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        if (dummyHead.next == null) {
            front = null;
        } else {
            front = this.front.next;
            dummyHead.setNext(null);
        }
        return dummyHead.value;
    }

    public T peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return front.value;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void valuesToString() {
        Node<T> current = this.front;
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
