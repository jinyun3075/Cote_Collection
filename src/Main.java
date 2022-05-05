import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long result =0;
        long w = sc.nextLong();
        long n = sc.nextLong();
        PriorityQueue<Item> pr = new PriorityQueue<>((o1,o2)-> (int) (o2.p-o1.p));
        for(long i=0;i<n;i++) {
            pr.offer(new Item(sc.nextLong(),sc.nextLong()));
        }
        while(!pr.isEmpty()&&w!=0){
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
    long m;
    long p;
    Item(long m, long p){
        this.m = m;
        this.p = p;
    }
}