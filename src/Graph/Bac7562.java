package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bac7562 {

    static int[][] map;
    static int answer = 0;
    static boolean[][] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            int size = sc.nextInt();
            map = new int[size][size];
            visit = new boolean[size][size];
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            int endX = sc.nextInt();
            int endY = sc.nextInt();

            map[startX][startY] = 1;
            map[endX][endY] = 2;

            Queue<Data> que = new LinkedList<>();

            que.add(new Data(startX, startY,0));

            bfs(que);

            System.out.println(answer);
        }
    }

    static int[][] direction = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};

    public static void bfs(Queue<Data> que) {
        while (!que.isEmpty()) {
            Data data = que.poll();
            if(map[data.x][data.y] == 2) {
                answer = data.count;
                break;
            }
            map[data.x][data.y] =1;
            for (int i = 0; i < direction.length; i++) {
                int newX = data.x+direction[i][0];
                int newY = data.y+direction[i][1];
                if(newX>=0&&newX < map.length && newY>=0 && newY < map.length) {
                    if(map[newX][newY] == 0) {
                        map[newX][newY] = 1;
                        que.add(new Data(newX,newY,data.count+1));
                    } else if(map[newX][newY] == 2) {
                        answer = data.count+1;
                        return;
                    }
                }
            }
        }
    }
    static class Data {
        int count;
        int x;
        int y;

        Data(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}