package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac11053 {
    static Integer[] val;
    static int le[];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        val = new Integer[N];
        le = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            le[i]=Integer.parseInt(st.nextToken());
        }
        int v=logic(0);
        for(int i=1;i<N;i++){
            v=Math.max(logic(i),v);
        }

        System.out.println(v);

    }
    static int logic(int N){
        if(val[N]==null){
            val[N]=1;
            for(int i=N-1;i>=0;i--){
                if(le[N]>le[i]){
                    val[N]=Math.max(val[N],logic(i)+1);
                }
            }
        }
        return val[N];
    }
}
