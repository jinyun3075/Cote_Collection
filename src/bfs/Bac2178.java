package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac2178 {
    public static class Node{
        int x;
        int y;
        int cnt;
        Node(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    public void solution() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int board[][] = new int[n][m];
        int visited[][] = new int[n][m];
        int result = 0;
        Queue<Node> que = new LinkedList<>();
        
        for(int i = 0 ; i < n ;i++){
            char[] input = br.readLine().toCharArray();
            for(int j = 0 ; j < m ; j++){
                board[i][j] = input[j] - '0';
            }
        }

        int[][] direction = {{0, 1},{0,-1},{1,0},{-1,0}};
        que.add(new Node(0,0,1));
        visited[0][0] =  1;
        while(!que.isEmpty()){
           Node node = que.poll();
           if(n - 1 == node.x && m - 1 == node.y){
                result = node.cnt;
                break;
           }

           for(int i= 0 ; i < direction.length; i++){
                int nx = node.x + direction[i][0];
                int ny = node.y + direction[i][1];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }

                if(board[nx][ny] == 1 && visited[nx][ny] == 0){
                    que.add(new Node(nx,ny, node.cnt + 1));
                    visited[nx][ny] =  1;
                }
           }
            
        }
        System.out.println(result);
    }
}
