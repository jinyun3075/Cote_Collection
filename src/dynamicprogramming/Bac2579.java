package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bac2579 {
    static Integer me[];
    static int stairs[];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(bf.readLine());
        me = new Integer[f + 1];
        stairs = new int[f + 1];
        for (int i = 1; i <= f; i++) {
            stairs[i] = Integer.parseInt(bf.readLine());
        }
        me[0] = stairs[0];
        me[1] = stairs[1];
        if (f > 1) {
            me[2] = stairs[1] + stairs[2];
        }
        System.out.println(logic(f));
    }

    static int logic(int f) {
        if (me[f] == null) {
            me[f] = Math.max(logic(f - 2), logic(f - 3) + stairs[f - 1]) + stairs[f];
        }
        return me[f];
    }
}
