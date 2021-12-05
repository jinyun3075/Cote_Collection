package src.dynamicprogramming;

import java.util.Scanner;

public class Bac15988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long dp[][] = new long[1000001][4];
        dp[1][1]=1;
        dp[2][1]=1;
        dp[2][2]=1;
        dp[3][1]=2;
        dp[3][2]=1;
        dp[3][3]=1;
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            int n = sc.nextInt();

            for(int i=4;i<=n;i++){
                if(dp[i][0]==0){
                    for(int j=1;j<4;j++){
                        dp[i][1] = (dp[i][1]+dp[i-1][j])%1000000009;
                        dp[i][2] = (dp[i][2]+dp[i-2][j])%1000000009;
                        dp[i][3] = (dp[i][3]+dp[i-3][j])%1000000009;
                    }
                }
                dp[i][0]=1;
            }
            long val =(dp[n][1]+dp[n][2]+dp[n][3])%1000000009;
            sb.append(val).append('\n');
        }
        System.out.println(sb);
    }
}
