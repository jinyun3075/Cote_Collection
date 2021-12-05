package src.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac14889 {
    static boolean choice[];
    static int[][] table;
    static int N;
    static int val = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        table = new int[N][N];
        choice = new boolean[N];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < N; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        logic(0, 0);
        System.out.println(val);


    }

    static void logic(int teamIndex, int count) {
        if (count == N / 2) {
            div();
            return;
        }
        for (int i = teamIndex; i < N; i++) {
            if (!choice[i]) {
                choice[i] = true;
                logic(i + 1, count + 1);
                choice[i] = false;
            }
        }

    }
    static void div(){
        int team1 = 0;
        int team2 = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (choice[i]==true && choice[j]==true){
                    team1 += table[i][j];
                    team1 += table[j][i];
                }else if (choice[j]==false && choice[i]==false) {
                    team2 += table[i][j];
                    team2 += table[j][i];
                }
            }
        }
        int v = Math.abs(team1 - team2);
        if (v == 0) {
            System.out.println(0);
            System.exit(0);
        }

        val = Math.min(v, val);

    }
}
