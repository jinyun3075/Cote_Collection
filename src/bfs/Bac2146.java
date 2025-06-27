package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac2146 {
    static class Node{
        int x;
        int y;
        int cnt;
        Node(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    static int[][] board;
    static int[][] direction = {{0, 1},{0, -1},{1, 0},{-1, 0}};
    static int N;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int result = Integer.MAX_VALUE;
        StringTokenizer st;
        board = new int[N][N];
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[][][] visiteds = ChangeTeam();
         for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                int team = board[i][j];
                if(!visiteds[team][i][j] && team > 0){
                    visiteds[team][i][j] = true;
                    result = Math.min(result, FindIsland(visiteds, new Node(i, j, 0), team));
                }
            }
        }
        System.out.println(result);
    }
    public static int FindIsland(boolean[][][] visiteds , Node st_node, int team){
        Queue<Node> que = new LinkedList<>();
        que.add(st_node);
        int result = Integer.MAX_VALUE;
        while(!que.isEmpty()){
            Node node = que.poll();
            for(int[] dir : direction){
                int nx = node.x + dir[0];
                int ny = node.y + dir[1];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >= N){
                    continue;
                }

                if(!visiteds[team][nx][ny] && team != board[nx][ny]){
                    visiteds[team][nx][ny] = true;
                    que.add(new Node(nx, ny, node.cnt + 1 ));
                    if(board[nx][ny] > 0){
                        return node.cnt;
                    }
                }
            }
        }
        return result;

    }
    public static boolean[][][] ChangeTeam(){
        int team = 1;
        boolean[][] isChange = new boolean[N][N];
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(!isChange[i][j] && board[i][j] == 1){
                    isChange[i][j] = true;
                    board[i][j] = team;
                    Change_BFS(isChange, new Node(i, j, 0), team++);
                }
            }
        }
        boolean[][][] visiteds = new boolean[team + 1][N][N];
        return visiteds;
    }

    public static void Change_BFS(boolean[][] is_change, Node st_node, int team){
        Queue<Node> que = new LinkedList<>();
        que.add(st_node);
        while(!que.isEmpty()){
            Node node = que.poll();
            for(int[] dir : direction){
                int nx = node.x + dir[0];
                int ny = node.y + dir[1];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N){
                    continue;
                }

                if(!is_change[nx][ny] && board[nx][ny] == 1) {
                    is_change[nx][ny] = true;
                    que.add(new Node(nx, ny, 0));
                    board[nx][ny] = team;
                }
            }
        }
    }
}
