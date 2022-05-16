import java.util.*;

class Main {
    static List<String> resultList = new ArrayList<>();
    static int[] input;
    static int N;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        input = new int[N];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        dfs(M, "", 0);

        for(String print : resultList){
            System.out.println(print.trim());
        }
    }

    public static void dfs(int count, String result,int idx) {
        if (count == 0) {
            if(!resultList.contains(result)){
                resultList.add(result);
            }
            return;
        }

        for (int i = idx; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                dfs(count-1,result+" "+input[i],i+1);
                visit[i] = false;
            }
        }
    }
}
