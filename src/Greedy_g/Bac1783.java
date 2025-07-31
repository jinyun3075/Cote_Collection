package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac1783 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int val = 0;
        if (N == 1) {
        } else if (N == 2) {
            val = (M-1) / 2;
            val = val > 3 ? 3 : val;
        } else if (M < 7) {
            val = M-1;
            val = val > 3 ? 3 : val;
        } else {
            val = 4 + M - 7;
        }
        System.out.println(val+1);
    }
}


