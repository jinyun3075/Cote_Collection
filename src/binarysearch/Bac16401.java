package binarysearch;
import java.io.*;
import java.util.*;
public class Bac16401 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] list = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        long result = 0;
        long left = 1L;
        long right = list[N - 1];
        while(left <= right){
            long mid = (left + right) / 2;
            long cnt = 0;
            for(int i = N - 1 ; i >= 0 ; i--){
                cnt += list[i] / mid;
            }
            if(cnt >= M){
                result = Math.max(result, mid);
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }
        System.out.println(result);
    }
}

