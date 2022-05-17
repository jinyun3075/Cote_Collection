package bruteforce;

import java.util.Arrays;
import java.util.Scanner;
public class Bac15665 {
    static int[] arr;
    static int[] result;
    static int N;
    static int M;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        visit = new boolean[N];
        result = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);

    }
    public static void dfs(int depth) {
        if(depth==M) {
            for(int i=0;i<M;i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int prev = -1;
        for(int i=0;i<N;i++) {
            if(prev!=arr[i]) {
                prev = arr[i];
                result[depth] = prev;
                dfs(depth+1);
            }
        }
    }
}
