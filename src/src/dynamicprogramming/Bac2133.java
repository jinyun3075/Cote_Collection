package src.dynamicprogramming;

import java.util.Scanner;

public class Bac2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        int val = 0;
        if (n % 2 == 0) {
            dp[0] = 1;
            dp[2] = 3;
            for (int i = 4; i <= n; i += 2) {
                for (int j = 2; j <= i; j += 2) {
                    int specialCase = j == 2 ? 3 : 2;
                    dp[i] += specialCase * dp[i - j];
                }
            }
            val = dp[n];
        }
        System.out.println(val);
    }
}
