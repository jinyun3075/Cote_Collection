package dfs;
import java.io.*;

import java.util.StringTokenizer;
public class Bac9466 {
    static int[] group;
    static boolean[] visited;
    static boolean[] finished;
    static int result;
    public static void dfs(int sidx){
        visited[sidx] = true;
        int next = group[sidx];
        if(!visited[next]){
            dfs(next);
        }else if(!finished[next]){
            for(int i = next ; sidx != i ; i = group[i]){
                result--;
            }
            result--;
        }
        finished[sidx] = true;
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());
            group = new int[n + 1];
            visited = new boolean[n + 1];
            finished = new boolean[n + 1];
            result = n;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 1 ; i <= n ; i++){
                group[i] = Integer.parseInt(st.nextToken());
            }

            for(int i = 1 ; i <= n ; i++){
                if(!visited[i]){
                    dfs(i);
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}
