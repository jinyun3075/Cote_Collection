package dp;
import java.io.*;
import java.util.StringTokenizer;

public class Bac11659 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] sumlist = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N; i++){
            sumlist[i] = sumlist[i - 1] + Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            sb.append(sumlist[j] - sumlist[i - 1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
