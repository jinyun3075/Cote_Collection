package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac1003 {
    static Integer[][] p =new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        p[0][0]=1;
        p[0][1]=0;
        p[1][0]=0;
        p[1][1]=1;
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(bf.readLine());
            Integer[] fibo =fibonacci(input);
            Integer z =fibo[0];
            Integer o =fibo[1];
            System.out.println(z+" "+o);
        }

    }
    static Integer[] fibonacci(int n) {
        if(p[n][0]==null||p[n][1]==null) {
            p[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            p[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return p[n];
    }
}
