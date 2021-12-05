package src.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac9663 {
    static int N;
    static int count=0;
    static int[] column;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        column = new int[N];
        logic(0);
        System.out.println(count);
    }
    static void logic(int low){
        if(N==low){
            count++;
            return;
        }

        for(int i=0;i<N;i++){
            column[low]=i;
            if(Possibility(low)){
                logic(low+1);
            }
        }
    }
    static boolean Possibility(int low){
        for(int i=0;i<low;i++){
            if(column[low]==column[i]){
                return false;
            }
            if(Math.abs(low-i)==Math.abs(column[low]-column[i])){
                return false;
            }
        }
        return true;
    }
}
