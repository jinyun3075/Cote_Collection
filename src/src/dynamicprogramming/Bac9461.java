package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bac9461 {
    static Long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        Queue<Long> val = new LinkedList<>();
        dp = new Long[101];
        dp[0]=0l;
        dp[1]=1l;
        dp[2]=1l;
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(bf.readLine());
            val.offer(logic(n));
        }
        for(long v : val){
            System.out.println(v);
        }
    }
    static long logic(int n){
        if(dp[n]==null){
            dp[n] = logic(n-2)+logic(n-3);
        }
        return dp[n];
    }
}
