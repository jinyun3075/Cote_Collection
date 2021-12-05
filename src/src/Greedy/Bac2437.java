package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac2437 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st= new StringTokenizer(bf.readLine());
        PriorityQueue<Integer> chu = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            chu.offer(Integer.parseInt(st.nextToken()));
        }

        int val=0;
        while(!chu.isEmpty()){
            if(chu.peek()>val+1){
                break;
            }
            val+=chu.poll();
        }
        System.out.println(val+1);
    }
}
