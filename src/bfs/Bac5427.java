package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac5427 {
    public static class Node{
        int x;
        int y;
        int time;
        Node(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    public void solution() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            char board[][] = new char[m][n];
            int[][] direction = {{0, 1},{0,-1},{1,0},{-1,0}};
            Queue<Node> jMove = new LinkedList<>();
            Queue<Node> fireMove = new LinkedList<>();
            boolean exit = false;
            boolean[][] visited = new boolean[m][n];
            for(int i = 0 ; i < m ;i++){
                char[] input = br.readLine().toCharArray();
                for(int j = 0 ; j < n ; j++){
                    board[i][j] = input[j];
                    if(board[i][j] == '@') jMove.add(new Node(i, j, 1));
                    if(board[i][j] == '*') fireMove.add(new Node(i, j, 0));
                }
            }
            
            while((!jMove.isEmpty()) && !exit){
               int fireCnt = fireMove.size();
               while(fireCnt-- > 0){
                    Node fire = fireMove.poll();
                    for(int i= 0 ; i < direction.length; i++){
                        int nx = fire.x + direction[i][0];
                        int ny = fire.y + direction[i][1];
                        if(nx < 0 || ny < 0 || nx >= m || ny >= n){
                            continue;
                        }
    
                        if(board[nx][ny] == '.' || board[nx][ny] == '@'){
                            board[nx][ny] = '*';
                            fireMove.add(new Node(nx,ny, 0));
                        }
                    }
    
               }
    
               int jCnt = jMove.size();
               while(jCnt-- > 0){
                   Node j = jMove.poll();

                   if(j.x == 0 || j.y == 0 || j.x == m - 1 || j.y == n - 1){
                            result.append(j.time).append("\n");
                            exit= true;
                            break;
                    }
                    
                   for(int i= 0 ; i < direction.length; i++){
                        int nx = j.x + direction[i][0];
                        int ny = j.y + direction[i][1];
        
                        if(nx < 0 || ny < 0 || nx >= m || ny >= n){
                            continue;
                        }

                        if(!visited[nx][ny] && board[nx][ny] == '.'){
                            jMove.add(new Node(nx,ny,j.time + 1));
                            visited[nx][ny] = true;
                        }
                   }
               }
    
                
            }
    
            if(!exit)result.append("IMPOSSIBLE").append("\n");
        }
        System.out.println(result.toString());
    }
}
