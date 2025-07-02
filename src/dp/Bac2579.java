package dp;
import java.io.*;

public class Bac2579 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] staire = new int[N + 1];
        int[] dp = new int[N + 1];
        for(int i = 1 ; i <= N ; i++){
            staire[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = staire[1];
        if(N > 2) dp[2] = staire[1]+staire[2];
        
        for(int i = 3 ; i <= N ; i++){
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + staire[i - 1]) + staire[i];
        }
        System.out.println(dp[N]);
    }
}
