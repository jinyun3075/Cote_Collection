package programmers.week_1;

public class Pro77484 {
    public static void main(String[] args) {
        int lottos[] = {44,1,0,0,31,25};
        int win[] = {31,10,45,1,6,19};
        for(int i : solution(lottos,win)){
            System.out.print(i);
        }
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                answer[0]++;
                continue;
            }
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i]==win_nums[j]){
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        if(answer[0]!=0){
            answer[0] = (6-answer[0])+1;
        }
        else {
            answer[0]=6;
        }
        if(answer[1]!=0) {
            answer[1] = (6-answer[1])+1;
        }
        else {
            answer[1]=6;
        }
        return answer;
    }
}
