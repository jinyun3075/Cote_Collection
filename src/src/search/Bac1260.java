package src.search;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bac1260 {
    static boolean[][] line;
    static boolean[] check;
    static StringBuilder stringBuilder =new StringBuilder();
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();
        check = new boolean[N+1];
        line = new boolean[N+1][N+1];

        for(int i=0;i<M;i++){
            int x =sc.nextInt();
            int y =sc.nextInt();
            line[x][y] = line[y][x] = true;
        }
        DFS(V);
        stringBuilder.append('\n');
        Arrays.fill(check,false);
        BFS(V);
        System.out.println(stringBuilder);
    }
    static void DFS(int v){
        check[v]=true;
        stringBuilder.append(v+" ");

        for(int i=1;i<=N;i++){
            if(line[v][i]==true&&check[i]==false){
                DFS(i);
            }
        }
    }
    static void BFS(int v){
        Queue<Integer> q =new LinkedList<>();
        q.offer(v);
        check[v]=true;
        stringBuilder.append(v+" ");

        while(!q.isEmpty()){
            int in = q.poll();

            for(int i=1;i<=N;i++){
                if(line[in][i]==true&&check[i]==false){
                    stringBuilder.append(i+" ");
                    q.offer(i);
                    check[i]=true;
                }
            }
        }


    }
}
