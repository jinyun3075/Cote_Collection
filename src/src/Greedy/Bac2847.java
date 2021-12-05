package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bac2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        int input=Integer.parseInt(bf.readLine());
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<input;i++){
            dq.offer(Integer.parseInt(bf.readLine()));
        }

        int val=0;
        while(dq.size()>1){
            int temp1 =dq.pollLast();
            int temp2 =dq.pollLast();
            if(temp1<=temp2){
                val+=temp2-temp1+1;
                dq.offer(temp1-1);
            }else{
                dq.offer(temp2);
            }
        }
        System.out.println(val);
    }
}
