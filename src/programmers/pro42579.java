package programmers;
import java.awt.*;
import java.util.*;
import java.util.List;

public class pro42579 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String,PriorityQueue<Point>> map = new HashMap<>();
        for(int i=0;i<genres.length;i++) {
            map.put(genres[i],map.getOrDefault(genres[i],new PriorityQueue<Point>((a,b)->b.y-a.y)));
            map.get(genres[i]).offer(new Point(i,plays[i]));
        }
        Map<String,Integer> total = new HashMap<>();
        Map<String,PriorityQueue<Point>> value = new HashMap<>();
        for(Map.Entry<String,PriorityQueue<Point>> p : map.entrySet()) {
            while(!p.getValue().isEmpty()) {
                Point data = p.getValue().poll();
                total.put(p.getKey(),total.getOrDefault(p.getKey(),0)+data.y);
                value.put(p.getKey(),value.getOrDefault(p.getKey(),new PriorityQueue<Point>((a,b)->b.y-a.y)));
                value.get(p.getKey()).offer(data);
            }
        }


        List<Map.Entry<String,Integer>> totallist = new LinkedList<>(total.entrySet());
        totallist.sort((a,b)->b.getValue()-a.getValue());

        Queue<Integer> q = new LinkedList<>();
        for(Map.Entry<String,Integer> t : totallist) {
            int count =2;
            while(!value.get(t.getKey()).isEmpty()&&count!=0){
                q.add(value.get(t.getKey()).poll().x);
                count--;
            }
        }
        int[] answer = new int[q.size()];
        for(int i=0;i<answer.length;i++) {
            answer[i]=q.poll();
        }
        return answer;
    }

}
