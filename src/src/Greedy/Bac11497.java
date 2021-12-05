package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
public class Bac11497 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(bf.readLine());
            int arr[] = new int[N];
            PriorityQueue<Integer> p = new PriorityQueue<>();
            String[] input = bf.readLine().split(" ");
            for(int j=0;j<N;j++){
                p.offer(Integer.parseInt(input[j]));
            }
            int left=0;
            int right=N-1;
            for(int j=0;j<N;j++){
                if(j%2==0){
                    arr[left++]=p.poll();
                }else{
                    arr[right--]= p.poll();
                }
            }

            int val=Math.abs(arr[0]-arr[N-1]);
            for(int j=0;j<N-1;j++){
                val=Math.max(Math.abs(arr[j]-arr[j+1]),val);
            }
            System.out.println(val);
        }
    }
}
