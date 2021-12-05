package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bac11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int N = Integer.parseInt(bf.readLine());
        PriorityQueue<lecture> pr = new PriorityQueue<>();
        PriorityQueue<Integer> val = new PriorityQueue<>();

        for(int i=0;i<N;i++){
            st =new StringTokenizer(bf.readLine());
            pr.offer(new lecture(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }

        val.offer(pr.poll().end);
        while(!pr.isEmpty()){
            lecture com = pr.poll();
            if(val.peek()<=com.start){
                val.poll();
            }
            val.offer(com.end);
        }

        System.out.println(val.size());
    }
}

class lecture implements Comparable<lecture>{
    int start;
    int end;
    boolean use=false;

    lecture(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public int compareTo(lecture o) {
        if(this.start==o.start){
            return this.end-o.end;
        }
        return this.start-o.start;
    }
}
