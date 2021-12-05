package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac1912 {
    static int input[];
    static Integer val[];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        input= new int[n];
        val = new Integer[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        val[0]=input[0];
        int v = logic(0);
        for(int i=1;i<n;i++){
            v = Math.max(logic(i),v);
        }
        System.out.println(v);


    }
    static int logic(int n){
        if(n<0){
            return 0;
        }
        if(val[n]==null){
            if(input[n]>0){
                val[n]=Math.max(logic(n-1),0)+input[n];
            }else{
                val[n]=Math.max(logic(n-1)+input[n],input[n]);
            }
        }
        return val[n];
    }
}
