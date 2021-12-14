package programmers.week_4;
import java.util.Stack;

public class Pro17682 {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
    }
    public static int solution(String dartResult){
        int answer = 0;
        String[] dart = dartResult.split("");
        Stack<Integer> Score = new Stack<>();
        for(int i=0;i<dart.length;i++){
            switch (dart[i]) {
                case "S":
                    break;
                case"D":
                    Score.push((int)Math.pow(Score.pop(),2));
                    break;
                case"T":
                    Score.push((int)Math.pow(Score.pop(),3));
                    break;
                case"*":
                    if(Score.size()>1) {
                        int temp1 =Score.pop();
                        int temp2 =Score.pop();
                        Score.push(temp2*2);
                        Score.push(temp1*2);
                    }
                    else {
                        Score.push(Score.pop()*2);
                    }
                    break;
                case"#":
                    Score.push(Score.pop()*(-1));
                    break;
                default:
                    if(i<dart.length-1&&dart[i].equals("1")&&dart[i+1].equals("0")){
                        Score.push(10);
                        i++;
                        continue;
                    }
                    else{
                        Score.push(Integer.parseInt(dart[i]));
                    }
                    break;
            }

        }
        while(!Score.isEmpty()){
            answer+=Score.pop();
        }
        return answer;
    }

}
