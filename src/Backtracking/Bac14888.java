package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac14888 {
    static Long[] input;
    static Long[] op = new Long[4];
    static long max= Integer.MIN_VALUE;
    static long min= Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        input = new Long[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            input[i]=Long.parseLong(st.nextToken());
        }
        st= new StringTokenizer(bf.readLine());
        for(int i=0;i<4;i++){
            op[i] = Long.parseLong(st.nextToken());
        }
        logic(1,input[0]);
        System.out.println(max);
        System.out.println(min);
    }
    static void logic(int n,long val){
        if(n==input.length){
            max=Math.max(max,val);
            min=Math.min(min,val);
            return;
        }

        for(int i=0;i<4;i++){
            if(op[i]!=0){
                op[i]-=1;
                switch(i){
                    case 0: logic(n+1,val+input[n]);
                    break;
                    case 1: logic(n+1,val-input[n]);
                    break;
                    case 2: logic(n+1,val*input[n]);
                    break;
                    default : logic(n+1,val/input[n]);
                }
                op[i]+=1;
            }
        }
    }
}
