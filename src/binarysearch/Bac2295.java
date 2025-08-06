package binarysearch;
import java.io.*;
import java.util.*;
public class Bac2295 {
    public void solution() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        for(int i = 0 ; i < N ; i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);
        
        Set<Integer> sumList = new HashSet<>();
        for(int i = 0 ; i < N ;i++){
            for(int j = i ; j < N ;j++){
                sumList.add(list[i]+list[j]);
            }
        }

        for(int i = N - 1 ; N >= 0 ; i--){
            for(int j = 0 ; j <= i ;j++){
                int target = list[i] - list[j];
                if(sumList.contains(target)){
                    System.out.println(list[i]);
                    return;
                }
            }
        }
    }
}

