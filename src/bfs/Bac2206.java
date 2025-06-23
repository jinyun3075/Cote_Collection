package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac2206
 {
    public static class Node{
        int x;
        int y;
        boolean broke;
        int cnt;
        Node(int x, int y, boolean broke,int cnt){
            this.x = x;
            this.y = y;
            this.broke = broke;
            this.cnt = cnt;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] board = new int[N][M];
        int[][][] visited = new int[2][N][M];
        for(int i = 0 ; i < N ; i++){
            char[] input = br.readLine().toCharArray();
            for(int j = 0 ; j < M ; j++){
                board[i][j] = input[j] - '0';
            }
        }
        Queue<Node> que = new LinkedList<>();
        int[][] direction = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        int result = -1;
        que.add(new Node(0, 0, false, 1));
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
                if(!node.broke && visited[0][nx][ny] == 0 && board[nx][ny] == 0){
                    visited[0][nx][ny] = 1;
                    que.add(new Node(nx,ny, node.broke, node.cnt + 1));
                }else if(node.broke && visited[1][nx][ny] == 0 && board[nx][ny] == 0){
                    visited[1][nx][ny] = 1;
                    que.add(new Node(nx,ny, node.broke, node.cnt + 1));
                }else if(!node.broke && visited[1][nx][ny] == 0 && board[nx][ny] == 1){
                    visited[1][nx][ny] = 1;
                    que.add(new Node(nx,ny, !node.broke, node.cnt + 1));
                }
            }
        }
        System.out.println(result);
    }
}
