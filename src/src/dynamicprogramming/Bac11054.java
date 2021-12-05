package src.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac11054 {
    static Integer[][] val;
    static int[] m;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        m=new int[n];
        val=new Integer[n][2];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            m[i]=Integer.parseInt(st.nextToken());
        }
        int v=logic(0);

        for(int i=1;i<n;i++){
            v=Math.max(logic(i),v);
        }
        System.out.println(v);
    }
    static int logic (int n){
        if (val[n][0] == null) {
            val[n][0]=1;
            for (int i = n - 1; 0 <= i; i--) {
                if (m[n] < m[i]) {
                    val[n][0] =Math.max(logic(i)+1,val[n][0]);
                }else if(m[n]>m[i]){
                     val[n][0]=Math.max(val[n][0],low(i)+1);
                }
            }
        }
            return val[n][0];
    }
    static int low(int n){
        if(val[n][1]==null){
            val[n][1]=1;
            for (int i = n - 1; 0 <= i; i--) {
                if (m[n] > m[i]) {
                    val[n][1] = Math.max(val[n][1], low(i) + 1);
                }
            }
        }
        return val[n][1];
    }
}

