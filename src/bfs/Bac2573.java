package bfs;
import java.io.*;
import java.util.*;
public class Bac2573 {
    static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int N;
    static int M;
    static int[][] board;
    static boolean[][] visited;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];

        for(int i = 0 ; i < N ; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0 ; j < M ; j++){
                board[i][j] = Integer.parseInt(input[j]);
            }
        }
        int result = 0;
        while(true){
            int island = 0;
            visited = new boolean[N][M];
            for(int i = 0 ; i < N ; i++){
                for(int j = 0 ; j < M ; j++){
                    if(!visited[i][j] && board[i][j] > 0){
                        bfs(i,j);
                        island++;
                    }
                }
            }
            if(island > 1){
                break;
            }else if(island == 0){
                result = 0;
                break;
            }

            result += 1;
        }
        System.out.println(result);
        
    }
    public static void bfs(int i, int j){
        int[][] direction = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(i,j));
        visited[i][j] = true;
        while(!que.isEmpty()){
            Node node = que.poll();
            int remove = 0;

            for(int[] dir : direction){
                int nx = node.x + dir[0];
                int ny = node.y + dir[1];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M){
                    continue;
                }

                if(!visited[nx][ny]){
                    if(board[nx][ny] < 1){
                        remove++;
                    }else{
                        que.add(new Node(nx,ny));
                        visited[nx][ny] = true;
                    }
                }

            }
            board[node.x][node.y] -= remove;

        }
    }
}
