package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bac1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 1 2 3 4 5  6  7  8  9
        // 1 2 3 5 6 11 12 23 24
        int N = Integer.parseInt(bf.readLine());
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(1);
        qu.offer(2);
        for (int i = 1; i < N; i++) {
            qu.offer((qu.poll()+qu.peek())%15746);

        }
        System.out.println(qu.poll());
    }
}
