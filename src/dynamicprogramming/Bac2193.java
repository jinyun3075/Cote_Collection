package dynamicprogramming;

import java.util.Scanner;

public class Bac2193 {
    static Integer dp[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp= new Integer[n+1];
        dp[0]=0;
        dp[1]=1;
        System.out.println(logic(n));

    }
    static int logic(int n){
        if(dp[n]==null){
            dp[n]=logic(n-1)+logic(n-2);
        }
        return dp[n];
    }

}
