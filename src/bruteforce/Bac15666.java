package bruteforce;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bac15666 {
    static int N;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(M,"",0);
        System.out.print(sb);

    }
    static Set<String> checkContain = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static void dfs(int count, String result, int idx){
        if(count == 0) {
            if(!checkContain.contains(result)) {
                checkContain.add(result);
                sb.append(result).append("\n");
            }
            return;
        }
        for(int i =idx ;i<N;i++) {
            dfs(count-1,result+arr[i]+" ",i);
        }
    }
}
