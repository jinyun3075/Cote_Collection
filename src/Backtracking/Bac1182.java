package Backtracking;

import java.util.Scanner;

public class Bac1182 {
    static int[] arr;
    static int S;
    static int result=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        S = sc.nextInt();
        arr = new int[N];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length;i>0;i--) {
            logic(i,0,0);
        }
        System.out.println(result);
    }
    public static void logic(int depth, int sum, int idx) {
        if(depth==0) {
            if(S==sum) {
                result++;
            }
            return;
        }

        for(int i=idx;i<arr.length;i++) {
            logic(depth-1,sum+arr[i],i+1);
        }
    }
}
