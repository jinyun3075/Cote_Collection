package src.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bac2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long[] length = new long[N];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            length[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(length);

        long left = 0;
        long right = length[N - 1];

        while (left <= right) {
            long mid = (left + right) / 2;
            long val = 0;
            for (int i = 0; i < N; i++) {
                val += Math.max(length[i] - mid, 0);
            }
            if (val < M) {
                right = mid - 1;
            } else if (val >= M) {
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
}
