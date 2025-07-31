package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Bac1715 {
    public static void main(String[] ags) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        PriorityQueue<Long> pri = new PriorityQueue<>();
        for(int i =0;i<N;i++){
            pri.offer(Long.parseLong(bf.readLine()));
        }

        long val =0;
        long sum;
        while(pri.size()>1){
            sum=pri.poll()+ pri.poll();
            val+=sum;
            pri.offer(sum);
        }
        System.out.println(val);
    }
}
