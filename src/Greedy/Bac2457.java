package Greedy;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac2457 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Point> arr = new PriorityQueue<Point>((Point a,Point b)-> a.x==b.x?a.y-b.y:a.x-b.x);
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(bf.readLine()) ;
            int month1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());

            int month2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());

            arr.add(new Point(month1*100+day1,month2*100+day2));
        }
        int val=0;
        int step1=0;
        while(!arr.isEmpty()&&arr.peek().x<=301){
            step1=Math.max(arr.poll().y,step1);
        }
        if(step1==0) {
            System.out.println(val);
        }else{
            val++;
            while(!arr.isEmpty()&&step1<=1200){
                int step2=0;
                while(!arr.isEmpty()&&arr.peek().x<=step1){
                    step2=Math.max(arr.poll().y,step2);
                }
                if(arr.isEmpty()&&step2<=1200||step2==0){
                    val=0;
                    break;
                }else{
                    step1=step2;
                    val++;
                }
            }
            System.out.println(val);
        }

    }
}
