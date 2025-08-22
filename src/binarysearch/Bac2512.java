package binarysearch;
import java.io.*;
import java.util.*;
public class Bac2512 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max_val = 0;
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max_val = Math.max(max_val, arr[i]);
        }

        int M = Integer.parseInt(br.readLine());

        int l = 0;
        int r = max_val;
        int result = 0;
        while(l <= r){
            int mid = (l + r) / 2;
            int sum = 0;
            for(int i = 0 ; i < N ; i++){
                sum += Math.min(mid, arr[i]);
            }
            
            if(sum <= M){
                l = mid + 1;
                result = Math.max(mid, result);
            }else {
                r = mid - 1;
            }
        }
        System.out.println(result);
    }
}

