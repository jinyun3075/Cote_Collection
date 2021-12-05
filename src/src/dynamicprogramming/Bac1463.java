package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac1463 {
    static Integer[] val;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        val=new Integer[N+1];
        val[1]=0;
        System.out.println(logic(N));
    }
    static int logic(int N){

        if(val[N]==null){
            if(N%6==0){
                val[N] = Math.min(logic(N/3),Math.min(logic(N-1),logic(N/2)))+1;
            }
            else if(N%3==0){
                val[N] = Math.min(logic(N/3),logic(N-1))+1;
            }else if(N%2==0){
                val[N] = Math.min(logic(N/2),logic(N-1))+1;
            }else{
                val[N] = logic(N-1)+1;
            }
        }
        return val[N];
    }
}
