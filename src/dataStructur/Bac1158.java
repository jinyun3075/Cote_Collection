package dataStructur;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bac1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }


        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while(!queue.isEmpty()){
            for(int i=1;i<K;i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append('>');
        System.out.println(sb);
    }
}
