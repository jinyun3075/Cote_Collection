package stack2;
import java.io.*;
import java.util.Stack;
public class Bac2504 {
    public void solution() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Object> stack = new Stack<>();
        int result = 0;
        boolean isValid = true;
        for(char c : input.toCharArray()){
            if(c == '(' || c == '['){
                stack.push(c);
            }else {
                int sum = 0;
                while(!stack.isEmpty()){
                    Object top = stack.pop();
                    if(top instanceof Integer){
                        sum += (int)top;
                    }else if((c == ')' && top.equals('(')) || (c == ']' && top.equals('['))){
                        if(sum == 0){
                            stack.push(c == ')' ? 2 : 3);
                        }else{
                            stack.push(sum *= (c == ')' ? 2 : 3));
                        }
                        break;
                    }else {
                        isValid = false;
                        break;
                    }
                }
                if (!isValid) break;
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
            }
        }
        
        while(!stack.isEmpty()){
            if(stack.peek() instanceof Integer){
                result += (int)stack.pop();
            }else {
                isValid = false;
                break;
            }
        }
        
        System.out.println(isValid ? result: 0);
    }
}
