package stack2;
import java.io.*;
import java.util.Stack;
public class Bac3986 {
    public void solution() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int result = 0;
        while(n-->0){
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(char c : input.toCharArray()){
                if(!stack.isEmpty() && stack.peek() == c){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
            if(stack.isEmpty()) result++;
        }
        System.out.println(result);
    }
}
