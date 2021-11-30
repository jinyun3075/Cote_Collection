package dynamicprogramming;

import java.util.Scanner;

public class Bac1699 {
    static int dp[] ;
    static int ze[];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new int[N+1];
        ze = new int[317];
        for(int i=1;i<317;i++){
            ze[i]=i*i;
        }
        dp[1]=1;

        for(int i=2;i<=N;i++){
                dp[i]=Integer.MAX_VALUE;
            for(int j=1;j<317;j++){
                if(ze[j]>i) break;
                dp[i]=Math.min(dp[i-ze[j]]+1,dp[i]);
            }
        }
        System.out.println(dp[N]);

    }
    static int logic(int n){
        if(n==0) return 0;
        if(dp[n]==0){
            dp[n]=Integer.MAX_VALUE;
            for(int i=1;i<317;i++){
                if(ze[i]>n){
                    break;
                }
                dp[n] = Math.min(logic(n-ze[i])+1,dp[n]);
            }
        }
        return dp[n];
    }

}
