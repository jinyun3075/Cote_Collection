package bfs;
import java.io.*;
import java.util.*;
public class Bac5014 {
    public static class Node{
        int num;
        int cnt;
        Node(int num, int cnt){
            this.num = num;
            this.cnt = cnt;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[5];
        for(int i = 0 ; i < 5 ;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        int[] visited = new int[input[0] + 1];
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(input[1],0));
        int result = -1;
        while(!que.isEmpty()){
            Node stare = que.poll();
            if(stare.num == input[2]){
                result = stare.cnt;
                break;
            }
            int up = stare.num + input[3];
            int down = stare.num - input[4];

            if(up <= input[0] && visited[up] == 0){
                visited[up] = 1;
                que.add(new Node(up, stare.cnt + 1));
            }
            if(down > 0 && visited[down] == 0){
                visited[down] = 1;
                que.add(new Node(down, stare.cnt + 1));
            }
        }
        System.out.println(result == -1 ? "use the stairs" : result);
    }
}
