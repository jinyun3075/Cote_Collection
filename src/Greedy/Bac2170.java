package greedy;
import java.io.*;
import java.util.*;
public class Bac2170 {
    static class Node{
        int st;
        int end;
        Node(int st, int end){
            this.st = st;
            this.end = end;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token;
        Node[] list = new Node[N];
        for(int i = 0 ; i < N ;i++){
            token = new StringTokenizer(br.readLine());
            int st = Integer.parseInt(token.nextToken());
            int end = Integer.parseInt(token.nextToken());
            list[i] = new Node(st, end);
        }

        Arrays.sort(list,(a, b)-> {
            if(a.st == b.st){
                return a.end - b.end;
            }
            return a.st - b.st;
        });
        
        int total = 0;
        int currentStart = list[0].st;
        int currentEnd = list[0].end;

        for (int i = 1; i < N; i++) {
            if (list[i].st <= currentEnd) {
                currentEnd = Math.max(currentEnd, list[i].end);
            } else {
                total += currentEnd - currentStart;
                currentStart = list[i].st;
                currentEnd = list[i].end;
            }
        }
        total += currentEnd - currentStart;
        System.out.println(total);
    }
}

