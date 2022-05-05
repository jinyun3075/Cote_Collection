package Sorfteer;

import java.util.*;

// 문제 주소 https://softeer.ai/practice/info.do?eventIdx=1&psProblemId=395
public class Steal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int result =0;
        int w = sc.nextInt();
        int n = sc.nextInt();
        PriorityQueue<Item> pr = new PriorityQueue<>((o1,o2)->o2.p-o1.p);
        for(int i=0;i<n;i++) {
            pr.offer(new Item(sc.nextInt(),sc.nextInt()));
        }
        while(!pr.isEmpty()){
            Item item =pr.poll();
            if(w>=item.m) {
                w-=item.m;
                result += item.m*item.p;
            }else {
                result += w*item.p;
            }
        }
        System.out.println(result);
    }
}
class Item {
    int m;
    int p;
    Item(int m, int p){
        this.m = m;
        this.p = p;
    }
}