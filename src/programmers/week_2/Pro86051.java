package programmers.week_2;

public class Pro86051 {
    public static void main(String[] args) {
        int[] a = {5,8,4,0,6,7,9};
        System.out.println(solution(a));
    }
    public static int solution(int[] numbers) {
        int answer = 45;
        for(int num : numbers) {
            answer -= num;
        }
        return answer;
    }
}
