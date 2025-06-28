package bfs;
import java.io.*;
import java.util.*;
public class Bac14442 {
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] board = new int[N][M];
        boolean[][][] visited = new boolean[K + 1][N][M];
        for(int i = 0 ; i < N ; i++){
            char[] input = br.readLine().toCharArray();
            for(int j = 0 ; j < M ; j++){
                board[i][j] = input[j] - '0';
            }
        }
        Queue<Node> que = new LinkedList<>();
        int[][] direction = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        int result = -1;
        que.add(new Node(0, 0, 1, K));
        while(!que.isEmpty() && result == -1){
            Node node = que.poll();
            if( node.x == N -1 && node.y == M - 1){
                result = node.cnt;
                break;
            }
            for(int[] dir : direction){
                int nx = node.x + dir[0];
                int ny = node.y + dir[1];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M){
                    continue;
                }

                if(!visited[node.jump][nx][ny] && board[nx][ny] == 0){
                    visited[node.jump][nx][ny] = true;
                    que.add(new Node(nx, ny, node.cnt + 1, node.jump));
                }

                if(node.jump > 0 && !visited[node.jump - 1][nx][ny] && board[nx][ny] == 1){
                    visited[node.jump - 1][nx][ny] = true;
                    que.add(new Node(nx, ny, node.cnt + 1, node.jump - 1));
                }
                
            }
        }
        System.out.println(result);
    }
}
