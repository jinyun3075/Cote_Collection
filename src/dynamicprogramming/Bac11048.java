package dynamicprogramming;

import java.util.Scanner;

public class Bac11048 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int map[][] = new int[N+1][M+1];
        int dp[][] = new int[N+1][M+1];

        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                map[i][j]=sc.nextInt();
            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                dp[i][j]=Math.max(dp[i-1][j],Math.max(dp[i][j-1],dp[i-1][j-1]))+map[i][j];
            }
        }
        System.out.println(dp[N][M]);



    }
}
