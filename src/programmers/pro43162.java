package programmers;

public class pro43162 {
    class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] check = new boolean[n];
            for(int i=0;i<n;i++) {
                if(check[i]==false) {
                    answer++;
                    logic(i,check,computers);
                }
            }
            return answer;
        }
        public void logic(int index, boolean[] check, int[][] computers){
            check[index]=true;
            for(int i=0;i<computers.length;i++) {
                if(!check[i]&&i!=index&&computers[index][i]==1) {
                    logic(i,check,computers);
                }
            }
        }
    }
}
