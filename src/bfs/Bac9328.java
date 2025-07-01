package bfs;
import java.io.*;
import java.util.*;
public class Bac9328 {
    public static class Node {
        int x, y;
        Node(int x, int y) { this.x = x; this.y = y; }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            char[][] board = new char[h + 2][w + 2];
            boolean[][] visited = new boolean[h + 2][w + 2];
            boolean[] haveKey = new boolean[26];
            Queue<Node>[] doorList = new LinkedList[26];

            for (int i = 0; i < 26; i++) doorList[i] = new LinkedList<>();

            for (int i = 0; i < h + 2; i++) Arrays.fill(board[i], '.');

            for (int i = 1; i <= h; i++) {
                char[] input = br.readLine().toCharArray();
                for (int j = 1; j <= w; j++) {
                    board[i][j] = input[j - 1];
                }
            }

            char[] keys = br.readLine().toCharArray();
            if (keys[0] != '0') {
                for (char key : keys) {
                    haveKey[key - 'a'] = true;
                }
            }

            Queue<Node> que = new LinkedList<>();
            que.add(new Node(0, 0));
            visited[0][0] = true;
            int result = 0;
            int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            while (!que.isEmpty()) {
                Node node = que.poll();

                for (int[] dir : direction) {
                    int nx = node.x + dir[0];
                    int ny = node.y + dir[1];

                    if (nx < 0 || ny < 0 || nx >= h + 2 || ny >= w + 2) continue;
                    if (visited[nx][ny] || board[nx][ny] == '*') continue;

                    char c = board[nx][ny];

                    if ('A' <= c && c <= 'Z') {
                        int idx = c - 'A';
                        if (haveKey[idx]) {
                            board[nx][ny] = '.';
                        } else {
                            doorList[idx].add(new Node(nx, ny));
                            continue;
                        }
                    } else if ('a' <= c && c <= 'z') {
                        int idx = c - 'a';
                        if (!haveKey[idx]) {
                            haveKey[idx] = true;
                            while (!doorList[idx].isEmpty()) {
                                Node door = doorList[idx].poll();
                                board[door.x][door.y] = '.';
                                que.add(new Node(door.x, door.y));
                                visited[door.x][door.y] = true;
                            }
                        }
                        board[nx][ny] = '.';
                    } else if (c == '$') {
                        result++;
                        board[nx][ny] = '.';
                    }

                    visited[nx][ny] = true;
                    que.add(new Node(nx, ny));
                }
            }

            sb.append(result).append("\n");
        }
        System.out.print(sb);     
    }
}
