package programmers.week_6;
import java.util.Stack;

public class Pro68935 {
    public static void main(String[] args) {
        int i = 45;
        System.out.print(solution(i));
    }
    public static int solution(int n) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        while (n > 0) {
            if (n < 3) {
                st.push(n);
                n=0;
            } else {
                st.push(n % 3);
                n -= n % 3;
                n /= 3;
            }
        }
        int sum=1;
        while(!st.isEmpty()){
            answer+=(sum*st.pop());
            sum*=3;
        }
        return answer;
    }
}
