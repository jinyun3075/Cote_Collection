package bruteforce;

import java.util.Scanner;

public class Bac14500 {
    static int val = 0;
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] ch;
    static int[] nextX = {-1, 0, 1, 0};
    static int[] nextY = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        ch = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                logic(i, j, 0, 0);
                ex(i, j);
            }
        }
        System.out.println(val);


    }

    static void logic(int n, int m, int de, int sum) {
        if (de == 4) {
            val = Math.max(val, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = n + nextX[i];
            int ny = m + nextY[i];
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }
            if (ch[nx][ny]) {
                continue;
            }
            ch[nx][ny] = true;
            logic(nx, ny, de + 1, sum + map[nx][ny]);
            ch[nx][ny] = false;

        }
    }

    static void ex(int n, int m) {
        int wing = 4;
        int min = Integer.MAX_VALUE;
        int sum = map[n][m];
        for (int i = 0; i < 4; i++) {
            int nx = n + nextX[i];
            int ny = m + nextY[i];

            if (wing <= 2) {
                return;
            }
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                wing--;
                continue;
            }

            sum += map[nx][ny];
            min = Math.min(min, map[nx][ny]);
        }
        if (wing == 4) {
            sum -= min;
        }
        val = Math.max(val, sum);
    }


}
