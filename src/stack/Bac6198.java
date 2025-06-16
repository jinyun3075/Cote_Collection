package stack;
import java.io.*;
import java.util.Stack;
public class Bac6198 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Long> stack = new Stack<>();
        long result = 0;
        for(int i = 0 ; i < N ; i++){
            long num = Long.parseLong(br.readLine());
            while(!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            result += stack.size();

            stack.push(num);
        }
        System.out.println(result);
    }
}
