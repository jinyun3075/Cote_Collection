package programmers;

import java.util.*;

public class pro42628 {
    class Solution {
        public int[] solution(String[] operations) {
            int[] answer = new int[2];
            PriorityQueue<Integer> pr1 = new PriorityQueue<>();
            PriorityQueue<Integer> pr2 = new PriorityQueue<>((a,b) -> b-a);
            for(int i = 0; i<operations.length;i++) {
                String[] input = operations[i].split(" ");
                if(input[0].equals("I")){
                    pr1.offer(Integer.parseInt(input[1]));
                    pr2.offer(Integer.parseInt(input[1]));
                }else {
                    if(pr1.isEmpty()){
                        continue;
                    }
                    if(input[1].equals("-1")){
                        int val = pr1.poll();
                        pr2.remove(val);
                    } else {
                        int val = pr2.poll();
                        pr1.remove(val);
                    }
                }
            }
            if(pr1.isEmpty()){
                answer[0]=0;
                answer[1]=0;
            }else {
                answer[0]= pr2.poll();
                answer[1]= pr1.poll();
            }
            return answer;
        }
    }
}
