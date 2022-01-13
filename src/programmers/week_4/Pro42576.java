package programmers.week_4;
import java.util.Arrays;

public class Pro42576 {
    public static void main(String[] args){
        String[] str = {"leo", "kiki", "eden"};
        String[] com = {"eden", "kiki"};
        System.out.println(solution(str,com));
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
        int cnt =0;
        boolean sw =false;
        for(int i =0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                if(i==0){
                    sw =true;
                }else{
                    cnt=i;
                }
                break;
            }
            cnt++;
        }
        if(cnt==0&&sw==false){
            answer+=participant[participant.length-1];
        }
        else{
            answer+=participant[cnt];
        }
        return answer;
    }

}
