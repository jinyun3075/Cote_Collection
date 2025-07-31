package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac16953_DFS {
    static long val=1;
    static boolean zero=true;
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        logic(A,B);
        if(zero){
            System.out.println(-1);
        }
    }
        static cal Case1 = a->a*2;
        static cal Case2 = a->(a*10)+1;

    static void logic(long A, long B){
        if(A==B) {
            System.out.println(val);
            zero=false;
            return;
        }
        if(A<B){
            val++;
            logic(Case1.sum(A),B);
            logic(Case2.sum(A),B);
            val--;
        }
    }
}

interface cal{
    long sum(Long a);
}
