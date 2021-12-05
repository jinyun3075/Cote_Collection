package programmers.week_1;

import java.util.Scanner;

public class Pro81301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }

    static public int solution(String s) {
        int answer = 0;
        answer =Integer.parseInt(s.replaceAll("zero","0")
                .replaceAll("one","1").replaceAll("two","2")
                .replaceAll("three","3").replaceAll("four","4")
                .replaceAll("five","5").replaceAll("six","6")
                .replaceAll("seven","7").replaceAll("eight","8")
                .replaceAll("nine","9"));
        return answer;

    }
}
