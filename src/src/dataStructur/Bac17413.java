package src.dataStructur;

import java.util.*;

public class Bac17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> reverse = new Stack<>();
        Queue<Character> arr = new LinkedList<>();
        char[] input = sc.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '<') {
                while (!reverse.isEmpty()) {
                    sb.append(reverse.pop());
                }
                for(int j =i ;j<input.length;j++){
                    if(input[j]=='>'){
                        while(!arr.isEmpty()){
                            sb.append(arr.poll());
                        }
                        sb.append(input[j]);
                        break;
                    }
                    arr.offer(input[j]);
                    i=j+1;
                }
                continue;
            }
            if (input[i] == ' ') {
                while (!reverse.isEmpty()) {
                    sb.append(reverse.pop());
                }
                sb.append(' ');
                continue;
            }
            reverse.push(input[i]);
        }
        while(!reverse.isEmpty()){
            sb.append(reverse.pop());
        }
        System.out.println(sb);
    }
}
