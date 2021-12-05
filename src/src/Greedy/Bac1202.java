package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac1202 {
    static long val=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        PriorityQueue<Treasure> treasures = new PriorityQueue<>();
        PriorityQueue<Integer> back = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(bf.readLine());
            treasures.offer(new Treasure(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        for(int i=0;i<K;i++) back.offer(Integer.parseInt(bf.readLine()));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(!back.isEmpty()){
            while(!treasures.isEmpty() && treasures.peek().weight<=back.peek()){
                pq.offer(treasures.poll().value);
            }
            if(!pq.isEmpty()) val+=pq.poll();
            back.poll();
        }
        System.out.println(val);
    }
}

class Treasure implements Comparable<Treasure>{
    int weight;
    int value;
    Treasure(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
    @Override
    public int compareTo(Treasure o) {
       return this.weight-o.weight;
    }
}
