package stack;
import java.io.*;
import java.util.Stack;
public class Bac1874 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack <Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());

        int[] arr = new int[K];
        for(int i = 0 ; i < K ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int arrIdx = 0;
        for(int i = 1 ; i <= K ; i++){
            stack.push(i);
            sb.append("+").append("\n");
            
            while(!stack.isEmpty() && stack.peek() == arr[arrIdx]) {
                stack.pop();
                sb.append("-").append("\n");
                arrIdx++;
            }
        }

        System.out.println(stack.isEmpty() ? sb.toString() : "NO");
    }
}
