package src.dynamicprogramming;

import java.util.Scanner;

public class Bac15990 {
    static Long dp[][] = new Long[100001][4];
    static final int M_VALUE = 1000000009;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        dp[1][1] = 1l;
        dp[2][2] = 1l;
        dp[3][1] = 1l;
        dp[3][2] = 1l;
        dp[3][3] = 1l;

        while (T-- > 0) {
            int n = sc.nextInt();
            long val = (logic(n, 1) + logic(n, 2) + logic(n, 3)) % M_VALUE;
            sb.append(val).append('\n');
        }
        System.out.println(sb);
    }

    static long logic(int n, int x) {
        if (n < 1) return 0;
        if (dp[n][x] == null) {
            switch (x) {
                case 1:
                    dp[n][x] = (logic(n - 1, 2) + logic(n - 1, 3)) % M_VALUE;
                    break;
                case 2:
                    dp[n][x] = (logic(n - 2, 1) + logic(n - 2, 3)) % M_VALUE;
                    break;
                case 3:
                    dp[n][x] = (logic(n - 3, 1) + logic(n - 3, 2)) % M_VALUE;
                    break;
            }
        }
        return dp[n][x] % M_VALUE;
    }
}
