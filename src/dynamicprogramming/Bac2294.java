package dynamicprogramming;


import java.util.Arrays;
import java.util.Scanner;

public class Bac2294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] m = new int[n];
        int[] dp = new int[k+1];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        Arrays.fill(dp,1,dp.length,10001);
        Arrays.sort(m);
        for(int j=0;j<n;j++){
            for(int i=m[j];i<=k;i++){
                dp[i]= Math.min(dp[i],dp[i-m[j]]+1);
            }
        }
        System.out.println(dp[k]>10000?-1:dp[k]);
    }
}
