package src.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac15650 {
    static int val[];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        val = new int[m];
        logic(n,m,0,0);
    }
    static void logic(int n,int m,int d,int z){
        if(m==d){
            for(int v : val){
                System.out.print(v+" ");
            }
            System.out.println();
            return;
        }
        for(int i=z;i<n;i++){
            val[d]=i+1;
            logic(n,m,d+1,i+1);
        }
    }
}
