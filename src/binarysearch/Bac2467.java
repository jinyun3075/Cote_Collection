package binarysearch;
import java.io.*;
import java.util.*;
public class Bac2467 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int left = 0;
        int right = N - 1;
        int min_sum = Integer.MAX_VALUE;
        String result = "";
        while(left < right){
            int sum = arr[left] + arr[right];
            int abs_sum = Math.abs(sum);
            if(abs_sum < min_sum){
                min_sum = abs_sum;
                result = arr[left] + " " + arr[right];
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

