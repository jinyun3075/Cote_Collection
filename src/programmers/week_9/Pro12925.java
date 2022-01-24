package programmers.week_9;

public class Pro12925 {
    public static void main(String[] args) {
        String inp = "1234";
        System.out.print(solution(inp));
    }
    public static int solution(String s) {
        int answer = 0;
        if(s.charAt(0)=='-'){
            answer = -Integer.parseInt(s.replaceAll("[/+/-]",""));
        } else {
            answer = Integer.parseInt(s.replaceAll("[/+/-]",""));
        }
        return answer;
    }
}
