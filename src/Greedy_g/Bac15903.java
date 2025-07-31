package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long val=0;
        PriorityQueue<Long> p = new PriorityQueue<>();
        String[] input = bf.readLine().split(" ");
        for(int i=0;i<n;i++){
            p.offer(Long.parseLong(input[i]));
        }
        for(int i=0;i<m;i++){
            long sum=p.poll()+p.poll();
            p.offer(sum);
            p.offer(sum);
        }
        for(long v :p){
            val+=v;
        }
        System.out.println(val);
    }
}
