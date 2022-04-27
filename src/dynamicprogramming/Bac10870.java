package dynamicprogramming;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bac10870 {
    static Integer dp[] ;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue= new LinkedList<>();
        int n = sc.nextInt();
        dp = new Integer[n+1];
        int val=0;
        if(n==0){ }
        else if(n==1) {
            val=1;
        }else{
            dp[0]=0;
            dp[1]=1;
            val=logic(n);
        }
        System.out.println(val);
    }
    static int logic(int n){
        if(dp[n]==null){
            dp[n]=logic(n-1)+logic(n-2);
        }
        return dp[n];
    }
}
