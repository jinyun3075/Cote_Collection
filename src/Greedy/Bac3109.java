package Greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Bac3109 {
     BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;
     char[][] m;
     static int val=0;
     int[] patt = {-1,0,1};
     void map() throws IOException{
        st = new StringTokenizer(bf.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        m=new char[R][C];
        for(int i=0;i<R;i++){
            char[] input = bf.readLine().toCharArray();
            for(int j=0;j<C;j++){
                m[i][j]=input[j];
            }
        }
    }

    boolean find(int y, int x){
         m[y][x]='X';
         if(m[0].length-1==x){
             val++;
             return true;
         }else{
             for(int i=0;i<patt.length;i++){
                 if(y+patt[i]>=0&&y+patt[i]<m.length&&m[y+patt[i]][x+1]=='.'){
                     if(find(y+patt[i],x+1)){
                         return true;
                     }
                 }
             }
         }
         return false;
    }


    public static void main(String[] args) throws IOException {
        Bac3109 Main = new Bac3109();
        Main.map();
        for(int i=0;i<Main.m.length;i++){
            Main.find(i,0);
        }
        System.out.println(val);
    }
}

