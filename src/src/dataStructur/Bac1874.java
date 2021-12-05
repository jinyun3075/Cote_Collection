package src.dataStructur;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Bac1874 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int n = sc.nextInt();

        Queue<Integer> que = new LinkedList<>();

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            que.offer(sc.nextInt());
        }

        int index=1;
        while(!que.isEmpty()){
            if(index>n&&stack.isEmpty()) break;
            if(!stack.isEmpty()&&que.peek().equals(stack.peek())){
                stack.pop();
                que.poll();
                stringBuilder.append("-\n");
                continue;
            }
            if(!stack.isEmpty()&&que.peek()<stack.peek()){
                stringBuilder.delete(0,stringBuilder.length()).append("NO");
                break;
            }
                stack.push(index);
                index++;
                stringBuilder.append("+\n");

        }
        System.out.println(stringBuilder);

    }
}
