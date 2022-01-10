import java.io.IOException;
import java.util.PriorityQueue;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();


        }
    class Solution {
        public int[] solution(int[] numbers) {
            PriorityQueue<Integer> arr = new PriorityQueue<>();
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<numbers.length-1;i++){
                for(int j=i+1;j<numbers.length;j++){
                    set.add(numbers[i]+numbers[j]);
                }
            }
            set.forEach((e)->arr.add(e));
            int[] answer = new int[arr.size()];
            for(int i =0;i<answer.length;i++){
                answer[i]=arr.poll();
            }
            return answer;
        }
    }
        static class player{
            private String name;
            private int score;

            public player(String name,int score){
                this.name=name;
                this.score=score;
            }

            @Override
            public String toString() {
                return "player{" +
                        "name='" + name + '\'' +
                        ", score=" + score +
                        '}';
            }

        }

}
