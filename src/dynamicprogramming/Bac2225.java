package dynamicprogramming;

import java.util.Scanner;

public class Bac2225 {
    static Long dp[][];
    static int N;
    static int K;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        dp = new Long[N+1][K+1];
        long val =logic(0,K)%1000000000;
        System.out.println(val);
    }
    static long logic(int n,int v){
        if(v==1) return 1;
        if(dp[n][v]==null){
            dp[n][v]=0l;
            for(int i=0;i<=N;i++){
                if(n+i>N){
                    break;
                }
                dp[n][v] += logic(n+i,v-1);
            }
        }
        return dp[n][v]%1000000000;
    }
}
