package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Bac10994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mapLength = (n - 1) * 4 + 1;
        char[][] map = new char[mapLength][mapLength];

        fillSpace(map, mapLength);

        drawStar(0, mapLength - 1, map);

        System.out.println(printMap(map));
    }

    public static char[][] fillSpace(char[][] map, int mapLength) {
        for (int i = 0; i < mapLength; i++) {
            Arrays.fill(map[i], ' ');
        }
        return map;
    }

    public static void drawStar(int start, int end, char[][] map) {
        if (start == end) {
            map[start][end] = '*';
            return;
        }

        drawStar(start + 2, end - 2, map);
        for (int i = start; i <= end; i++) {
            map[i][start] = '*';
            map[i][end] = '*';
            map[start][i] = '*';
            map[end][i] = '*';
        }
    }

    public static StringBuilder printMap(char[][] map) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }
        return sb;
    }
}