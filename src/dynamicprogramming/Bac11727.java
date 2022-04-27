package dynamicprogramming;

import java.util.Scanner;

public class Bac11727 {
    static Integer dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new Integer[n];
        dp[0] = 1;
        if (n > 1)
            dp[1] = 3;
        System.out.println(logic(n - 1));

    }

    static int logic(int n) {
        if (dp[n] == null) {
            dp[n] = logic(n - 1) + logic(n - 2) * 2;
        }
        return dp[n] % 10007;
    }
}
