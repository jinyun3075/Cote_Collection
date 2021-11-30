package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac15651 {
    static StringBuilder out = new StringBuilder();
    static int val[];
    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());

        val = new int[m];
        logic(n,m,0);
        System.out.println(out);
    }
    static void logic(int n, int m, int d){
        if(m==d){
            for(int v :val){
                out.append(v).append(' ');
            }
            out.append('\n');
            return;
        }

        for(int i=0;i<n;i++){
            val[d]=i+1;
            logic(n,m,d+1);
        }
    }
}
