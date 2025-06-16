package stack;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Bac2493 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer[]> stack = new Stack<>();
        Stack<Integer[]> tempStack = new Stack<>();
        int[] result = new int[N];
        for(int i = 0; i < N; i++) {
            stack.push(new Integer[] {Integer.parseInt(st.nextToken()),i});
        }

        while(!stack.isEmpty()){
            if(tempStack.isEmpty()) {
                tempStack.push(stack.pop());
                continue;
            }

            Integer[] front = stack.peek();
            Integer[] back = tempStack.pop();

            if(front[0] >= back[0]){
                result[back[1]] = front[1] + 1;
            }else{
                tempStack.push(back);
                tempStack.push(stack.pop());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
