package array;
import java.io.*;
import java.util.*;

public class Bac10807 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            if(arr[i] == v) {
                result++;
            }
        }
        System.out.println(result);
    }
}
