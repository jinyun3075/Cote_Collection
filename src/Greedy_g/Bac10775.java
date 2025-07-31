package Greedy_g;
import java.io.*;
public class Bac10775 {
    static int val=0;
    static int G,P;
    static int[] pa;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        G = Integer.parseInt(bf.readLine());
        P = Integer.parseInt(bf.readLine());
        pa = new int[G+1];
        for(int i=1;i<=G;i++){
            pa[i]=i;
        }
        for(int i=0;i<P;i++){
            int gate = find(Integer.parseInt(bf.readLine()));
            if(gate==0){ // 게이트가 없을 경우 운행 종료
                break;
            }
            val++;
            union(gate,gate-1);
        }
        bw.write(val+"");
        bw.flush();
    }
    public static int find(int x){
        if(x==pa[x]){
            return x;
        }
        else
            return pa[x]=find(pa[x]);
    }
    public static void  union(int x, int y){
        x=find(x);
        y=find(y);
        if(x!=y){
            pa[x]=y;
        }
    }
}