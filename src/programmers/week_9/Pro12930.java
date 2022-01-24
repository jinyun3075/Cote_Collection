package programmers.week_9;

public class Pro12930 {
    public static void main(String[] ags) {
        String s = "hello world";
        System.out.print((solution(s)));
    }
    public static String solution(String s) {
        String answer = "";
        String[] word = s.split(" ",-1);
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length() ; j++) {
                if(j%2==0) {
                    answer += Character.toUpperCase(word[i].charAt(j));
                }else {
                    answer += Character.toLowerCase(word[i].charAt(j));
                }
            }
            if(word.length-1==i) {
                break;
            }
            answer +=" ";
        }
        return answer;
    }
}
