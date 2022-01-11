package programmers.week_8;
import java.util.ArrayList;

public class Pro42840 {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        System.out.print(solution(input));
    }
    public static int[] solution(int[] answers) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a1[i % a1.length]) val1++;
            if (answers[i] == a2[i % a2.length]) val2++;
            if (answers[i] == a3[i % a3.length]) val3++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int max = Math.max(Math.max(val1, val2), val3);
        if (max == val1) arr.add(1);
        if (max == val2) arr.add(2);
        if (max == val3) arr.add(3);
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

}
