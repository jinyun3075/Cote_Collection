package programmers.week_6;
import java.util.*;

public class Pro68644 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        Arrays.stream(solution(numbers)).forEach((e)->System.out.print(e));
    }
    public static int[] solution(int[] numbers) {
        PriorityQueue<Integer> arr = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        set.forEach((e)->arr.add(e));
        int[] answer = new int[arr.size()];
        for(int i =0;i<answer.length;i++){
            answer[i]=arr.poll();
        }
        return answer;
    }
}
