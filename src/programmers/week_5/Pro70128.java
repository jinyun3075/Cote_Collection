package programmers.week_5;

public class Pro70128 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {2,-1,5};
        System.out.println(solution(a,b));
    }
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
