package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac7576 {
    public static class Node{
        int x;
        int y;
        int day;
        Node(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    public void solution() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int board[][] = new int[n][m];
        int result = 0;
        int[][] direction = {{0, 1},{0,-1},{1,0},{-1,0}};
        Queue<Node> que = new LinkedList<>();
        
        for(int i = 0 ; i < n ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1) {
                    que.add(new Node(i,j,0));
                }
            }
        }
        
        while(!que.isEmpty()){
           Node node = que.poll();
           result = Math.max(node.day, result);
           for(int i= 0 ; i < direction.length; i++){
                int nx = node.x + direction[i][0];
                int ny = node.y + direction[i][1];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }

                if(board[nx][ny] == 0){
                    que.add(new Node(nx,ny, node.day + 1));
                    board[nx][ny] = 1;
                }
           }
            
        }

        boolean isfull = true;
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                if(board[i][j] == 0){
                    isfull = false;
                    break;
                }
            }
            if(!isfull) break;
        }
        System.out.println(isfull ? result : -1);
    }
}
