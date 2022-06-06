package Graph;

import java.util.Scanner;

public class Bac4963 {
    static int[][] board;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            M = sc.nextInt();
            N = sc.nextInt();
            if (N == 0 || M == 0) {
                break;
            }

            board = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    board[i][j] = sc.nextInt();
                }
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (board[i][j] == 1) {
                        dfs(i, j);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }
    public static void dfs(int x, int y) {
        if (0 > y || 0 > x || x >= N || y >= M || board[x][y] == 0) {
            return;
        }
        board[x][y] = 0;
        dfs(x + 1, y + 1);
        dfs(x + 1, y - 1);
        dfs(x - 1, y + 1);
        dfs(x - 1, y - 1);
        dfs(x + 1, y);
        dfs(x - 1, y);
        dfs(x, y + 1);
        dfs(x, y - 1);
    }
}
