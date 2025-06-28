package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac13913 {
    
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int maxnum = 100001;

        Queue<Integer> que = new LinkedList<>();
        
        boolean[] visited = new boolean[maxnum];
        int[] memo = new int[maxnum];
        visited[N] = true;
        que.add(N);
        memo[N] = -1;
        while(!que.isEmpty()){
            int cur = que.poll();
            if(cur == K){
                break;
            }

            int[] numList = {cur + 1, cur - 1, cur * 2};

            for(int num : numList){
                if(num >= 0 && num < maxnum && !visited[num]){
                    visited[num] = true;
                    memo[num] = cur;
                    que.add(num);
                }
            }
        }
        List<Integer> result = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = K ; i != -1 ; i = memo[i]){
            result.add(i);
        }
        for(int num : result){
            sb.insert(0,num + " ");
            
        }

        System.out.println(result.size() - 1);
        System.out.print(sb.toString().trim());
    }
}
