package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());
        int vals[] =new int[T];
        for(int i=0;i<T;i++){
        int val=1;
        PriorityQueue<test> pr = new PriorityQueue<>();
            int N = Integer.parseInt(bf.readLine());
            for(int j=0;j<N;j++){
                st = new StringTokenizer(bf.readLine());
                test t = new test(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
                pr.offer(t);
            }
                int com = pr.poll().view;
            while(pr.peek()!=null){
                int temp =pr.poll().view;
                if(com>temp){
                    val++;
                    com=temp;
                }
            }
            vals[i]=val;
        }
        for(int v :vals){
            System.out.println(v);
        }
    }
}
class test implements Comparable<test>{
    int doc;
    int view;
    test(int d, int v){
        doc =d;
        view=v;
    }
    public int compareTo(test test){
        return Integer.compare(this.doc,test.doc);
    }
}
