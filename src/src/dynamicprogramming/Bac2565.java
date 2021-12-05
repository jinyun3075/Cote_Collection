package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Bac2565 {
    static int[][] line;
    static Integer[] val;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input1 = Integer.parseInt(bf.readLine());
        line = new int[input1][2];
        val = new Integer[input1];
        StringTokenizer st;
        for (int i = 0; i < input1; i++) {
            st = new StringTokenizer(bf.readLine());
            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(line, (int[] x,int[] y)->x[0]-y[0]);

        int v = logic(0);
        for(int i=1;i<input1;i++){
            v = Math.max(v,logic(i));
        }
        System.out.println(input1-v);

    }

    static int logic(int input) {
        if(val[input]==null){
            val[input]=1;
            for(int i=input-1;i>=0;i--){
                if(line[input][1]>line[i][1]){
                    val[input] = Math.max(logic(i)+1,val[input]);
                }
            }
        }
        return val[input];
    }
}
