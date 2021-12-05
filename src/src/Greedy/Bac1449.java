package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        PriorityQueue<Float> pip = new PriorityQueue<>();
        st=new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            pip.offer(Float.parseFloat(st.nextToken()));
        }
        int val=0;
        while(!pip.isEmpty()){
            double com = pip.poll()+L-0.5;
            while(!pip.isEmpty()&&pip.peek()<com){
                pip.remove();
                }
            val++;
        }
        System.out.println(val);
    }
}
