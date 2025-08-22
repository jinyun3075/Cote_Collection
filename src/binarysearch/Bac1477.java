package binarysearch;
import java.io.*;
import java.util.*;
public class Bac1477 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int result = 0;
        int[] place = new int[N + 2];
        place[0] = 0;
        place[N + 1] = L;
        if(N > 0){
            st = new StringTokenizer(br.readLine());
            for(int i = 1 ; i <= N ; i++){
                place[i] = Integer.parseInt(st.nextToken());
            }
        }        
        Arrays.sort(place);
        int l = 1;
        int r = L;
        while(l <= r){
            int mid = (l + r) / 2;
            int count = 0;
            for(int i = 1 ; i < place.length ; i++){                    
                int length = place[i] - place[i - 1];
                count += (length - 1) / mid ;
            }
            
            if(count > M){
                l = mid + 1;
            }else {
                r = mid - 1;
                result = mid;
            }
        }
        
        System.out.println(result);
    }
}

