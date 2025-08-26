package twopointer;
import java.io.*;
import java.util.*;
public class Bac1806 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        long[] sumarr = new long[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 1 ; i <= N ; i++){
            sumarr[i] = sumarr[i - 1] + arr[i];
        }
        int l = 0;
        int r = 0;
        int result = Integer.MAX_VALUE;
        while(l <= N){
            long sum = sumarr[l] - sumarr[r];
            if(sum >= M){
                result = Math.min(result, l - r);
                r++;
                if (r > l) l = r;
            }else {
                l++;
            }
        }
        System.out.println(result == Integer.MAX_VALUE? 0 : result);
    }
    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int l = 0 , r =0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(true){
            if(sum >= M){
                result = Math.min(result, r - l);
                sum -= arr[l++];
            }else if(r == N){
                break;
            }
            else {
                sum += arr[r++];
            }
        }
        System.out.println(result == Integer.MAX_VALUE? 0 : result);
    }
}

