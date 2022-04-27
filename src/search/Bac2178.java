package search;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bac2178 {
    static boolean ch[][];
    static int map[][];
    static int N;
    static int M;
    static int remember[][];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ch = new boolean[N][M];
        map = new int[N][M];
        remember = new int[N][M];
        for(int i=0;i<N;i++){
            String[] input2 = bf.readLine().split("");
            for(int j=0;j<M;j++){
                int a =Integer.parseInt(input2[j]);
                map[i][j]=a;
            }
        }
        logic(0,0);
        System.out.println(remember[N-1][M-1]);
    }

    static void logic(int n, int m){
        ch[n][m] = true;
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(n,m));
        while(!q.isEmpty()){
            Point ne = q.poll();
            remember[ne.x][ne.y]++;
            if(ne.x==N-1&&ne.y==M){
                break;
            }
            if(ne.x<N-1&&ch[ne.x+1][ne.y]==false&map[ne.x+1][ne.y]==1){
                q.offer(new Point(ne.x+1,ne.y));
                remember[ne.x+1][ne.y]=remember[ne.x][ne.y];
                ch[ne.x+1][ne.y]= true;
            }
            if(ne.y<M-1&&ch[ne.x][ne.y+1]==false&map[ne.x][ne.y+1]==1) {
                q.offer(new Point(ne.x,ne.y+1));
                remember[ne.x][ne.y+1]=remember[ne.x][ne.y];
                ch[ne.x][ne.y+1]=true;
            }
            if(ne.x>0&&ch[ne.x-1][ne.y]==false&map[ne.x-1][ne.y]==1) {
                q.offer(new Point(ne.x-1,ne.y));
                remember[ne.x-1][ne.y]=remember[ne.x][ne.y];
                ch[ne.x-1][ne.y]=true;
            }
            if(ne.y>0&&ch[ne.x][ne.y-1]==false&map[ne.x][ne.y-1]==1) {
                q.offer(new Point(ne.x,ne.y-1));
                remember[ne.x][ne.y-1]=remember[ne.x][ne.y];
                ch[ne.x][ne.y-1] =true;
            }
        }

    }
}
