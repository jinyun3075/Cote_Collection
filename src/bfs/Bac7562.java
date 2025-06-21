package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac7562 {
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
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-->0) {
            int l = Integer.parseInt(br.readLine());
            int[][] board = new int[l][l];
            Queue<Node> que = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nightX = Integer.parseInt(st.nextToken());
            int nightY = Integer.parseInt(st.nextToken());
            que.add(new Node(nightX, nightY,0));
            board[nightX][nightY] = 1;

            st = new StringTokenizer(br.readLine());
            int finishX = Integer.parseInt(st.nextToken());
            int finishY = Integer.parseInt(st.nextToken());
            
            int[][] direction = {
                {2,1},{2,-1}
                ,{1, 2},{1, -2}
                ,{-1, 2},{-1,-2}
                ,{-2, 1},{-2, -1}
            };
            while(!que.isEmpty()){
                Node night = que.poll();            
                if(night.x == finishX && night.y == finishY ) {
                    sb.append(night.cnt).append("\n");
                    break;
                }

                for(int[] dir : direction){
                    int nx = night.x + dir[0];
                    int ny = night.y + dir[1];

                    if(nx < 0 || ny < 0 || nx >= l || ny >= l){
                        continue;
                    }

                    if(board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        que.add(new Node(nx,ny,night.cnt + 1));
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }  
}
