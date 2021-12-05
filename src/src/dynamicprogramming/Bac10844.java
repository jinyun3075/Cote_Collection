package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac10844 {
    static Long [][] dp ;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(bf.readLine());
        long val=0;
        dp = new Long[N+1][10];
        for(int i=0;i<=9;i++){
            dp[1][i] = 1L;
        }
        for(int i=1;i<=9;i++){
            val+=logic(N,i);
        }
        System.out.println(val%1000000000);
    }
    static Long logic(int N,int v){
        if(dp[N][v]==null){
            if(v==9){
                dp[N][v]=logic(N-1,v-1);
            }else if(v==0){
                dp[N][v]=logic(N-1,v+1);
            }else{
                dp[N][v]=logic(N-1,v+1)+logic(N-1,v-1);
            }
        }
        return dp[N][v]%1000000000;
    }
}
