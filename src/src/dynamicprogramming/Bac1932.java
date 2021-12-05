package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac1932 {
    static int [][] t;
    static Integer [][] val;
    static int n  ;
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        n =  Integer.parseInt(bf.readLine());
        t = new int[n][n];
        val = new Integer[n][n];
        for(int i=n-1;0<=i;i--){
            StringTokenizer st= new StringTokenizer(bf.readLine());
            for(int j=0;j<n-i;j++){
                t[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            val[0][i]=t[0][i];
        }
        System.out.println(logic(n-1,0));

    }
    static int logic(int n,int d){

        if(val[n][d]==null){
            val[n][d]=Math.max(logic(n-1,d),logic(n-1,d+1))+t[n][d];
        }
        return val[n][d];

    }
}
