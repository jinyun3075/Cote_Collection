package binarysearch;
import java.io.*;
import java.util.*;
public class Bac1822 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        st = new StringTokenizer(br.readLine());
        Set<Integer> map = new HashSet<>();
        for(int i = 0 ; i < M ;i++){
            map.add(Integer.parseInt(st.nextToken()));
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i = 0 ; i < N ;i++){
            if(!map.contains(A[i])){
                cnt++;
                sb.append(A[i]).append(" ");
            }
        }
        System.out.println(cnt);
        if(cnt > 0) System.out.println(sb.toString().trim());
    }
}

