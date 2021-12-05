package src.bruteforce;

import java.util.Scanner;

public class Bac1748 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int length =10;
        int cnt = 1;
        int val=0;
        for(int i=1;i<=N;i++){
            if(i==length){
                cnt++;
                length*=10;
            }
            val+=cnt;
        }
        System.out.println(val);
    }
}
