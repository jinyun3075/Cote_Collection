package programmers;

public class pro43163 {
    class Solution {
        int answer = 0;
        String[] words;
        boolean[] check;
        public int solution(String begin, String target, String[] words) {
            this.words = words;
            check = new boolean[words.length];
            logic(begin,target,0);
            return answer;
        }
        public void logic(String begin, String target,int count){
            if(begin.equals(target)){
                answer=count;
                return;
            }
            for(int i=0;i<words.length;i++) {
                int result = wordsCheck(begin,words[i]);
                if(result==1) {
                    if(!check[i]){
                        check[i]=true;
                        logic(words[i],target,count+1);
                        check[i]=false;
                    }
                }
            }
        }
        public int wordsCheck(String word1, String word2) {
            int count =0;
            for(int i = 0; i < word1.length(); i++) {
                if(word1.charAt(i)!=word2.charAt(i)){
                    count++;
                }
            }
            if(count>1){
                return 2;
            }
            return count;
        }
    }
}
