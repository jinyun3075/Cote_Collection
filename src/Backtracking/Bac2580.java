package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac2580 {
    static int sdo[][] = new int[9][9];

    public static void main(String[] args) throws IOException {
        input();
        sudoku(0, 0);
    }

    static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 9; j++) {
                sdo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void sudoku(int x, int y) {
        if (x == 9) {
            sudoku(0, y + 1);
            return;
        }

        if (y == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(sdo[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if (sdo[x][y] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (Possibility(x, y, i)) {
                    sdo[x][y] = i;
                    sudoku(x + 1, y);
                }
            }
            sdo[x][y] = 0;
            return;
        }
        sudoku(x + 1, y);
    }

    static boolean Possibility(int x, int y, int val) {
        for (int i = 0; i < 9; i++) {
            if (val == sdo[i][y]) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (val == sdo[x][i]) {
                return false;
            }
        }
        int setx = (x / 3) * 3;
        int sety = (y / 3) * 3;
        for (int i = setx; i < setx + 3; i++) {
            for (int j = sety; j < sety + 3; j++) {
                if (sdo[i][j] == val)
                    return false;
            }
        }

        return true;
    }
}
