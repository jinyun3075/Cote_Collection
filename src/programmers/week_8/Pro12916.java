package programmers.week_8;

public class Pro12916 {
    public static void main(String[] args) {
        System.out.print(solution("pPYyp"));
    }
    static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        String y =s.replaceAll("y","");
        String p =s.replaceAll("p","");

        if (y.length()!=p.length()){
            answer =false;
        }
        return answer;
    }
}
