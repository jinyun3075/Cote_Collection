package Sorfteer;

import java.util.*;

// 문제 주소 https://softeer.ai/practice/info.do?eventIdx=1&psProblemId=584
public class GBC
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<test> q1 = new LinkedList<>();
        Queue<test> q2 = new LinkedList<>();

        int value = 0;

        for(int i=0;i<n;i++) {
            q1.offer(new test(sc.nextInt(),sc.nextInt()));
        }
        for(int i=0;i<m;i++) {
            q2.offer(new test(sc.nextInt(),sc.nextInt()));
        }

        int oneCount = 1;
        int twoCount = 1;
        while(!q2.isEmpty()&&!q1.isEmpty()){
            if(q1.peek().distance < oneCount) {
                oneCount = 1;
                q1.poll();
            }
            if(q2.peek().distance < twoCount) {
                twoCount = 1;
                q2.poll();
            }
            if(q1.peek()==null&&q2.peek()==null) break;
            value = Math.max(value, q2.peek().speed - q1.peek().speed);
            oneCount++;
            twoCount++;
        }
        System.out.println(value);
    }
}
class test{
    int speed;
    int distance;
    test(int distance, int speed) {
        this.distance = distance;
        this.speed = speed;
    }
}
