package dp;
import java.io.*;

public class Bac12852 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N + 1];
        int[] path = new int[N + 1];
        
        for(int i = 2 ; i <= N ; i++){
            int preIdx = i;
            list[i] = Integer.MAX_VALUE;

            if(i % 3 == 0){
                preIdx = list[i / 3] < list[preIdx] ? i / 3 : preIdx;
            }
            if(i % 2 == 0){
                preIdx = list[i / 2] < list[preIdx] ? i / 2 : preIdx;
            }
            preIdx = list[i - 1] < list[preIdx] ? i - 1 : preIdx;

            list[i] = list[preIdx] + 1;
            path[i] = preIdx;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = N ; i != 1 ; i = path[i]){
            sb.append(i).append(" ");
        }
        System.out.println(list[N]);
        System.out.println(sb.toString() + "1");
    }
}
