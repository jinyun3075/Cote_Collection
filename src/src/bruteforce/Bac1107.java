package src.bruteforce;

import java.util.Scanner;

public class Bac1107 {
    static boolean[] brok;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        brok = new boolean[10];

        for(int i=0;i<M;i++){
            brok[sc.nextInt()]=true;
        }

        int val = Math.abs(N-100);
        for(int i=0;i<1000000;i++){
            int len =check(i);

            if(len>0)val=Math.min(Math.abs(N-i)+len,val);
        }
        System.out.println(val);
    }
    static int check(int n){
        if(n==0){
            if(brok[n]){
                return 0;
            }
            return 1;
        }
        int length = 0;
        while(n>0){
            if(brok[n%10]){
                return 0;
            }
            length++;
            n/=10;
        }
        return length;
    }
}
