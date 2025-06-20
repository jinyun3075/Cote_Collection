package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac1012 {
    static int[][] board;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t--> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            board = new int[n][m];

            int seed = Integer.parseInt(st.nextToken());

            while(seed-->0){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[x][y] = 1;
            }

            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    if(board[i][j] == 1){
                        bfs(i,j);
                        result++;
                    }
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
        
    }

    public static class Node{
        int x;
        int y;
        Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void bfs(int x, int y){
        Queue<Node> que = new LinkedList<>();
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        que.add(new Node(x,y));
        board[x][y] = 0;
        while(!que.isEmpty()){
            Node node = que.poll();
            for(int[] d : dir){
                int nx = node.x + d[0];
                int ny = node.y + d[1];
                if(nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length){
                    continue;
                }
                if(board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    que.add(new Node(nx,ny));
                }
            }
        }

    }
}
