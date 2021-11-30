package programmers.week_1;

public class Pro77484 {
    public static void main(String[] arg) {
        int[] a = {12,3,5,0,0,8};
        int[] b = {12,3,5,1,9,8};
        int[] val =solution(a,b);
        System.out.println(val[0]+"//"+val[1]);

    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                answer[0]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        if (answer[0] != 0) {
            answer[0] = (6 - answer[0]) + 1;
        } else {
            answer[0] = 6;
        }
        if (answer[1] != 0) {
            answer[1] = (6 - answer[1]) + 1;
        } else {
            answer[1] = 6;
        }
        return answer;
    }
}
