package programmers.week_3;

public class Pro12977 {
    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        System.out.println(solution(input));
    }
    public static  int solution(int[] nums) {
        int answer = 0;
        boolean ch =true;
        for (int i = 0; i < nums.length;i++) {
            for (int j = i+1; j<nums.length;j++) {
                for (int z = j+1; z<nums.length; z++) {
                    int val =nums[i]+nums[j]+nums[z];
                    for (int k=2;k<val/2;k++) {
                        if(val %k==0) {
                            ch=false;
                            break;
                        }
                    }
                    if(ch) {
                        answer++;
                    }
                    ch=true;
                }
            }
        }
        return answer;
    }
}
