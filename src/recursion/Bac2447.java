package recursion;

import java.util.Scanner;

public class Bac2447 {
    static char[][] arr;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new char[N][N];
        logic(0,0,N,true);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void logic(int x, int y, int size, boolean star) {
        if (!star) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (size == 1) {
            arr[x][y] = '*';
            return;
        }

        int div = size / 3;
        int count = 1;
        for (int i = x; i < x + size; i += div) {
            for (int j = y; j < y + size; j += div) {
                if (count++ == 5) {
                    logic(i, j, div, false);
                } else {
                    logic(i, j, div, true);
                }
            }
        }

    }
}
