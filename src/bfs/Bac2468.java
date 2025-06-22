package bfs;
import java.io.*;
import java.util.*;
public class Bac2468 {
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
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        StringTokenizer st;
        int max_water = 0;
        int min_water = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                max_water = Math.max(max_water, board[i][j]);
                min_water = Math.min(min_water, board[i][j]);
            }
        }
        int result = 0;
        for(int i = 0 ; i <= max_water ; i++){
            result = Math.max(result, bfs(board, i));
        }
        System.out.println(result);
    }
    public static int bfs(int[][] board, int standard){
        int board_size = board.length;
        int[][] temp_board = new int[board_size][board_size];

        for(int i = 0 ; i < board_size ; i++){
            for(int j = 0 ; j < board_size ; j++){
                if(board[i][j] <= standard){
                    temp_board[i][j] = 1;
                }
            }
        }

        Queue<Node> que;
        int[][] direction = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        int result = 0;
        for(int i = 0 ; i < board_size ; i++){
            for(int j = 0 ; j < board_size ; j++){
                if(temp_board[i][j] == 0){
                    temp_board[i][j] = 1;
                    result++;
                    que = new LinkedList<>();
                    que.add(new Node(i,j));
                    while(!que.isEmpty()){
                        Node node = que.poll();
                        for(int[] dir : direction){
                            int nx = node.x + dir[0];
                            int ny = node.y + dir[1];
                            if(nx < 0 || ny < 0 || nx >= board_size || ny >= board_size){
                                continue;
                            }
                            if(temp_board[nx][ny] == 0){
                                temp_board[nx][ny] = 1;
                                que.add(new Node(nx,ny));
                            }
                        }
                    }
                }
            }
        }

        return result;
    }
}
