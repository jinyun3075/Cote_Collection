package programmers.week_2;

public class Pro67256 {
    public static void main(String[] args){
        int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
        String hand = "right";
        System.out.println(solution(numbers,hand));
    }
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int lefthand = 10;
        int righthand = 12;
        for(int num : numbers){
            if (num % 3== 1) {
                lefthand = num;
                answer += "L";
            }else if(num % 3 ==0 && num != 0) {
                righthand = num;
                answer += "R";
            }else {
                int coml = com(lefthand, num);
                int comr = com(righthand, num);
                if(coml>comr) {
                    righthand = num;
                    answer+="R";
                }else if(coml<comr) {
                    lefthand = num;
                    answer+="L";
                }else {
                    if(hand.equals("right")) {
                        righthand = num;
                        answer+="R";
                    } else {
                        lefthand = num;
                        answer+="L";
                    }
                }
            }
        }
        return answer;
    }
    public static int com(int hand, int num) {
        hand=(hand==0)?11:hand;
        num=(num==0)?11:num;
        int handX = (hand-1)/3;
        int handY = (hand-1)%3;
        int numX = num / 3;
        int numY = 1;
        return Math.abs(handX-numX)+Math.abs(handY-numY);
    }
}
