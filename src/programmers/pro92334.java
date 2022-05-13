package programmers;
import java.util.*;
public class pro92334 {
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            Map<String,Set<String>> state = new HashMap<>();
            Map<String,Integer> result = new HashMap<>();
            for(String user : id_list) {
                state.put(user,new HashSet<String>());
            }
            for(String re : report) {
                String[] input = re.split(" ");
                state.get(input[0]).add(input[1]);
            }
            for(String key : state.keySet()) {
                List<String> user = new ArrayList(state.get(key));
                for(String data : user) {
                    result.put(data,result.getOrDefault(data,0)+1);
                }
            }
            for(int i = 0;i<id_list.length;i++) {
                for(String key : result.keySet()) {
                    if(result.get(key)>=k) {
                        if(state.get(id_list[i]).contains(key)) {
                            answer[i]++;
                        }
                    }
                }
            }
            return answer;
        }
    }
}
