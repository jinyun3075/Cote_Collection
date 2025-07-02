package dp;
import java.io.*;

public class Bac9095 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T --> 0){
            int N = Integer.parseInt(br.readLine());
            int[] dp = new int [12];
            
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for(int i = 4 ; i <= N ; i++){
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }
            sb.append(dp[N]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
