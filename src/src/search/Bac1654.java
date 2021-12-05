package src.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bac1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Long input1[] = new Long[K];
        for(int i=0;i<K;i++){
            input1[i]=Long.parseLong(bf.readLine());
        }
        Arrays.sort(input1);

        Long left=1l;
        Long right=input1[K-1];

        while(left<=right){
            long mid = (left+right)/2;
            int cab=0;
            for(int i=0;i<K;i++){
                cab+=input1[i]/mid;
            }
            if(N<=cab){
                left = mid+1;
            }else{
                right= mid-1;
            }
        }
        System.out.println(right);
    }
}
