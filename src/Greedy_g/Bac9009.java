package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Bac9009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int i=0;i<T;i++){
            int n =  Integer.parseInt(bf.readLine());
            ArrayList<Integer> val = new ArrayList<>();
            while(n!=0){
                Deque<Integer> pa = new LinkedList<>();
                pa.offer(1);
                pa.offer(1);
                while(pa.peekLast()<=n){
                    pa.offer(pa.poll()+ pa.peek());
                }
                int v =pa.poll();
                n-=v;
                val.add(v);
            }
            Collections.sort(val);
            for(Integer v :val){
                System.out.print(v+" ");
            }
            System.out.println();

        }
    }
}
