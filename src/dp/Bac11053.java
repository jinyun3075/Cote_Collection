package dp;
import java.io.*;
import java.util.StringTokenizer;

public class Bac11053 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N + 1];
        int[] dp = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for(int i = 1 ; i <= N ;i++){
            dp[i] = 0;
            for(int j = 1 ; j < i ; j++){
                if(list[i - j] < list[i]){
                    dp[i] = Math.max(dp[i - j], dp[i]);
                }
            }
            dp[i] += 1;
            result = Math.max(dp[i], result);
        }
        System.out.println(result);
    }
}
