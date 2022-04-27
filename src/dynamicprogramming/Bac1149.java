package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bac1149 {
    static int dp[][];
    static int dpCost[][];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        dp = new int[N][3];
        dpCost = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            dpCost[i][0] = Integer.parseInt(st.nextToken());
            dpCost[i][1] = Integer.parseInt(st.nextToken());
            dpCost[i][2] = Integer.parseInt(st.nextToken());
        }
        dp[0][0] = dpCost[0][0];
        dp[0][1] = dpCost[0][1];
        dp[0][2] = dpCost[0][2];

        System.out.println(Math.min(DP(N - 1, 0), Math.min(DP(N - 1, 1), DP(N - 1, 2))));
    }

    static int DP(int N, int color) {
        if (dp[N][color] == 0) {
            if (color == 0) {
                dp[N][color] = Math.min(DP(N - 1, 1), DP(N - 1, 2)) + dpCost[N][color];
            } else if (color == 1) {
                dp[N][color] = Math.min(DP(N - 1, 0), DP(N - 1, 2)) + dpCost[N][color];
            } else {
                dp[N][color] = Math.min(DP(N - 1, 1), DP(N - 1, 0)) + dpCost[N][color];
            }
        }
        return dp[N][color];
    }
}

