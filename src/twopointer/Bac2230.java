package twopointer;
import java.io.*;
import java.util.*;
public class Bac2230 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] arr = new long[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        int l = 0;
        int r = 0;
        long result = Integer.MAX_VALUE;
        while (r < N) {
            long v = arr[r] - arr[l];

            if (v >= M) {
                result = Math.min(result, v);
                l++;
                if (l > r) r = l;
            } else {
                r++;
            }
        }
        System.out.println(result);
    }
}

