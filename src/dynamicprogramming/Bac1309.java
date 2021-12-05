package dynamicprogramming;

import java.util.Scanner;

public class Bac1309 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int MOD = 9901;
        int dp[][]= new int[n][3];

        dp[0][0]=1;
        dp[0][1]=1;
        dp[0][2]=1;
        for(int i=1;i<n;i++){
            dp[i][0]=(dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%MOD;
            dp[i][1]=(dp[i-1][0]+dp[i-1][2])%MOD;
            dp[i][2]=(dp[i-1][0]+dp[i-1][1])%MOD;
        }
        int val = (dp[n-1][0]+dp[n-1][1]+dp[n-1][2])%MOD;
        System.out.println(val);
    }
}
