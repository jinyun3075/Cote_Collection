package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bac1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        char alpha[] = new char[10];
        Integer count[] = new Integer[10];
        Arrays.fill(alpha, '0');
        Arrays.fill(count, 0);

        for (int i = 0; i < N; i++) {
            String input = bf.readLine();
            int location = 1;
            for (int j = input.length() - 1; j >= 0; j--) {
                for (int k = 0; k < alpha.length; k++) {
                    if (alpha[k] == '0') {
                        alpha[k] = input.charAt(j);
                        count[k] = location;
                        break;
                    } else if (alpha[k] == input.charAt(j)) {
                        count[k] += location;
                        break;
                    }
                }
                location *= 10;
            }
        }
        int val = 0;
        Arrays.sort(count);
        for (int i = 9; i >= 0; i--) {
            val += i * count[i];
        }
        System.out.println(val);
    }
}