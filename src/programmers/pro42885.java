package programmers;

import java.util.Arrays;
public class pro42885 {
    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            Arrays.sort(people);
            int comIdx =0;
            for(int i=people.length-1;i>=0;i--) {
                if(comIdx>i) {
                    break;
                }
                if(people[i]+people[comIdx]<=limit){
                    comIdx++;
                    answer++;
                    continue;
                }

                answer++;
            }
            return answer;
        }
        public void logic(){

        }
    }
}
