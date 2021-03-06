package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Bac15656 {
    static int arr[];
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
        val =new int[M];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        logic(0);
        System.out.println(sb);

    }
    static void logic(int l){
        if(M==l){
            for(int i=0;i<M;i++){
                sb.append(val[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=0;i<N;i++){
                val[l]=arr[i];
                logic(l+1);
            }
        }
}