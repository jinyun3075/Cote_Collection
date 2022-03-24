package programmers;
import java.util.*;

public class pro42627 {
    class Solution {
        public int solution(int[][] jobs) {
            int answer = 0;
            int end = 0;
            int index=0;
            Arrays.sort(jobs,(a,b)->a[0]-b[0]);
            PriorityQueue<int[]> pr = new PriorityQueue<>((a,b)->a[1]-b[1]);
            for(int i=0;i<jobs.length;) {
                while(index<jobs.length&&jobs[index][0]<=end){
                    pr.add(jobs[index++]);
                }
                if(pr.isEmpty()) {
                    end = jobs[i][0];
                }else {
                    int[] temp = pr.poll();
                    answer += temp[1]+end-temp[0];
                    end += temp[1];
                    i++;
                }
            }
            return answer/jobs.length;
        }
    }
}
