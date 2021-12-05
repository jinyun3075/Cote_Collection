package src.Greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
public class Bac1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> qn = new PriorityQueue<>();
        int N = Integer.parseInt(bf.readLine());
        int val=0;
        for(int i=0;i<N;i++){
            int input = Integer.parseInt(bf.readLine());
            if(input<1){
                qn.offer(input);
            }else if(input==1){
                val+=input;
            }else{
                q.offer(input);
            }
        }
        while(qn.size()>1){
            val+=qn.poll()*qn.poll();
        }
        if(qn.peek()!=null)
        val+=qn.poll();
        while(q.size()>1){
            val+=q.poll()* q.poll();
        }
        if(q.peek()!=null)
        val+=q.poll();
        System.out.print(val);
    }
}
