package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Bac2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        int K = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> arr = new PriorityQueue<>();
        PriorityQueue<Integer> garr = new PriorityQueue<>();
        String[] input = bf.readLine().split(" ");
        for(int i=0;i<N;i++){
            arr.offer(Integer.parseInt(input[i]));
        }
        int val=0;
        if(N>K){
            while(arr.size()>1){
                int gap = arr.poll();
                garr.offer(arr.peek()-gap);
            }
            for(int i=0;i<N-K;i++){
                val+=garr.poll();
            }
            System.out.println(val);
        }else{
            System.out.println(0);
        }
    }
}
