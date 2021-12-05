package dataStructur;

import java.util.Scanner;
import java.util.Stack;

public class Bac17299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int N = sc.nextInt();
        int[] F = new int[1000001];
        int[] in =new int[N];
        for (int i = 0; i < N; i++){
            in[i]=sc.nextInt();
            F[in[i]]+=1;
        }
        for (int i = 0; i < N; i++){
            while(!st.isEmpty()&&F[in[st.peek()]]<F[in[i]]){
                in[st.pop()]=in[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            in[st.pop()]=-1;
        }
        for(int v :in){
            sb.append(v).append(' ');
        }
        System.out.println(sb);
    }
}
