package src.Backtracking;
import java.io.*;
import java.util.StringTokenizer;
public class Bac15649 {
    static boolean[] v;
    static int val[];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        v = new boolean[n];
        val = new int[m];

        logic(n,m,0);

    }
    static void logic(int n,int m,int d){

        if(m==d){
            for(int v : val){
                System.out.print(v+" ");
            }
            System.out.println();
            return;
        }
        for(int i=0;i<n;i++){
            if(v[i]==false){
                v[i]=true;
                val[d]=i+1;
                logic(n,m,d+1);
                v[i]=false;
            }
        }
    }
}
