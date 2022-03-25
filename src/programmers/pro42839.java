package programmers;
import java.util.*;
public class pro42839 {
    class Solution {
        String numbers;
        boolean[] check;
        Set<Integer> se = new HashSet<>();
        public int solution(String numbers) {
            int answer = 0;
            check = new boolean[numbers.length()];
            this.numbers = numbers;
            for(int i=1;i<=numbers.length();i++){
                logic2("",i);
            }
            for(int v : se){
                if(logic(v)){
                    answer++;
                }
            }
            return answer;
        }
        public void logic2(String str ,int l) {
            if(l==0) {
                se.add(Integer.parseInt(str));
                return;
            }
            for(int i=0;i<numbers.length();i++) {
                String ba = str;
                if(check[i]==false){
                    check[i]= true;
                    ba += numbers.charAt(i);
                    logic2(ba,l-1);
                    check[i]= false;
                }
            }
        }
        public boolean logic(int num) {
            if(num<2) {
                return false;
            }
            if(num==2) {
                return true;
            }
            for(int i=2;i<=Math.sqrt(num);i++) {
                if(num%i==0) {
                    return false;
                }
            }
            return true;
        }
    }
}
