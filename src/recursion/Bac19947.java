package recursion;
import java.util.*;

public class Bac19947 {
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int Y = sc.nextInt();
        final double FIVE_DIV_ARGS = 2.857142857142857;
        final double THREE_DIV_ARGS = 5.0;
        final double ONE_DIV_ARGS = 20.0;

        dp = new int[Y + 1];
        dp[0] = H;
        dp[1] = dp[0] + (int) (H / ONE_DIV_ARGS);
        for (int i = 2; i <= Y; i++) {
            if (i > 4) {
                dp[i] = (int) Math.max(dp[i], dp[i - 5] + (dp[i - 5] / FIVE_DIV_ARGS));
            }
            if (i > 2) {
                dp[i] = (int) Math.max(dp[i], dp[i - 3] + (dp[i - 3] / THREE_DIV_ARGS));
            }
            dp[i] = (int) Math.max(dp[i], dp[i - 1] + (dp[i - 1] / ONE_DIV_ARGS));
        }
        System.out.println(dp[Y]);
    }
}