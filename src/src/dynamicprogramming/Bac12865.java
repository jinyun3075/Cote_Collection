package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac12865 {
    static Integer[][] val;
    static int[][] bag;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N =Integer.parseInt(st.nextToken());
        int K =Integer.parseInt(st.nextToken());
        bag = new int[N][2];
        val = new Integer[N][K+1];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(bf.readLine());
            bag[i][0]=Integer.parseInt(st.nextToken());
            bag[i][1]=Integer.parseInt(st.nextToken());
        }

        System.out.println(logic(N-1,K));
    }
    static int logic(int n, int s){
        if(n<0){
            return 0;
        }
        if(val[n][s]==null){
            if(bag[n][0]>s){
                val[n][s]=logic(n-1,s);
            }else{
                val[n][s] = Math.max(logic(n-1,s),logic(n-1,s-bag[n][0])+bag[n][1]);
            }
        }
        return val[n][s];
    }
}