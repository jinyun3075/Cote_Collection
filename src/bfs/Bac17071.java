package bfs;
import java.io.*;
import java.util.*;
public class Bac17071 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int maxnum = 500001;

        Queue<Integer> que = new LinkedList<>();
        
        boolean[][] visited = new boolean[2][maxnum];
        
        visited[0][N] = true;
        que.add(N);
        int time = 0;
        int result = -1;
        while(K < maxnum && result == -1){
            int forSize = que.size();

            while(forSize-- > 0 && !que.isEmpty()){
                int cur = que.poll();
                if(cur == K){
                    result = time;
                    break;
                }
    
                int[] numList = {cur + 1, cur - 1, cur * 2};
    
                for(int num : numList){
                    if(num >= 0 && num < maxnum && !visited[(time + 1) % 2][num]){
                        visited[(time + 1) % 2][num] = true;
                        que.add(num);
                    }
                }
    
            }
            time++;
            K += time;
            if(K >= maxnum) break;
            if(visited[time % 2][K]){
                result = time;
                break;
            }
        }
        System.out.println(result);      
    }
}
