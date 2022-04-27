package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bac9576 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());
        for(int i=0;i<testCase;i++){
            int val=0;
            StringTokenizer st =new StringTokenizer(bf.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            boolean[] book = new boolean[N+1];
            PriorityQueue<Student> arr =new PriorityQueue<>();
            for(int j=0;j<M;j++){
                st =new StringTokenizer(bf.readLine());
                arr.offer(new Student(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
            }
            while(arr.size()>0){
                int s=arr.peek().first;
                int e=arr.poll().last;
                for(int j=s;j<=e;j++){
                    if(!book[j]){
                        book[j]=true;
                        val++;
                        break;
                    }
                }
            }
            System.out.println(val);
        }
    }
}
class Student implements Comparable<Student> {
    int first;
    int last;
    Student(int f,int l){
        first=f;
        last=l;
    }
    @Override
    public int compareTo(Student o) {
        if(this.last==o.last){
            return this.first-o.first;
        }
        return this.last-o.last;
    }
}
