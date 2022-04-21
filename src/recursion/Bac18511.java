package recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bac18511 {
    static Integer[] arr;
    static int result;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int K = sc.nextInt();
        arr = new Integer[K];
        for(int i=0;i<K;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        logic(0);
        System.out.println(result);

    }
    static void logic(int num) {
        if(num > N) {
            return;
        }

        if(result<num) {
            result = num;
        }

        for(int v : arr) {
            logic(num*10+v);
        }

    }
}
