package src.programmers.week_3;

public class Pro76501 {
    public static void main(String[] args) {
        int input[] = {1,3,6};
        boolean input2[] = {true,false,true};
        System.out.println(solution(input,input2));
    }
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer+=absolutes[i];
            }else {
                answer-=absolutes[i];
            }
        }
        return answer;
    }
}
