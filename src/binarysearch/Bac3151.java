package binarysearch;
import java.io.*;
import java.util.*;
public class Bac3151 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long result = 0;
        
        Arrays.sort(arr);

        for(int i = 0 ; i < N - 2 ; i++){
            int left = i + 1;
            int right = N - 1;
            while(left < right){
                int sum = arr[left] + arr[right] + arr[i];
                
                if(sum == 0){
                    if(arr[left] == arr[right]){
                        long cnt = right - left + 1;
                        result += cnt * (cnt-1) / 2;
                        break;
                    }else{
                        long lcnt = 0;
                        long rcnt = 0;
                        int lv = arr[left];
                        int rv = arr[right];
                        while(left < right && lv == arr[left]){
                            lcnt++;
                            left++;
                        }
                        while(left <= right && rv == arr[right]){
                            rcnt++;
                            right--;
                        }
                        result += lcnt * rcnt;
                    }
                }else if(sum < 0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        System.out.println(result);
    }
}

