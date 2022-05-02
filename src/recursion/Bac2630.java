package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac2630 {
    static int[][] map;
    static int white;
    static int blue;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        map = new int[n][n];

        for(int i=0;i<n;i++) {
            String[] input = bf.readLine().split(" ");
            for(int j=0;j<n;j++) {
                map[i][j] = Integer.parseInt(input[j]);
            }
        }

        logic(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void logic(int col, int row, int size) {
        if(check(col,row,size)) {
            if(map[col][row]==1) {
                blue++;
            }else {
                white++;
            }
            return;
        }

        int divSize = size/2;
        logic(col,row,divSize);
        logic(col,row+divSize,divSize);
        logic(col+divSize,row,divSize);
        logic(col+divSize,row+divSize,divSize);
    }
    public static boolean check(int col, int row, int size) {
        int base = map[col][row];
        for (int i = col; i < col + size; i++) {
            for (int j = row; j < row + size; j++) {
                if (base != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
