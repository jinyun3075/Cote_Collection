package dynamicprogramming;

import java.util.Scanner;

public class Bac11722 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] dp = new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }

        dp[0]=1;
        int val =1;
        for(int i=1;i<N;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(A[i]<A[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                val=Math.max(val,dp[i]);
            }
        }

        System.out.println(val);

    }
}
