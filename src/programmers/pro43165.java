package programmers;

public class pro43165 {
    class Solution {
        int[] numbers;
        int target;
        int answer = 0;
        public int solution(int[] numbers, int target) {
            this.numbers = numbers;
            this.target = target;
            logic(0,0);
            return answer;
        }
        public void logic(int target,int index) {
            if(numbers.length==index) {
                if(target==this.target){
                    answer++;
                }
                return;
            }

            logic(target+numbers[index],index+1);
            logic(target-numbers[index],index+1);
        }
    }
}
