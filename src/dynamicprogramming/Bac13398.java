package dynamicprogramming;

import java.util.Scanner;

public class Bac13398 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[][]= new int[n+1][2];
        int num[] = new int[n+1];

        for(int i=1;i<=n;i++){
            num[i]=sc.nextInt();
        }

        dp[1][0]=dp[1][1]=num[1];
        int val =num[1];
        for(int i=2;i<=n;i++){
            dp[i][0] = Math.max(num[i],dp[i-1][0]+num[i]);
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][1]+num[i]);
            val=Math.max(val,dp[i][1]);
        }

        System.out.println(Math.max(dp[n][0],val));
    }
}
