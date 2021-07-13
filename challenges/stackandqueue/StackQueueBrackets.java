import java.util.Stack;

public class StackQueueBrackets {
    public boolean checkBrackets(String string) {
        Stack<Character> chars = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==('(') || string.charAt(i)==(')')||string.charAt(i)==('[')||string.charAt(i)==(']') || string.charAt(i)==('{')||string.charAt(i)==('}')){
                chars.push(string.charAt(i));
            }

        }

        for (int i=0 ; i <chars.size()-1 ; i++){
            char current = string.charAt(i);
            char currentNext = string.charAt(i+1);

            if (currentNext == '}') {
                if (current == '(' || current == '[') {
                    return false;
                }
            }
            if (currentNext== ')'){
                if (current== '{' || current == '['){
                    return false;
                }
            }
            if (currentNext==']'){
                if (current == '{' || current == '('){
                    return false;
                }
            }
        }
        return true;
    }
}