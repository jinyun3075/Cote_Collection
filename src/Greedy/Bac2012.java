package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Bac2012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        PriorityQueue<Long> arr = new PriorityQueue<>();
        long val=0;
        for(int i=0;i<N;i++){
            arr.offer(Long.parseLong(bf.readLine()));
        }
        for(int i=1;i<=N;i++){
            long input =arr.poll();
                val+=Math.abs(i-input);

        }
        System.out.println(val);

    }
}
