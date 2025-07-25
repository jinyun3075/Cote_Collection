package dp;
import java.io.*;

public class Bac9461 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Long[] dp = new Long[101];
        dp[0] = 0l;
        dp[1] = 1l;
        dp[2] = 1l;
        int minIdx = 3;
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            
            for(int i = minIdx ; i <= N ; i++){
                if(dp[i] == null){
                    dp[i] = dp[i - 2] + dp[i - 3];
                    minIdx = i;
                }
            }
            sb.append(dp[N]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
