package stack;
import java.io.*;
import java.util.Stack;
public class Bac3015 {
    static class Man{
        int height;
        int cnt;
        Man(int height, int cnt){
            this.height = height;
            this.cnt = cnt;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Man> stack = new Stack<>();
        long result = 0;
        for(int i = 0 ; i < N ;i++){
            int height = Integer.parseInt(br.readLine());
            int cnt = 1;
            while(!stack.isEmpty()){
                if(stack.peek().height < height){
                    result += stack.pop().cnt;
                }else if(stack.peek().height == height){
                    Man man = stack.pop();
                    result += man.cnt;
                    cnt = ++man.cnt;
                    if(!stack.isEmpty()) result++;
                    break;
                }else{
                    result++;
                    break;
                }

            }
            stack.push(new Man(height, cnt));
        }
        System.out.println(result);
    }
}
