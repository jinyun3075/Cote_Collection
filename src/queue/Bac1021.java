package queue;
import java.io.*;
import java.util.*;
public class Bac1021 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> de = new LinkedList<>();
        int result = 0;
        for(int i = 1 ; i <= N ; i++){
            de.offer(i);
        }
        
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < M ; i++){
            int find = Integer.parseInt(st.nextToken());
            
            int left_rota = de.indexOf(find);
            int right_rota = de.size() - left_rota;

            if(left_rota <= right_rota){
                for(int j = 0 ; j < left_rota ; j++ ){
                    de.addLast(de.pollFirst());
                    result++;
                }
            }else {
                for(int j = 0 ; j < right_rota  ; j++){
                    de.addFirst(de.pollLast());
                    result++;
                }
            }
            de.pollFirst();
        }
        System.out.println(result);

    }
}