package src.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bac10816 {
    static int N ;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(bf.readLine());
        int input1[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < input1.length; i++) {
            input1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input1);

        int M = Integer.parseInt(bf.readLine());
        int val[] = new int[M];
        st= new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            int input2 = Integer.parseInt(st.nextToken());
            sb.append(upperBound(input1,input2)-lowerBound(input1,input2)).append(' ');
        }
        System.out.println(sb);
    }
    static int lowerBound(int input1[], int input2){
        int left = 0;
        int right = N;

        while(left<right){
            int mid = (left+right)/2;
            if(input1[mid]>=input2){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    static int upperBound(int input1[], int input2){
        int left = 0;
        int right = N;

        while(left<right){
            int mid = (left+right)/2;
            if(input1[mid]>input2){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}
