package greedy;
import java.io.*;
import java.util.*;
public class Bac7570 {
    public void solution() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            dp[num] = dp[num - 1] + 1;
            if (dp[num] > maxLen) {
                maxLen = dp[num];
            }
        }
        System.out.println(N - maxLen);
    }
}

