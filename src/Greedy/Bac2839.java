package Greedy;

import java.util.Scanner;

public class Bac2839 {
        int val = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Bac2839 ex =new Bac2839();
        ex.ex(N,5);
        ex.ex(N,3);
        if(N==3){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
        sc.close();
    }
    void ex(int N,int q){
        val++;
        N-=q;
        if(N==0){
            System.out.println(val);
            System.exit(0);
        }
        if(N<0){
            val--;
            return;
        }
        ex(N,5);
        ex(N,3);
        val--;
    }
}
