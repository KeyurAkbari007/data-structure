
// Write a program for evaluation of post-fix Expression using Stack
import java.util.Scanner;
import java.util.Stack;

 class evaluation_of_prefix {

    public static int evaluateExpression(int operand1, int operand2, char ch) {
        int value = 0;
        if (ch == '+') {
            value = operand1 + operand2;
        } else if (ch == '-') {
            value = operand1 - operand2;
        } else if (ch == '*') {
            value = operand1 * operand2;
        } else if (ch == '/') {
            value = operand1 / operand2;
        } else if (ch == '^') {
            value = (int) Math.pow(operand1, operand2);
        }
        return (value);
    }

    public static int evaluatePrefix(String str) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int temp = (int) ch - 48;
                stack.push(temp);
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int value = evaluateExpression(operand1, operand2, ch);
                stack.push(value);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str2 = sc.next();
        String str = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            str += str2.charAt(i);
        }
        System.out.println(evaluatePrefix(str));
        sc.close();
    }
}