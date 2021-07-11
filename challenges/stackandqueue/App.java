import type.LinkedList;

public class App {

    public static void main(String[] args) {
        Stack<java.io.Serializable> stack = new Stack<>();
        Queue<java.io.Serializable> queue = new Queue<>();
        PseudoQueue stackqueue = new PseudoQueue();
//        stack.push(17);
//        stack.push(18);
//        stack.push(19);
//        stack.push(20);
//        stack.valuesToString();
//        System.out.println(" ");
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        stack.valuesToString();
//        System.out.println(" ");
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
//        System.out.println("----------------------------------");
//        System.out.println("----------------------------------");
//        queue.enqueue(10);
//        queue.enqueue(11);
//        queue.enqueue(12);
//        queue.enqueue(13);
//        queue.valuesToString();
//        System.out.println("  ");
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
////        System.out.println(queue.dequeue());
////        System.out.println(queue.dequeue());
//        queue.valuesToString();
//        System.out.println("  ");
//        System.out.println(queue.peek());
//        System.out.println(queue.isEmpty());
        stackqueue.enQueue(5);
        stackqueue.enQueue(6);
        stackqueue.enQueue(7);
        stackqueue.enQueue(8);
        stackqueue.toSstring();
        System.out.println("  ");
        System.out.println(stackqueue.deQueue());
        System.out.println(stackqueue.deQueue());
        System.out.println(stackqueue.deQueue());
        stackqueue.toSstring();
    }
}
