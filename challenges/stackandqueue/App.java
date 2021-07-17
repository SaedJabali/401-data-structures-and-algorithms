import type.LinkedList;

import java.io.IOException;
import java.io.Serializable;

public class App {

    public static void main(String[] args) throws IOException {
        Stack<Serializable> stack = new Stack<>();
        Queue<Serializable> queue = new Queue<>();
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
//        stackqueue.enQueue(5);
//        stackqueue.enQueue(6);
//        stackqueue.enQueue(7);
//        stackqueue.enQueue(8);
//        stackqueue.toSstring();
//        System.out.println("  ");
//        System.out.println(stackqueue.deQueue());
//        System.out.println(stackqueue.deQueue());
//        System.out.println(stackqueue.deQueue());
//        stackqueue.toSstring();
//        AnimalShelter shelter = new AnimalShelter();
//        Dog dog1 = new Dog("dog1");
//        shelter.enqueue(dog1);
//        shelter.enqueue(dog1);
//        Cat cat1 = new Cat("cat1");
//        shelter.enqueue(cat1);
//
//        shelter.toSstring();
//        System.out.println(" ");
//        System.out.println(animal.dequeue(" cat"));
//        System.out.println(animal.dequeue(" dog"));
//        System.out.println(animal.dequeue(" bird"));
//        System.out.println(animal.dequeue(" turtle"));
//        System.out.println(animal.dequeue(" duck"));


        StackQueueBrackets brackets = new StackQueueBrackets();

        System.out.println("1- "+brackets.checkBrackets("{}"));
        System.out.println("2- "+brackets.checkBrackets("{}(){}"));
        System.out.println("3- "+brackets.checkBrackets("()[[Extra Characters]]"));
        System.out.println("4- "+brackets.checkBrackets("(){}[[]]"));
        System.out.println("5- "+brackets.checkBrackets("{}{Code}[Fellows](())"));
        System.out.println("6- "+brackets.checkBrackets("[({}]"));
        System.out.println("7- "+brackets.checkBrackets("(]("));
        System.out.println("8- "+brackets.checkBrackets("{(})"));
        System.out.println("9- "+brackets.checkBrackets("{"));
        System.out.println("10- "+brackets.checkBrackets(")"));
        System.out.println("11- "+brackets.checkBrackets("]"));
    }
}
