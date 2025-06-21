package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac7569 {
    public static class Node{
        int x;
        int y;
        int z;
        int day;
        Node(int x, int y,int z, int day){
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int board[][][] = new int[h][n][m];
        int result = 0;
        int[][] direction = {{0, 0, 1},{0, 0, -1},{0, 1, 0},{0, -1,0},{1,0,0},{-1,0,0}};
        Queue<Node> que = new LinkedList<>();
        
        for(int i = 0 ; i < h ;i++){
            for(int j = 0 ; j < n ; j++){
                st = new StringTokenizer(br.readLine());
                for(int z = 0 ; z < m ; z++){
                    board[i][j][z] = Integer.parseInt(st.nextToken());
                    if(board[i][j][z] == 1) {
                        que.add(new Node(j, z, i,0));
                    }
                }
            }
        }

        while(!que.isEmpty()){
            Node node = que.poll();
            result = Math.max(result, node.day);
            for(int[] dir : direction){
                int nx = node.x + dir[0];
                int ny = node.y + dir[1];
                int nz = node.z + dir[2];
                
                if(nx < 0 || ny < 0 || nz < 0 || nx >= n || ny >= m || nz >= h){
                    continue;
                }

                if(board[nz][nx][ny] == 0){
                    board[nz][nx][ny] = 1;
                    que.add(new Node(nx, ny, nz , node.day + 1));
                }
            }
        }

        for(int i = 0 ; i < h ;i++){
            for(int j = 0 ; j < n ; j++){
                for(int z = 0 ; z < m ; z++){
                    if(board[i][j][z] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(result);
        
    }  
}
