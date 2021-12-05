package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac2156 {
    static Integer[] val;
    static int [] vol ;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(bf.readLine());
        vol = new int[n+1];
        val = new Integer[n+1];
        for(int i=1;i<=n;i++){
            vol[i]=Integer.parseInt(bf.readLine());
        }

        val[0]=0;
        val[1]=vol[1];
        if(n>1)
        val[2]=vol[1]+vol[2];

        System.out.println(logic(n));

    }
    static int logic(int n){
        if(val[n]==null){
            val[n]= Math.max(Math.max(logic(n-2),logic(n-3)+vol[n-1])+vol[n],logic(n-1));
        }
        return val[n];
    }
}
