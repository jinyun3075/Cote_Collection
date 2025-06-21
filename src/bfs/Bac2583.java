package bfs;
import java.io.*;
import java.util.*;
public class Bac2583 {
    public static class Node{
        int x;
        int y;
        int time;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        int[][] board = new int[N][M];
        while(K-- > 0){
            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            for(int i = sx; i < ex ; i++){
                for(int j = sy ; j < ey ; j++){
                    board[i][j] = 1;
                }
            }

        }
        Queue<Node> que = new LinkedList<>();
        int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
        int cnt = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                if(board[i][j] == 0){
                    que.add(new Node(i, j));
                    board[i][j] = 1;
                    cnt++;
                    int sum = 1;
                    while(!que.isEmpty()){
                        Node node = que.poll();
                        for(int[] dir : direction){
                            int nx = node.x + dir[0];
                            int ny = node.y + dir[1];
                            if(nx >= 0 && ny >= 0 && nx < N && ny < M && board[nx][ny] == 0){
                                board[nx][ny] = 1;
                                que.add(new Node(nx,ny));
                                sum++;
                            }
                        }
                    }
                    list.add(sum);
                }
            }
        }
        list.sort((a,b)-> a-b);
        for(Integer v : list){
            sb.append(v).append(" ");
        }
        System.out.println(cnt);
        System.out.println(sb.toString().trim());
    }
}
