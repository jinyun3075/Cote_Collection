package programmers.week_9;

public class Pro12926 {
    public static void main(String[] args) {
        char a = 'z';
        System.out.print((char)(a-'a'));
    }
    public static String solution(String s, int n) {
        String answer = "";
        for(int i = 0 ; i < s.length() ; i++) {
            if(Character.isUpperCase(s.charAt(i))){
                answer += (char)((s.charAt(i)-'A'+n)%26+'A');
            } else if(Character.isLowerCase(s.charAt(i))){
                answer += (char)((s.charAt(i)-'a'+n)%26+'a');
            } else {
                answer += " ";
            }
        }
        return answer;
    }
}
