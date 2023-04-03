package task2;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class task2 {
    public static void main(String[] args) {
        String text1 = "()";
        String text2 = "()[]{}";
        String text3 = "(]";


        System.out.println(isValid(text1));
        System.out.println(isValid(text2));
        System.out.println(isValid(text3));
    }
    private static boolean isValid(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();

        if (length %2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } else if (!stack.empty() && arr[i] == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (!stack.empty() && arr[i] == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (!stack.empty() && arr[i] == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
