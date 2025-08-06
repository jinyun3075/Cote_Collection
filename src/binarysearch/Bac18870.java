package binarysearch;
import java.io.*;
import java.util.*;
public class Bac18870 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        int size = 0;
        for(int i = 0 ; i < N ;i++){
            if(map.containsKey(sorted[i])){
                continue;
            }
            map.put(sorted[i],size++);
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ;i < N ;i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb.toString());
    }

    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            int target = Integer.parseInt(st.nextToken());
            String str = "0";
            if(BinarySearch(arr, target)) str = "1";
            sb.append(str).append(" ");
        }
        System.out.println(sb.toString());
    }
    public static boolean BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            int value = arr[mid];
            if(value == target) return true;
            if(value < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
}

