package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bac12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int val=val(bf.readLine(),bf.readLine());
        System.out.println(val);

    }
    static int DFS(String a, String b){
        if(a.length()==b.length()){
            if(a.equals(b)){
                return 1;
            }
            return 0;
        }else {
            String CaseA=a+"A";
            String CaseB = new StringBuilder().append(a).reverse()+"B";
            return Math.max(DFS(CaseA,b),DFS(CaseB,b));
        }
    }
    static int BFS(String a,String b){
            Queue<String> q = new LinkedList<>();
            q.offer(a);
            while(!q.isEmpty()){
                String t =q.poll();
                if(t.length()==b.length()){
                    if(t.equals(b)){
                        return 1;
                    }
                    return 0;
                }
                String CaseA=t+"A";
                String CaseB = new StringBuilder().append(t).reverse()+"B";
                q.offer(CaseA);
                q.offer(CaseB);
            }
        return 0;
    }
    static int val(String a, String b){
        StringBuilder com1 =new StringBuilder().append(a);
        StringBuilder com2 =new StringBuilder().append(b);

        while(com1.length()<com2.length()){
            if(com2.charAt(com2.length()-1)=='A'){
                com2.deleteCharAt(com2.length()-1);
            }else{
                com2.deleteCharAt(com2.length()-1);
                com2.reverse();
            }
        }
        if(com2.toString().equals(a)){
            return 1;
        }
        return 0;
    }
}
