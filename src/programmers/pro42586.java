package programmers;
import java.util.*;
public class pro42586 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] answer;
            int workingIdx = 0;
            int release =0;
            List<Integer> answerList = new ArrayList<>();
            for(int day = 1; day<101;day++) {
                if(workingIdx == progresses.length) {
                    answerList.add(release);
                    break;
                }
                if(progresses[workingIdx]+(speeds[workingIdx]*day)>99) {
                    release++;
                    workingIdx++;
                    day--;
                    continue;
                }
                if(release>0) {
                    answerList.add(release);
                    release = 0;
                }
            }
            answer = new int[answerList.size()];
            for(int i =0 ; i< answerList.size();i++) {
                answer[i] = answerList.get(i);
            }
            return answer;
        }
    }
}
