package src.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bac2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int lo[] = new int[N];
        for(int i=0;i<N;i++){
            lo[i]=Integer.parseInt(bf.readLine());
        }
        Arrays.sort(lo);

        int left = 1;
        int right=lo[N-1]-lo[0];
        while(left<=right){
            int mid = (left+right)/2;
            int com = lo[0];
            int count=1;
            for(int i=1;i<N;i++){
                if(lo[i]-com>=mid){
                    count++;
                    com=lo[i];
                }
            }
            if(count>=C){
                left=mid+1;
            }else if(count<C){
                right=mid-1;
            }
        }
        System.out.println(right);
    }
}
