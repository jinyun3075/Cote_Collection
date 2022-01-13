package programmers.week_1;

public class Pro81301 {
    public static void main(String[] args) {
        String inp = "one4seveneight";
        System.out.print(solution(inp));
    }
    public static int solution(String s) {
        int answer = 0;
        answer =Integer.parseInt(s.replaceAll("zero","0").replaceAll("one","1").replaceAll("two","2").replaceAll("three","3").replaceAll("four","4").replaceAll("five","5").replaceAll("six","6").replaceAll("seven","7").replaceAll("eight","8").replaceAll("nine","9"));
        return answer;
    }
}
