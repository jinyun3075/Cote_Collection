package stack2;
import java.io.*;
import java.util.Stack;
public class Bac9012 {
    public void solution() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n-->0){
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            String result = "YES";
            for(char c : input.toCharArray()){
                if(c == '('){
                    stack.push(c);
                }else {
                    if(stack.isEmpty()){
                        result = "NO";
                        break;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty()) result = "NO";
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}
