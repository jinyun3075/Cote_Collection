package src.dynamicprogramming;

import java.util.Scanner;

public class Bac11057 {
    static int[][] dp;
    static int N;
    static int val=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new int[N+1][10];
        for(int i=0;i<10;i++){
            dp[1][i]=1;
        }
        for(int i=0;i<10;i++){
            val+=logic(N,i);
        }
        System.out.println(val);
    }
    static int logic(int n,int i){
        if(dp[n][i]==0){
            for(int j=i;j>=0;j--){
                dp[n][i]+=logic(n-1,j);
            }
        }
        return dp[n][i]%10007;
    }

}
