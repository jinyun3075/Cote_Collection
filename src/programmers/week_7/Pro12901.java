package programmers.week_7;

public class Pro12901 {
    public static void main(String[] args) {
        System.out.print(solution(5,24));
    }
    public static String solution(int a, int b) {
        String answer = "";
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int month[] ={0,0,31,60,91,121,152,182,213,244,274,305,335,366};
        int date = b;
        answer = day[(month[a]+b)%day.length];
        return answer;
    }
}
