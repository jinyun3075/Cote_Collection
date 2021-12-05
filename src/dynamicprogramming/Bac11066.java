package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac11066 {
    static boolean sw[];
    static Integer[] dp;
    static int K;
    static int page[];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int val[] = new int[T];
        for(int i=0;i<T;i++){
            K=Integer.parseInt(bf.readLine());
            page = new int[K];
            dp = new Integer[K];
            sw = new boolean[K];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0;j<K;j++){
                page[j]=Integer.parseInt(st.nextToken());
            }
            val[0]=logic(0);
            for(int j=1;j<K;j++) {
                val[i] = Math.min(logic(j), val[i]);
            }

        }
        for(int v :val){
            System.out.println(v);
        }
    }
    static int logic(int n){
        if(dp[n]==null){
            dp[n]=page[n];
            for(int i=K-1;i>=0;i--){
                if(n>1){
                    if(sw[i]==false){
                        sw[i]=true;
                        dp[n] = Math.min(logic(i)+page[n]+logic(i),dp[n]);
                        sw[i]=false;
                    }
                }else{
                    dp[n] = Math.min(logic(i)+page[n],dp[n]);
                }
            }
        }
        return dp[n];
    }
}
