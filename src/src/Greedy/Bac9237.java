package src.Greedy;

import java.io.*;
import java.util.*;
public class Bac9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(bf.readLine());
        int val=0;
        st = new StringTokenizer(bf.readLine());
        Integer[] input = new Integer[N];
        for(int i=0;i<N;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input, Collections.reverseOrder());
        for(int i=1;i<=N;i++){
            val=Math.max(val,input[i-1]+i);
        }
        System.out.println(val+1);
    }
}