package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bac11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine()); // 테스트 케이스
        Deque<Long> stock = new LinkedList<>();

        for (int i = 0; i < T; i++) {
            long val=0;
            int N= Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine());
            for(int j=0;j<N;j++) {
                stock.offer(Long.parseLong(st.nextToken()));
            }
            long max=0;
            while(!stock.isEmpty()){
                if(max<stock.peekLast()){
                    max=stock.pollLast();
                }else{
                    val+=max-stock.pollLast();
                }
            }
            System.out.println(val);
        }
    }
}