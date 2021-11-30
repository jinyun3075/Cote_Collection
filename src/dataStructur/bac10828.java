package dataStructur;

import java.util.Scanner;
import java.util.Stack;

public class bac10828 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<n;i++){
            String input = sc.next();
            switch (input){
                case "push":
                    stack.push(sc.nextInt());
                    break;

                case "top":
                    if(!stack.empty()){
                        stringBuilder.append(stack.peek()).append('\n');
                    }else{
                        stringBuilder.append("-1").append('\n');
                    }
                    break;

                case "pop":
                    if(!stack.empty()){
                        stringBuilder.append(stack.pop()).append('\n');
                    }else{
                        stringBuilder.append("-1").append('\n');
                    }
                    break;

                case "size":
                    stringBuilder.append(stack.size()).append('\n');
                    break;

                case "empty":
                    if(stack.empty()){
                        stringBuilder.append("1").append('\n');
                    }else{
                        stringBuilder.append("0").append('\n');
                    }
                    break;
            }
        }

        System.out.println(stringBuilder);


    }
}
