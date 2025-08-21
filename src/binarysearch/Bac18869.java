package binarysearch;
import java.io.*;
import java.util.*;
public class Bac18869 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Map<String,Integer> resultMap = new HashMap<>();
        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int i = 0 ; i < N ;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int[] clone = arr.clone();
            Arrays.sort(clone);

            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < N ; i++){
                sb.append(Arrays.binarySearch(clone, arr[i])).append(',');
            }

            String str_sb = sb.toString();
            resultMap.put(str_sb, resultMap.getOrDefault(str_sb, 0) + 1);
        }
        long result = 0L;
        for(int cnt : resultMap.values()){
            if(cnt > 1) result += cnt * (cnt-1) / 2;
        }
        System.out.println(result);
    }
}

