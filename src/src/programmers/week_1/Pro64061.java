package src.programmers.week_1;
import java.util.Stack;

public class Pro64061 {
    public static void main(String[] args){
        int[][] b = {{0,0,0,0,},{1,2,4,0},{3,2,4,1},{1,2,3,1}};
        int[] m ={2,3,2,4,1}; //24211
        System.out.println(solution(b,m));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int cnt=moves.length;
        Stack<Integer> st = new Stack<>();
        int z = 0;
        while (z<cnt) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][moves[z]-1] != 0) {
                    if (st.size()>0&&st.peek() == board[i][moves[z]-1]) {
                        st.pop();
                        answer++;
                    } else {
                        st.push(board[i][moves[z]-1]);
                    }
                    board[i][moves[z]-1]=0;
                    break;
                }
            }
            z++;
        }
        return answer*2;
    }
}
