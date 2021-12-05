package src.dataStructur;

import java.util.Scanner;
import java.util.Stack;

public class Bac17298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int N = sc.nextInt();
        int[] nge = new int[N];
        for (int i = 0; i < N; i++){
            nge[i]=sc.nextInt();
        }
        for (int i = 0; i < N; i++){
            while(!st.isEmpty()&&nge[st.peek()]<nge[i]){
                nge[st.pop()]=nge[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nge[st.pop()]=-1;
        }
        for(int v :nge){
            sb.append(v).append(' ');
        }
        System.out.println(sb);
    }
}
