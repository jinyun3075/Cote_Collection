package bfs;
import java.io.*;
import java.util.*;
public class Bac16920 {
    public static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;            
        }
    }
    static int N;
    static int M;
    static int P;
    static int[][] board;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        Queue<Node>[] queList = new LinkedList[P + 1];
        int[] teamTurn = new int[P + 1];
        int remain = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= P ; i++){
            teamTurn[i] = Integer.parseInt(st.nextToken());
            queList[i] = new LinkedList<>();
        }

        for(int i = 0 ; i < N ; i++){
            char[] input = br.readLine().toCharArray();
            for(int j = 0 ; j < M ; j++){
                if(input[j] == '.'){
                    remain++;
                    board[i][j] = 0;
                }else if(input[j] == '#'){
                    board[i][j] = -1;
                }else {
                    int team = input[j] - '0';
                    board[i][j] = team;
                    queList[team].add(new Node(i,j));
                }
            }
        }
        int[][] direction = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        int[] result = new int[P + 1];
        while(remain > 0){
            boolean progressed = false;
            for(int i = 1 ; i <= P ; i++){
                Queue<Node> list = queList[i];
                int turn = teamTurn[i];
                while(turn-- > 0 && !list.isEmpty()){
                    int castleCnt = list.size();
                    while(castleCnt-- > 0){
                        Node node = list.poll();
                        for(int[] dir : direction){
                            int nx = node.x + dir[0];
                            int ny = node.y + dir[1];
                            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                            if(board[nx][ny] == 0){
                                board[nx][ny] = i;
                                list.add(new Node(nx, ny));
                                remain--;
                                progressed = true;
                            }
                        }
                    }
                }
                queList[i] = list;
            }
            if(!progressed) break;
        }
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                int idx = board[i][j];
                if(idx > 0) result[idx]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i < result.length ; i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
