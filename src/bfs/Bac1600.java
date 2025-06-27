package bfs;
import java.io.*;
import java.util.*;
public class Bac1600 {
    public static class Node{
        int x;
        int y;
        int cnt;
        int jump;
        Node(int x, int y, int cnt, int jump){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.jump = jump;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][] board = new int[H][W];
        boolean[][][] visited = new boolean[K + 1][H][W];
        int[][] direction = {{0, 1},{0, -1},{1, 0},{-1, 0},{1, 2},{1, -2},{2, -1},{2, 1},{-1, 2},{-1, -2},{-2, 1},{-2, -1}};
        for(int i = 0 ; i < H ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < W ; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(0, 0, 0, 0));
        int result = -1;
        while(!que.isEmpty()){
            Node node = que.poll();

            if(node.x == H - 1 && node.y == W - 1){
                result = node.cnt;
                break;
            }
            for(int i = 0 ; i < direction.length ; i++){
                int nx = node.x + direction[i][0];
                int ny = node.y + direction[i][1];
                int njump = node.jump;
                if(nx < 0 || ny < 0 || nx >= H || ny >= W){
                    continue;
                }
                
                if(i > 3){
                    njump++;
                    if(njump > K) break;
                }
                if(!visited[njump][nx][ny] && board[nx][ny] == 0){
                    visited[njump][nx][ny] = true;
                    que.add(new Node(nx, ny, node.cnt + 1 , njump));
                }

            }
        }
        System.out.println(result);
        
    }
}
