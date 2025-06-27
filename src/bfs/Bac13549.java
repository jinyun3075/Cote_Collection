package bfs;
import java.io.*;
import java.util.*;
public class Bac13549 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] cost = new int[100001];
        Deque<Integer> que = new LinkedList<>();
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[n] = 0;
        que.add(n);
        while(!que.isEmpty()){
            int num = que.poll();
            if(num == k){
                break;
            }
            int[] numlist = {num * 2, num + 1, num - 1};
            for(int i = 0 ; i < numlist.length ; i++){
                if(numlist[i] >= 0 && numlist[i] < 100001 && cost[numlist[i]] > cost[num] + (i == 0 ? 0: 1)){
                    cost[numlist[i]] = cost[num] + (i == 0 ? 0: 1);
                    que.add(numlist[i]);
                }
            }
        }
        System.out.println(cost[k]);
    }
}
