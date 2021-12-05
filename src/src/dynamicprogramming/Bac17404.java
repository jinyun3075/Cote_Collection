package src.dynamicprogramming;

import java.util.Scanner;

public class Bac17404 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dp[][] = new int[n+1][3];
        int map[][] = new int[n+1][3];

        for(int i=1;i<=n;i++){
            for(int j=0;j<3;j++){
                map[i][j]=sc.nextInt();
            }
        }

        final int M =1000*1000;
        int val=M;
        for(int i=0;i<3;i++){

            for(int k=0;k<3;k++){
                if(i==k) dp[1][k]=map[1][k];
                else dp[1][k] = M;
            }


            for(int j=2;j<=n;j++){
                dp[j][0] = Math.min(dp[j-1][1],dp[j-1][2])+map[j][0];
                dp[j][1] = Math.min(dp[j-1][0],dp[j-1][2])+map[j][1];
                dp[j][2] = Math.min(dp[j-1][1],dp[j-1][0])+map[j][2];
            }

            for(int k=0;k<3;k++){
                if(i!=k) val = Math.min(val,dp[n][k]);
            }
        }

        System.out.println(val);

    }
}
