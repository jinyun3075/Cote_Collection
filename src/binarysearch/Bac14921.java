package binarysearch;
import java.io.*;
import java.util.*;
public class Bac14921 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        long[] arr = new long[N];
        
        for(int i = 0 ; i < N ; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        int left = 0;
        int right = N-1;
        long result = Long.MAX_VALUE;
        while(left < right){
            long sum = arr[left] + arr[right];
            long abssum = Math.abs(sum);
            if(abssum < Math.abs(result)){
                result = sum;    
            }

            if(sum < 0){
                left++;
            }else {
                right--;
            }
        }
        System.out.println(result);
    }
}

