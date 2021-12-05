package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac8980 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); //마을
        int C = Integer.parseInt(st.nextToken()); // 최대 중량

        int M = Integer.parseInt(bf.readLine());  // 화물
        PriorityQueue<box> pr = new PriorityQueue<>();
        for(int i=0;i<M;i++){
            st=new StringTokenizer(bf.readLine());
            int b=Integer.parseInt(st.nextToken());
            int r=Integer.parseInt(st.nextToken());
            int s=Integer.parseInt(st.nextToken());
            pr.offer(new box(b,r,s));
        }
        int val=0;
        int town[] = new int[N];
        Arrays.fill(town,C);

        while(!pr.isEmpty()){
            box b=pr.poll();
            int max = C;
            for(int i=b.send;i<b.receive;i++){
                if(town[i]<b.size){
                    max=Math.min(max,town[i]);
                }else{
                    max=Math.min(max,b.size);
                }
            }

            for(int i=b.send;i<b.receive;i++){
                town[i]-=max;
            }
            val+=max;
        }
    System.out.println(val);
    }
}
class box implements Comparable<box> {
    int send;
    int receive;
    int size;

    box(int b,int r,int s){
        send=b;
        receive=r;
        size=s;
    }

    @Override
    public int compareTo(box o) {
        if(this.receive==o.receive){
            return this.send-o.send;
        }
        return this.receive-o.receive;

    }
}
