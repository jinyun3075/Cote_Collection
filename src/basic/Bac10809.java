package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bac10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int alpha[] = new int[26];
        Arrays.fill(alpha, -1);
        String S = bf.readLine();
        for (int i = 0; i < S.length(); i++) {
            if (alpha[(int) S.charAt(i) - 'a'] == -1) {
                alpha[S.charAt(i) - 'a'] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}
