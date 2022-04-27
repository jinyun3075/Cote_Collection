package dynamicprogramming;

import java.util.Scanner;

public class Bac11055 {
    static long dp[] ;
    static long input[];
    static long val;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n+1];
        input = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();
        }

        for(int i=1;i<=n;i++){
            val=Math.max(logic(i),val);
        }
        System.out.println(val);

    }
    static long logic(int n){
        if(dp[n]==0){
            dp[n]= input[n];
            for(int i=n-1;i>0;i--){
                if(input[n]>input[i]){
                    dp[n]=Math.max(dp[n],logic(i)+input[n]);
                }
            }
        }
        return dp[n];
    }
}
