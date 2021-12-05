package src.basic;

import java.util.Scanner;
import java.util.Stack;

public class Bac1918 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String input = sc.nextLine();

        for (Character ch : input.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    sb.append(stack.pop());
                }
            } else {
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
                    sb.append(stack.pop());
                }
                stack.push(ch);

            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }

    static int priority(char ch) {
        if (ch == '(') {
            return 0;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return 2;
    }
}

