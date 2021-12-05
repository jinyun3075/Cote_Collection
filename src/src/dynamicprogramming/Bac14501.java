package src.dynamicprogramming;

import java.util.Scanner;

public class Bac14501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] T = new int[N+2];
        int[] P = new int[N+2];
        int[] dp = new int[N+2];

        for(int i=1;i<=N;i++){
            T[i]=sc.nextInt();
            P[i]=sc.nextInt();
        }

        for(int i=N;i>0;i--){
            int day=i+T[i];

            if(day<=N+1){
                dp[i]= Math.max(P[i]+dp[day], dp[i+1]);
            }else{
                dp[i]=dp[i+1];
            }
        }
        System.out.println(dp[1]);

    }

}
