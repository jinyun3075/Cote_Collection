package stack2;
import java.io.*;
import java.util.Stack;
public class Bac4949 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while(true){
            Stack<Character> stack = new Stack<>();
            
            String input = br.readLine();
            if(input.equals(".")){
                break;
            }
            String result = "yes";
            for(char s : input.toCharArray()){
                if(s == '(' || s == '['){
                    stack.push(s);
                }else if(s == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else {
                        result = "no";
                        break;
                    }
                }else if(s == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else {
                        result = "no";
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) result ="no";
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}
