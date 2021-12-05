package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Bac1080 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static int N,M,val;

    static boolean[][] Bol1;
    static boolean[][] Bol2;
    static void create1() throws IOException {
        for (int i = 0; i < N; i++) {
            String wo = bf.readLine();
            for (int j = 0; j < M; j++) {
                if (wo.charAt(j) == '1') Bol1[i][j] = true;
                else Bol1[i][j] = false;
            }
        }
    }
    static void create2() throws IOException {
        for (int i = 0; i < N; i++) {
            String wo = bf.readLine();
            for (int j = 0; j < M; j++) {
                if (wo.charAt(j) == '1') Bol2[i][j] = true;
                else Bol2[i][j] = false;
            }
        }
    }

    static void com() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (Bol1[i][j] != Bol2[i][j]) {
                    if (!anal(i, j)) break;
                }
            }
        }
    }

    static boolean anal(int a, int b) {
        if (a + 3 > N || b + 3 > M) return false;
        else {
            for (int i = a; i < a + 3; i++) {
                for (int j = b; j < b + 3; j++) {
                    Bol1[i][j] = !Bol1[i][j];
                }
            }
            val++;
            return true;
        }
    }

    static boolean result() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (Bol1[i][j] != Bol2[i][j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        val=0;
        Bol1=new boolean[N][M];
        Bol2=new boolean[N][M];
        create1();
        create2();
        if (N < 3 || M < 3) {
            System.out.println(result() == true ? 0 : -1);
        }else{
            com();
            System.out.println(result() == true ? val : -1);
        }
    }
}
