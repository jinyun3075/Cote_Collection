package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
public class Bac10026 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] board1 = new char[N][N];
        char[][] board2 = new char[N][N];
        int[][] visited1 = new int[N][N];
        int[][] visited2 = new int[N][N];
        for(int i = 0 ; i < N ; i++){
            char[] rgb = br.readLine().toCharArray();
            for(int j = 0 ; j < N ; j++){
                board1[i][j] = rgb[j];
                board2[i][j] = rgb[j] == 'G' ? 'R' : rgb[j];
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(visited1[i][j] == 0){
                    visited1[i][j] = 1;
                    bfs(i,j,board1[i][j], board1, visited1);
                    sum1++;
                }
                if(visited2[i][j] == 0){
                    visited2[i][j] = 1;
                    bfs(i,j,board2[i][j], board2, visited2);
                    sum2++;
                }
            }
        }
        System.out.println(sum1 + " " + sum2);
        
    }

    public static void bfs(int x, int y, char color, char[][] board, int[][] visited){
        Queue<Node> que = new LinkedList<>();
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        que.add(new Node(x,y));
        while(!que.isEmpty()){
            Node node = que.poll();
            for(int[] d : dir){
                int nx = node.x + d[0];
                int ny = node.y + d[1];
                if(nx < 0 || ny < 0 || nx >= board.length || ny >= board.length){
                    continue;
                }
                if(visited[nx][ny] == 0 && board[nx][ny] == color){
                    visited[nx][ny] = 1;
                    que.add(new Node(nx, ny));
                }
            }
        }
    }

    public static class Node{
        int x;
        int y;
        Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}
