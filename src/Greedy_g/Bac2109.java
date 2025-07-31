package Greedy_g;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac2109 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        PriorityQueue<Point> arr = new PriorityQueue<Point>((Point a, Point b) -> (a.x == b.x) ? b.y - a.y : b.x - a.x);
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            int p = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arr.add(new Point(p, d));
        }
        boolean[] lec = new boolean[10001];
        Arrays.fill(lec, false);
        int val = 0;
        while (!arr.isEmpty()) {
            Point lecture = arr.poll();
            for (int i = lecture.y; i > 0; i--) {
                if (!lec[i]) {
                    lec[i] = true;
                    val += lecture.x;
                    break;
                }
            }
        }
        System.out.println(val);
    }
}
