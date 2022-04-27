package basic;

import java.util.Scanner;
import java.util.Stack;

public class Bac1935 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();

        int n = sc.nextInt();
        int alpha[] = new int[n];
        String input = sc.next();
        for(int i=0;i<n;i++){
            alpha[i]=sc.nextInt();
        }

        for(int i =0;i<input.length();i++){
            if(input.charAt(i)>='A'&&input.charAt(i)<='Z'){
                stack.push((double) alpha[input.charAt(i)-'A']);
            }else{
                double num1=stack.pop();
                double num2=stack.pop();
                switch (input.charAt(i)){
                    case '+':
                        stack.push(num2+num1);
                        break;
                    case '-':
                        stack.push(num2-num1);
                        break;
                    case '*':
                        stack.push(num2*num1);
                        break;
                    case '/':
                        stack.push(num2/num1);
                        break;
                }
            }

        }
        System.out.printf("%.2f",stack.pop());

    }
}
