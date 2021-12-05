package src.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Bac15655 {
    static int arr[];
    static boolean ch[];
    static int val[];
    static int N;
    static int M;
    static StringBuilder sb;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        N = sc.nextInt();
        M = sc.nextInt();
        arr=new int[N];
        ch =new boolean[N];
        val =new int[M];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        logic(0,0);
        System.out.println(sb);

    }
    static void logic(int l,int s){
        if(M==l){
            for(int i=0;i<M;i++){
                sb.append(val[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=s;i<N;i++){
            if(ch[i]==false){
                ch[i]=true;
                val[l]=arr[i];
                logic(l+1,i+1);
                ch[i]=false;
            }
        }
    }
}
