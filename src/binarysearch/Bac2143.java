package binarysearch;
import java.io.*;
import java.util.*;
public class Bac2143 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int A = Integer.parseInt(br.readLine());
        long[] a_list = new long[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < A ; i++){
            a_list[i] = Long.parseLong(st.nextToken());
        }

        List<Long> a_sum = new ArrayList<>();
        for(int i = 0 ; i < A ; i++){
            long sum = 0;
            for(int j = i ; j < A ;j++){
                sum += a_list[j];
                a_sum.add(sum);
            }
        }

        int B = Integer.parseInt(br.readLine());
        long[] b_list = new long[B];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < B ; i++){
            b_list[i] = Long.parseLong(st.nextToken());
        }

        List<Long> b_sum = new ArrayList<>();
        for(int i = 0 ; i < B ; i++){
            long sum = 0;
            for(int j = i ; j < B ;j++){
                sum += b_list[j];
                b_sum.add(sum);
            }
        }

        Collections.sort(b_sum);
        long result = 0;
        for(Long x : a_sum){
            long target = T - x;
            result += upperb(b_sum, target) - lowerb(b_sum, target); 
        }
        
        System.out.println(result);
    }
    static int lowerb(List<Long> list, long target){
        int left = 0, right = list.size();
        while(left < right){
            int mid = (left + right) / 2;
            if(list.get(mid) >= target){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    static int upperb(List<Long> list, long target){
        int left = 0, right = list.size();
        while(left < right){
            int mid = (left + right) / 2;
            if(list.get(mid) > target){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}

