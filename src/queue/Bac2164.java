package queue;
import java.io.*;
import java.util.*;
public class Bac2164 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1 ; i <= N ;i++){
            que.add(i);
        }
        int stand = 1;
        while(que.size() > 1)
        {
            if(stand++ % 2 == 0){
                que.add(que.poll());
            }else {
                que.poll();
            }
        }
        System.out.println(que.poll());

    }
}