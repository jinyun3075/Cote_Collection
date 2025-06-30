package bfs;
import java.io.*;
import java.util.*;
public class Bac11967 {
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
        int N = Integer.parseInt(st.nextToken()) + 1;
        int M = Integer.parseInt(st.nextToken());
        Queue<Node>[][] board = new LinkedList[N][N];
        boolean[][] switches = new boolean[N][N];
        boolean[][] visited = new boolean[N][N];
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(!visited[x][y]){
                visited[x][y] = true;
                board[x][y] = new LinkedList<>();
            }
            board[x][y].add(new Node(a, b));
        }
        int result = 1;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        visited = new boolean[N][N];
        visited[1][1] = true;
        switches[1][1] = true;
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(1, 1));
        while(!que.isEmpty()){
            Node node = que.poll();
            if(board[node.x][node.y] != null){
                for(Node newRoom : board[node.x][node.y]){
                    if(!switches[newRoom.x][newRoom.y]){
                        switches[newRoom.x][newRoom.y] = true;
                        result++;

                        for(int[] dir : directions){
                            int nx = newRoom.x + dir[0];
                            int ny = newRoom.y + dir[1];   
                            if(nx < 0 || ny < 0 || nx >= N || ny >= N){
                                continue;
                            }
                            if(visited[nx][ny]){
                                visited[newRoom.x][newRoom.y] = true;
                                que.add(new Node(newRoom.x, newRoom.y));
                                break;
                            }
                        }
                    }
                }
            }

            for(int[] dir : directions){
                int nx = node.x + dir[0];
                int ny = node.y + dir[1];   
                if(nx < 0 || ny < 0 || nx >= N || ny >= N){
                    continue;
                }
                if(!visited[nx][ny] && switches[nx][ny]){
                    visited[nx][ny] = true;
                    que.add(new Node(nx, ny));
                }
            }
        }
        System.out.println(result);
    }
}
