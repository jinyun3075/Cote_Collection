package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bac2667 {
    static int N;
    static int M;
    static boolean map[][];
    static ArrayList<Integer> val = new ArrayList<>();
    static int count =0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = M = Integer.parseInt(bf.readLine());
        map = new boolean[N][M];
        for(int i=0;i<N;i++){
            String[] input = bf.readLine().split("");
            for(int j=0;j<M;j++){
                map[i][j]=input[j].equals("1")?true:false;
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]){
                    logic(i,j);
                    val.add(count);
                    count=0;
                }
            }
        }

        System.out.println(val.size());
        Collections.sort(val);
        for(int i=0;i<val.size();i++){
            System.out.println(val.get(i));
        }


    }
    static void logic(int n,int m){
        map[n][m]=false;
        count++;
        if(n<N-1&&map[n+1][m]){
            logic(n+1,m);
        }
        if(m<M-1&&map[n][m+1]){
            logic(n,m+1);
        }
        if(n>0&&map[n-1][m]){
            logic(n-1,m);
        }
        if(m>0&&map[n][m-1]){
            logic(n,m-1);
        }
    }
}
