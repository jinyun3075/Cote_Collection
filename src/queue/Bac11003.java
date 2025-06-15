package queue;
import java.io.*;
import java.util.*;

public class Bac11003 {
    public static class Node{
        int value;
        int idx;
        Node(int value, int idx){
            this.value = value;
            this.idx = idx;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder();

        Deque<Node> list = new LinkedList<>();
        st= new StringTokenizer(br.readLine());

        for(int i = 0 ; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            
            while(!list.isEmpty() && list.peekLast().value > num){
                list.pollLast();
            }
            
            list.add(new Node(num, i));

            while(list.peekFirst().idx <= i - L){
                list.pollFirst();
            }
           
            result.append(list.peekFirst().value).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}