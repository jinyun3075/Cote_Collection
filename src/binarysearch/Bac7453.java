package binarysearch;
import java.io.*;
import java.util.*;
public class Bac7453 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] A = new long[N];
        long[] B = new long[N];
        long[] C = new long[N];
        long[] D = new long[N];
        StringTokenizer st;
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            A[i] = Long.parseLong(st.nextToken());
            B[i] = Long.parseLong(st.nextToken());
            C[i] = Long.parseLong(st.nextToken());
            D[i] = Long.parseLong(st.nextToken());
        }

        int size = N * N;
        long[] sumAB = new long[size];
        long[] sumCD = new long[size];
        int idx = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                sumAB[idx] = A[i] + B[j];
                sumCD[idx] = C[i] + D[j];
                idx++;
            }
        }

        Arrays.sort(sumAB);
        Arrays.sort(sumCD);

        int l = 0;
        int r = size -1;
        long result = 0;
        while(l < size && 0 <= r) {
            long sum = sumAB[l] + sumCD[r];

            if(sum == 0) {
                long lv = sumAB[l];
                long rv = sumCD[r];

                long lcnt = 0;
                while(l < size && lv == sumAB[l]){
                    l++;
                    lcnt++;
                }

                long rcnt = 0;
                while(r >= 0 && rv == sumCD[r]){
                    r--;
                    rcnt++;
                }

                result += lcnt * rcnt;
            }else if(sum < 0){
                l++;
            }else {
                r--;
            }
        }
        System.out.println(result);
    }
}

