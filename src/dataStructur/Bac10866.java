package dataStructur;

import java.util.Scanner;

public class Bac10866 {
    static int[] arr = new int[10001];
    static int head = 10000, tail = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String[] input = sc.next().split("_");
            switch (input[0]) {
                case "push":
                    if (input[1].equals("front")) {
                        push(sc.nextInt(), true);
                    } else {
                        push(sc.nextInt(), false);
                    }
                    break;
                case "pop":
                    if (input[1].equals("front")) {
                        sb.append(pop(true)).append('\n');
                    } else {
                        sb.append(pop(false)).append('\n');
                    }
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

            }
        }
        System.out.println(sb);

    }

    static void push(int val, boolean lo) {
            if (lo) {
                arr[head] = val;
                head = head > 0 ? head - 1 : 10000;
            } else {
                arr[tail] = val;
                tail = tail > 9999 ? 0 : tail + 1;
            }
    }

    static int pop(boolean lo) {
        if(head+1==tail||head>9999&&tail==0){
            return -1;
        }
            if (lo) {
                head = head > 9999 ? 0 : head + 1;
                int v = arr[head];
                arr[head]=0;
                return v;
            } else {
                tail = tail > 0 ? tail - 1 : 10000;
                int v = arr[tail];
                arr[tail]=0;
                return v;
            }
    }
    static int size(){
        if(head < tail){
            return tail-head-1;
        }
        return (10000-head)+tail;
    }
    static int empty(){
        if(head+1==tail||head>9999&&tail==0){
            return 1;
        }
        return 0;
    }
    static int front(){
        if(head+1==tail||head>9999&&tail==0){
            return -1;
        }
        if(head>9999){
            return arr[0];
        }
        return arr[head+1];
    }
    static int back(){
        if(head+1==tail||head>9999&&tail==0){
            return -1;
        }
        if(tail==0){
            return arr[10000];
        }
        return arr[tail-1];
    }
}
