import data.Node;
import java.io.*;
public class PseudoQueue {

    static Stack<java.io.Serializable> stack1;
    static Stack<java.io.Serializable> stack2;

    public PseudoQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enQueue(int data) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int deQueue() {
        if (stack1.isEmpty()) {
            System.out.println("The Queue is empty");
        }
        int peek = (int) stack1.peek();
        stack1.pop();
        return peek;
    }
    public void toSstring() {
        this.stack1.valuesToString();
    }
}
