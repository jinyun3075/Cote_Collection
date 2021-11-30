package dynamicprogramming;

import java.util.Scanner;

public class Bac9465 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int dp[][] = new int[n+1][2];
            int arr[][] = new int[n+1][2];
            for(int j=0;j<2;j++){
                for(int z=1;z<=n;z++)
                    arr[z][j]=sc.nextInt();
            }
            dp[1][0]=arr[1][0];
            dp[1][1]=arr[1][1];
            for(int j=2;j<=n;j++){
                dp[j][0] = Math.max(dp[j-1][1],dp[j-2][1])+arr[j][0];
                dp[j][1] = Math.max(dp[j-1][0],dp[j-2][0])+arr[j][1];
            }
            sb.append(Math.max(dp[n][0],dp[n][1])).append('\n');
        }
        System.out.println(sb);
    }
}
