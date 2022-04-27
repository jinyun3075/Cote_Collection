package dynamicprogramming;

import java.util.Scanner;

public class Bac11052 {
    static Integer dp[];
    static int N;
    static int cost[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        cost = new int[N+1];
        dp = new Integer[N+1];
        for(int i=1;i<=N;i++){
            cost[i]=sc.nextInt();
        }
        System.out.println(logic(N));
    }
    static int logic(int n){
        if(dp[n]==null){
            dp[n]=0;
                for(int i=n;i>0;i--){
                    dp[n]=Math.max(dp[n],logic(n-i)+cost[i]);
                }
        }
        return dp[n];
    }
}
