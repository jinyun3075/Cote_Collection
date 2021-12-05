package src.bruteforce;

import java.util.Scanner;

public class Bac10974 {
    static int[] arr;
    static int N;
    static int val[];
    static boolean ch[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        N =sc.nextInt();
        val = new int[N];
        arr =new int[N];
        ch = new boolean[N];

        logic(0);
        System.out.println(sb);
    }
    static void logic(int l){
        if(l==N){
            for(int i=0;i<N;i++){
                sb.append(val[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=0;i<N;i++){
            if(ch[i]==false){
                ch[i]=true;
                val[l]=i+1;
                logic(l+1);
                ch[i]=false;
            }
        }
    }
}
