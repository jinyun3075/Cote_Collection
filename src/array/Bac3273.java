package array;
import java.io.*;
import java.util.*;

public class Bac3273 {
    public void solution() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n; i++) {
            if(map.containsKey(arr[i]) && map.get(arr[i]) > 0){
                result++;
                map.put(arr[i], map.get(arr[i]) - 1);
            }
            map.put(x - arr[i], map.getOrDefault(x - arr[i], 0) + 1);
        }
        System.out.println(result);
    }
}
