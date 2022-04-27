package dataStructur;

import java.util.Scanner;
import java.util.Stack;

public class Bac10799 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        char[] input = sc. nextLine().toCharArray();
        int val =0;
        for(int i=0;i<input.length;i++){
            if(input[i]=='('){
                stack.push('(');
                continue;
            }
            if(input[i]==')'){
                stack.pop();
                if(input[i-1]!=')'){
                    val+=stack.size();
                }else{
                    val++;
                }
            }
        }
        System.out.println(val);

    }
}
