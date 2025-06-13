package linkedlist;
import java.io.*;
import java.util.Stack;

public class Bac5397 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String[] commend = br.readLine().split("");
            Stack<String> left = new Stack<>();
            Stack<String> right = new Stack<>();
            StringBuilder line = new StringBuilder();
            for(int j = 0 ; j < commend.length; j++) {
                String ord = commend[j];
                switch(ord){
                    case "<":
                        if(!left.isEmpty()){
                            right.push(left.pop());
                        }
                        break;
                    case ">":
                        if(!right.isEmpty()){
                            left.push(right.pop());
                        }
                        break;
                    case "-":
                        if(!left.isEmpty()){
                            left.pop();
                        }
                        break;
                    default:
                        left.push(ord);
                        break;
                }
            }
            while(!left.isEmpty()){
                right.push(left.pop());
            }
            while(!right.isEmpty()){
                line.append(right.pop());
            }
            result.append(line).append("\n");
        }
        System.out.println(result.toString());
    }
}
