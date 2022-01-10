package programmers.week_5;
import java.util.Arrays;

public class Pro42862 {
    public static void main(String[] args) {
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(5,lost,reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        boolean[] val = new boolean[n+2];
        Arrays.fill(val, true);
        for (int i = 0; i < lost.length; i++) {
            val[lost[i]] = false;
            answer--;
        }
        for(int i=0;i<reserve.length;i++){
            if(val[reserve[i]]==false){
                val[reserve[i]]=true;
                reserve[i]=0;
                answer++;
            }
        }
        for (int i = 0; i < reserve.length; i++) {
            if(reserve[i]!=0&&(val[reserve[i]-1]==false||val[reserve[i]+1]==false)){
                for(int j = -1;j<2;j+=2){
                    if(val[reserve[i]+j]==false){
                        answer++;
                        val[reserve[i]+j]=true;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
