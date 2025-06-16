package stack;
import java.io.*;
import java.util.Stack;
public class Bac10773 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack <Integer> stack = new Stack<>();
        Long result = 0L;
        int K = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < K ; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                stack.pop();
            }else{
                stack.push(n);
            }
        }
        for(Integer num : stack){
            result += num;
        }
        System.out.println(result);
    }
}
