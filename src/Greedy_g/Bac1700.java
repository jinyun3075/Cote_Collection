package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bac1700 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int val=0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int input[] =new int[K];
        st =new StringTokenizer(bf.readLine());
        for(int i=0;i<input.length;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        boolean kinds[] = new boolean[101];
        int hole=0;
        for(int i=0;i<input.length;i++){
            if(!kinds[input[i]]){
                if(hole<N){
                    kinds[input[i]]=true;
                    hole++;
                }else{
                    Deque<Integer> repeat = new LinkedList<>();
                    for(int j =i+1;j<K;j++){
                        if(kinds[input[j]]&&!repeat.contains(input[j])){
                            repeat.offer(input[j]);
                        }
                    }

                    if(repeat.size()!=N){
                        for(int j=0;j<K;j++){
                            if(kinds[input[j]]&&!repeat.contains(input[j])){
                                kinds[input[j]]=false;
                                break;
                            }
                        }
                    }else{
                        kinds[repeat.pollLast()]=false;
                    }
                    kinds[input[i]]=true;
                    val++;
                }
            }
        }
        System.out.println(val);

    }
}
