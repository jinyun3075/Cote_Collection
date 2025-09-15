package twopointer;
import java.io.*;
import java.util.*;
public class Bac2003 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sumarr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            sumarr[i+1] = Integer.parseInt(st.nextToken()) + sumarr[i];
        }

        int l = 0 , r =0;
        int count = 0;
        while(l <= r){
            int sum = sumarr[r] - sumarr[l];

            if(sum == M){
                l++;
                count++;
            }else if(sum < M){
                r++;
                if(r > N) break;
            }else{
                l++;
            }

        }
        System.out.println(count);
    }
}

