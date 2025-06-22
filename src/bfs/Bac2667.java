package bfs;
import java.io.*;
import java.util.*;
public class Bac2667 {
    public static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static char[][] board;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        for(int i = 0 ; i < N ; i++){
            board[i] = br.readLine().toCharArray();
        }
        int cnt = 0;
        List<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(board[i][j] == '1'){
                    board[i][j] = '0';
                    list.add(bfs(i,j));
                    cnt++;
                }
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(int num : list){
            System.out.println(num);
        }
        
    }
    public static int bfs(int x, int y){
        Queue<Node> que = new LinkedList<>();
        int[][] directions = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        que.add(new Node(x,y));
        int sum = 1;
        while(!que.isEmpty()){
            Node node = que.poll();
            for(int[] dir : directions){
                int nx = node.x + dir[0];
                int ny = node.y + dir[1];
                if(nx < 0 || ny < 0 || nx >= board.length || ny >= board.length){
                    continue;
                }
                if(board[nx][ny] == '1'){
                    board[nx][ny] = '0';
                    que.add(new Node(nx,ny));
                    sum++;
                }
            }
        }
        return sum;
    }
}
