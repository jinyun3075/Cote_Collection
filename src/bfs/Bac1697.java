package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac1697 {
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
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] visited = new int[100001];
        int result = 0;
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(n,0));
        while(!que.isEmpty()){
            Node node = que.poll();
            if(node.num == k){
                result = node.cnt;
                break;
            }
            int[] numlist = {node.num + 1, node.num - 1, node.num * 2};
            for(int num : numlist){
                if(num >= 0 && num < 100001 && visited[num] == 0){
                    visited[num] = 1;
                    que.add(new Node(num, node.cnt + 1));
                }
            }            
        }
        System.out.println(result);
    }
}
