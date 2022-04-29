package recursion;

import java.util.*;

public class Bac19947 {
    final double FIVE_DIV_ARGS = 1.35;
    final double THREE_DIV_ARGS = 1.2;
    final double ONE_DIV_ARGS = 1.05;
    int[] dp;

    Bac19947(int H, int Y) {
        init(H, Y);
    }

    private void init(int H, int Y) {
        dp = new int[Y + 1];
        dp[0] = H;
        logic(Y);
    }

    public int logic(int year) {
        if (endLogic(year)) {
            return 0;
        }
        if (checkDP(year)) {
            calculator(year);
        }
        return dp[year];
    }

    public int getValue() {
        return dp[dp.length - 1];
    }

    private boolean endLogic(int year) {
        if (year < 0) {
            return true;
        }
        return false;
    }

    private boolean checkDP(int year) {
        if (dp[year] == 0) {
            return true;
        }
        return false;
    }

    private void calculator(int year) {
        if (year > 4) {
            dp[year] = (int) Math.max(dp[year], logic(year - 5) * FIVE_DIV_ARGS);
        }
        if (year > 2) {
            dp[year] = (int) Math.max(dp[year], logic(year - 3) * THREE_DIV_ARGS);
        }
        dp[year] = (int) Math.max(dp[year], logic(year - 1) * ONE_DIV_ARGS);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int Y = sc.nextInt();
        Bac19947 solution = new Bac19947(H, Y);
        System.out.println(solution.getValue());
    }
}