package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac4179 {
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char board[][] = new char[n][m];
        int result = 0;
        int[][] direction = {{0, 1},{0,-1},{1,0},{-1,0}};
        Queue<Node> jMove = new LinkedList<>();
        Queue<Node> fireMove = new LinkedList<>();
        boolean exit = false;
        for(int i = 0 ; i < n ;i++){
            char[] input = br.readLine().toCharArray();
            for(int j = 0 ; j < m ; j++){
                board[i][j] = input[j];
                if(board[i][j] == 'J') jMove.add(new Node(i, j, 1));
                if(board[i][j] == 'F') fireMove.add(new Node(i, j, 0));
            }
        }
        
        while((!jMove.isEmpty()) && !exit){
           int fireCnt = fireMove.size();
           while(fireCnt-- > 0){
                Node fire = fireMove.poll();
                for(int i= 0 ; i < direction.length; i++){
                    int nx = fire.x + direction[i][0];
                    int ny = fire.y + direction[i][1];
                    if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                        continue;
                    }

                    if(board[nx][ny] != '#'){
                        fireMove.add(new Node(nx,ny, 0));
                        board[nx][ny] = '#';
                    }
                }

           }

           int jCnt = jMove.size();
           while(jCnt-- > 0){
               Node j = jMove.poll();
               for(int i= 0 ; i < direction.length; i++){
                    int nx = j.x + direction[i][0];
                    int ny = j.y + direction[i][1];
    
                    if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                        result = j.time;
                        exit= true;
                        break;
                    }
    
                    if(board[nx][ny] == '.'){
                        jMove.add(new Node(nx,ny,j.time + 1));
                        board[nx][ny] = 'J';
                    }
               }
           }

            
        }

        
        System.out.println(exit ? result : "IMPOSSIBLE");
    }
}
