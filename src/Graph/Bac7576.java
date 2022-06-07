package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bac7576 {
    static int N;
    static int M;
    static int[][] board;
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        board = new int[N][M];
        Queue<Data> que = new LinkedList<>();

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j]==1) {
                    que.add(new Data(i,j,0));
                }
            }
        }

        bfs(que);

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(board[i][j]==0) {
                    result = -1;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    static int[] location = {-1,1};
    public static void bfs(Queue<Data> que) {
        while(!que.isEmpty()) {
            Data data = que.poll();
            for(int i=0;i<location.length;i++) {
                int newX = data.x+location[i];
                int newY = data.y+location[i];

                if(0<=newX&&newX<N) {
                    if(board[newX][data.y]==0) {
                        board[newX][data.y]=1;
                        que.add(new Data(newX,data.y,data.state+1));
                    }
                }
                if(0<=newY&&newY<M){
                    if(board[data.x][newY]==0) {
                        board[data.x][newY]=1;
                        que.add(new Data(data.x,newY,data.state+1));
                    }
                }
            }
            result =data.state;
        }
    }

}
class Data {
    int x;
    int y;
    int state;
    Data(int x,int y, int state) {
        this.x = x;
        this.y = y;
        this.state=state;
    }
}
