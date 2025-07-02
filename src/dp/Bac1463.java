package dp;
import java.io.*;

public class Bac1463 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int [N + 1];
        
        for(int i = 2 ; i <= N ; i++){
            dp[i] = dp[i - 1];
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[ i / 3]);
            }
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[ i / 2]);
            }
            dp[i] += 1;
        }
        System.out.println(dp[N]);
    }
}
