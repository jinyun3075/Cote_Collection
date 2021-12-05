package src.dynamicprogramming;

import java.io.IOException;
import java.util.Scanner;

public class Bac9095 {
    static Integer dp[] = new Integer[11];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        dp[0]=1;
        dp[1]=2;
        dp[2]=4;
        for(int i=0;i< T;i++){
            int n = sc.nextInt();
            System.out.println(logic(n-1));
        }
    }
    static int logic(int n){
        if(dp[n]==null){
            dp[n]=logic(n-1)+logic(n-2)+logic(n-3);
        }
        return dp[n];
    }
}
