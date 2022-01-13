package programmers.week_7;

public class Pro87389 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int n) {
        for(int i=1;i<n;i++){
            if(n%i==1){
                return i;
            }
        }
        return 0;
    }
}
