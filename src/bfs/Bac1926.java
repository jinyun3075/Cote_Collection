package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac1926 {
    public static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public void solution() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int board[][] = new int[n][m];
        int isViste[][] = new int[n][m];
        int[] result = new int[2];
        Queue<Node> que = new LinkedList<>();
        Queue<Node> startQue = new LinkedList<>();
        
        for(int i = 0 ; i < n ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1){
                    startQue.add(new Node(i, j));
                }
            }
        }

        int[][] rocation = {{0, 1},{0,-1},{1,0},{-1,0}};

        while(!startQue.isEmpty()){
            Node start = startQue.poll();
            int sum = 0;
            if(isViste[start.x][start.y] == 0){
                que.add(start);
                isViste[start.x][start.y] = 1;
                sum++;
                result[0]++;
            }
            while(!que.isEmpty()){
                Node node = que.poll();

                for(int i = 0 ; i < rocation.length; i++){
                    int nx = node.x + rocation[i][0];
                    int ny = node.y + rocation[i][1];
                    
                    if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                        continue;
                    }

                    if(isViste[nx][ny] == 0 && board[nx][ny] == 1){
                        que.add(new Node(nx,ny));
                        isViste[nx][ny] = 1;
                        sum++;
                    }
                }
            }
            result[1] = Math.max(result[1], sum);
        }

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
