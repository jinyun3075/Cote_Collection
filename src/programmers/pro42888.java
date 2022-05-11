package programmers;
import java.util.*;
public class pro42888 {
    class Solution {
        public String[] solution(String[] record) {
            List<String> answer = new ArrayList<>();
            Map<String,String> map = new HashMap<>();
            for(String data: record) {
                String[] input = data.split(" ");
                if(input[0].equals("Enter")) {
                    map.put(input[1],input[2]);
                    answer.add(input[1]+"]님이 들어왔습니다.");
                }else if(input[0].equals("Leave")) {
                    answer.add(input[1]+"]님이 나갔습니다.");
                }else {
                    map.put(input[1],input[2]);
                }
            }
            String[] result = new String[answer.size()];
            int count =0;
            for(String data : answer) {
                result[count++] = map.get(data.split("]")[0])+data.split("]")[1];
            }
            return result;
        }
    }
}
