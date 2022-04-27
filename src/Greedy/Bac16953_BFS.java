package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bac16953_BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        logic(A,B);
    }
    static void logic(long A,long B){
        Queue<v> q = new LinkedList<>();
        q.add(new v(A,1));
        while(!q.isEmpty()){
            v temp = q.poll();
            if(temp.val==B){
                System.out.println(temp.count);
                return ;
            }
            if(temp.val*2<=B) q.add(new v(temp.val*2,temp.count+1));
            if((temp.val*10)+1<=B) q.add(new v((temp.val*10)+1,temp.count+1));
        }
        System.out.println(-1);
    }
}
class v{
    long val;
    int count;
    v(long v,int c){
        val=v;
        count=c;
    }
}
