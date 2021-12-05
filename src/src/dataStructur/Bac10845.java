package src.dataStructur;

import java.util.Scanner;

public class Bac10845 {
    static int[] que = new int[100001];
    static int head=0;
    static int tail=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String input = sc.next();

            switch (input){
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    static void push(int data){
        que[tail]=data;
        tail++;
    }
    static int pop(){
        if(head!=tail){
            int val = que[head];
            head++;
            return val;
        }
        return -1;
    }
    static int size(){
        return tail-head;
    }
    static int empty(){
        if(tail==head){
            return 1;
        }
        return 0;
    }
    static int front(){
        if(tail!=head){
            return que[head];
        }
        return -1;
    }
    static int back(){
        if(tail!=head){
            return que[tail-1];
        }
        return -1;
    }
}
