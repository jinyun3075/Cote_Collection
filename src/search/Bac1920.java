package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bac1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N =Integer.parseInt(bf.readLine());
        int[] input1 = new int[N];
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            input1[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input1);
        int M = Integer.parseInt(bf.readLine());
        st =new StringTokenizer(bf.readLine());
        for(int i=0;i<M;i++){
            int input2 = Integer.parseInt(st.nextToken());
            int right = N-1;
            int left = 0;
            boolean sw =false;
        while(left<=right){
            int midInd = (left+right)/2;
            int mid = input1[midInd];
            if(mid<input2){
                left = midInd+1;
            }else if(input2<mid){
                right= midInd-1;
            }else{
                sw=true;
                System.out.println(1);
                break;
            }
            }
        if(!sw)
            System.out.println(0);
        }
    }
}
