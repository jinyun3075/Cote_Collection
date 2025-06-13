package linkedlist;
import java.io.*;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bac1158 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;
        int cnt = 0;
        StringBuilder result = new StringBuilder();
        Queue<Integer> queue = new java.util.LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            int num = queue.poll();
            if(cnt >= K){
                result.append(num).append(", ");
                cnt = 0;
            }else{
                queue.offer(num);
                cnt++;
            }
        }
        System.out.println("<" + result.substring(0, result.length() - 2) + ">");
    }
}
