package dynamicprogramming;

import java.util.Scanner;

public class Bac1890 {
    static int[][] map;
    static Long dp[][];
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        dp = new Long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        logic(0, 0);
        System.out.println(dp[0][0]);

    }

    static long logic(int n, int m) {
        if (n == N - 1 && m == N - 1) {
            return 1;
        }else if(n >=N || m >= N){
            return 0;
        }
        if (dp[n][m] == null) {
            dp[n][m]=0l;
            int v = map[n][m];
            if (n + v < N) {
                dp[n][m] += logic(n + v, m);
            }
            if (m + v < N) {
                dp[n][m] += logic(n, m + v);
            }
        }
        return dp[n][m];
    }
}