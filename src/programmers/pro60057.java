package programmers;

public class pro60057 {
    class Solution {
        public int solution(String s) {
            int answer = s.length();
            for(int i=1;i<=s.length()/2;i++){
                answer = Math.min(answer,logic(s,i));
            }
            return answer;
        }
        public int logic(String s,int size){
            String str = s.substring(0,size);
            String value = "";
            int level=1;
            for(int i=size;i<=s.length();i+=size) {
                String next = s.substring(i,i+size>s.length()?s.length():i+size);
                if(str.equals(next)){
                    level++;

                }else {
                    value += (level==1?"":level) + str;
                    str = next;
                    level =1;
                }
            }
            value += str;
            return value.length();
        }
    }
}
