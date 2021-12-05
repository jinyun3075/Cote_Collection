package src.dataStructur;

import java.util.Scanner;
import java.util.Stack;

public class Bac1874n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int index=0;
        while(n-->0){
            int input = sc.nextInt();

            if(index<input){
                for(int i=index+1;i<=input;i++){
                    stack.push(i);
                    stringBuilder.append("+\n");
                }
                index=input;
            }
            if(stack.peek()!=input){
                stringBuilder.delete(0,stringBuilder.length()).append("NO");
                break;
            }

            stack.pop();
            stringBuilder.append("-\n");
        }
        System.out.println(stringBuilder);
    }
}
