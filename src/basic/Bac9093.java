package basic;

import java.util.Scanner;
import java.util.Stack;

public class Bac9093 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder= new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            char[] input = sc.nextLine().toCharArray();
            for(int i=0;i<input.length;i++){
                if(input[i]==' '){
                    while(!stack.isEmpty()){
                        stringBuilder.append(stack.pop());
                    }
                    stringBuilder.append(' ');
                }
                else stack.push(input[i]);
            }
            while(!stack.isEmpty()){
                stringBuilder.append(stack.pop());
            }


            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
