package src.Greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bac2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        Deque<Integer> sc = new ArrayDeque<>();

        String input2 = bf.readLine();
        String[] ar = input2.split("");
        for(int i=0;i<N;i++){
            q.offer(Integer.parseInt(ar[i]));
        }


        while(!q.isEmpty()){
            int temp =q.poll();
            while(K>0 && !sc.isEmpty() &&temp>sc.getLast()){
                sc.removeLast();
                K--;
            }
            sc.addLast(temp);

        }
        while(sc.size()>K){
            System.out.print(sc.removeFirst());
        }

    }
}
