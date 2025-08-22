package binarysearch;
import java.io.*;
import java.util.*;
public class Bac2473 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < N ; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        long min_sum = Long.MAX_VALUE;
        String result = "";
        for(int i = 0 ; i < N - 2 ;i++){
            int l = i + 1;
            int r = N - 1;
            while(l < r){
                long sum = arr[i] + arr[l] + arr[r];
                long abs_sum = Math.abs(sum);
                if(min_sum > abs_sum){
                    min_sum = abs_sum;
                    result = arr[i] + " " + arr[l] + " "+ arr[r];
                }

                if(sum == 0) {
                    break;
                }
                else if(sum < 0){
                    l++;
                }else {
                    r--;
                }
            }
        }
        System.out.println(result);
    }
}

