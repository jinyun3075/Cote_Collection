import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        logic(n, "");
        System.out.println(sb);
    }

    static void logic(int n, String d) {
        sb.append(d + "\"재귀함수가 뭔가요?\"\n");
        if (n == 0) {
            sb.append(d + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            sb.append(d + "라고 답변하였지.\n");
            return;
        }
        sb.append(d + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
                d + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
                d + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
        logic(n - 1, d + "____");
        sb.append(d + "라고 답변하였지.\n");
    }
}
/* 단지 번호 붙이기 */
//    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//    public static void main(String[] args) throws IOException {
//        ArrayList<Integer> sb = new ArrayList<>();
//        Main logic = new Main();
//        int N = Integer.parseInt(sc.readLine());
//        logic.setMap(N);
//        int count=0;
//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//                if(logic.map[i][j]==1) {
//                    count++;
//                    logic.home=0;
//                    logic.dfs(i,j,N);
//                    sb.add(logic.home);
//                }
//            }
//        }
//        Collections.sort(sb);
//        System.out.println(count);
//        sb.forEach(i -> {
//            System.out.println(i);
//        });
//    }
//    int home;
//    int[][] map;
//    int[] move = {1,-1};
//    void setMap(int n) throws IOException{
//        map = new int[n][n];
//        for(int i=0;i<n;i++) {
//            String input = sc.readLine();
//            for(int j=0;j<n;j++) {
//                map[i][j] = input.charAt(j)-'0';
//            }
//        }
//    }
//    void dfs(int x, int y, int n) {
//        map[x][y]=0;
//        home++;
//        for(int i=0;i<2;i++) {
//            if(move[i]+x<n&&move[i]+x>=0&&map[move[i]+x][y]==1) {
//                dfs(move[i]+x,y,n);
//            }
//            if(move[i]+y<n&&move[i]+y>=0&&map[x][move[i]+y]==1) {
//                dfs(x,move[i]+y,n);
//            }
//        }
//    }
/* 연결 요소의 개수*/
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        boolean check[] = new boolean[n+1];
//        int result = 0;
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        for(int i=0;i<=n;i++) {
//            arr.add(new ArrayList<>());
//        }
//        for(int i=0;i<m;i++) {
//            int f = sc.nextInt();
//            int s = sc.nextInt();
//            arr.get(f).add(s);
//            arr.get(s).add(f);
//        }
//        for(int i = 1 ;i<=n;i++) {
//            if(!check[i]) {
//                result++;
//                Queue<Integer> q = new LinkedList<>();
//                check[i]=true;
//                q.offer(i);
//                while(!q.isEmpty()) {
//                    int num = q.poll();
//                    for(int j: arr.get(num)) {
//                        if(!check[j]){
//                            check[j] = true;
//                            q.offer(j);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(result);
//    }
/* DFS와 BFS*/
//static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//    static StringBuilder sb = new StringBuilder();
//    static boolean Check[];
//    static int n;
//    static int m;
//    static int v;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        v = sc.nextInt();
//        for (int i = 0; i <= n; i++) {
//            arr.add(new ArrayList<>());
//        }
//        for (int i = 0; i < m; i++) {
//            int f = sc.nextInt();
//            int s = sc.nextInt();
//            arr.get(f).add(s);
//            arr.get(s).add(f);
//        }
//        for(int i =0;i<=n;i++) {
//            Collections.sort(arr.get(i));
//        }
//        Check = new boolean[n+1];
//        DFS(v);
//        sb.append('\n');
//        Arrays.fill(Check,false);
//        BFS(v);
//        System.out.print(sb);
//    }
//    static public void DFS(int v) {
//        Check[v]=true;
//        sb.append(v).append(" ");
//        for(int i : arr.get(v)){
//            if(!Check[i]){
//                DFS(i);
//            }
//        }
//    }
//    static public void BFS(int v) {
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(v);
//        Check[v]= true;
//        sb.append(v).append(" ");
//        while(!q.isEmpty()) {
//            int num = q.poll();
//            for(int i: arr.get(num)){
//                if(!Check[i]){
//                    sb.append(i).append(" ");
//                    q.offer(i);
//                    Check[i]= true;
//                }
//            }
//        }
//    }
/* ABCDE */
//static ArrayList<ArrayList<Integer>> arr ;
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        arr = new ArrayList<>();
//        for(int i=0;i<n;i++) {
//            arr.add(new ArrayList<Integer>());
//        }
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(bf.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            arr.get(a).add(b);
//            arr.get(b).add(a);
//        }
//        check = new boolean[n];
//        for(int i=0;i<n;i++) {
//            logic(i,0);
//        }
//        System.out.println(0);
//    }
//
//    static int m;
//    static boolean[] check;
//
//    public static void logic(int friend,int depth) {
//        if (depth == 4) {
//            System.out.print(1);
//            System.exit(0);
//        }
//        check[friend] = true;
//        for( int i : arr.get(friend)) {
//            if(!check[i]) {
//                logic(i,depth+1);
//            }
//        }
//        check[friend] = false;
//    }
/* N과 M(2) */
//static StringBuilder sb = new StringBuilder();
//    static int[] arr;
//    static int N;
//    static int M;
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        N =Integer.parseInt(st.nextToken());
//        M =Integer.parseInt(st.nextToken());
//        arr = new int[M];
//        logic(1,0);
//        System.out.println(sb);
//    }
//    public static void logic(int n ,int m) {
//        if (m == M) {
//            for(int i : arr) {
//                sb.append(i).append(" ");
//            }
//            sb.append("\n");
//            return;
//        }
//        for (int i = n; i <= N; i++) {
//            arr[m] = i;
//            logic(i+1,m+1);
//        }
//    }
/* N과 M(1) */
//    static StringBuilder sb = new StringBuilder();
//    static int[] arr;
//    static boolean[] check;
//    static int N;
//    static int M;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        M = sc.nextInt();
//        arr = new int[M];
//        check = new boolean[N+1];
//        logic(0);
//        System.out.println(sb);
//    }
//    public static void logic(int m) {
//        if (m == M) {
//            for(int i : arr) {
//                sb.append(i).append(" ");
//            }
//            sb.append("\n");
//            return;
//        }
//        for (int i = 1; i <= N; i++) {
//            if(!check[i]){
//                arr[m] = i;
//                check[i]= true;
//                logic(m+1);
//                check[i] = false;
//            }
//        }
//    }
/* 수 이어 쓰기 1 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int more = 1;
//        int result =0;
//        int div = 10;
//        for(int i=1;i<=n;i++) {
//            if(i%div==0) {
//                div*=10;
//                more++;
//            }
//            result += more;
//        }
//        System.out.println(result);
//    }
/* 리모컨 */
//public class Main {
//    public static void main(String[] args) {
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int result = Math.abs(n - 100);
//        Main remote = new Main(m);
//
//        for(int i=0;i<1000000;i++) {
//           int btn = remote.logic(i);
//           if(btn>0) result = Math.min(result, Math.abs(n-i)+btn);
//        }
//        System.out.println(result);
//    }
//
//    boolean error[] = new boolean[10];
//    static Scanner sc = new Scanner(System.in);
//
//    Main(int iter){
//        for (int i = 0; i < iter; i++) {
//            error[sc.nextInt()] = true;
//        }
//    }
//    int logic(int n) {
//        if(n == 0) {
//            if(error[n]) {
//                return 0;
//            }
//            return 1;
//        }
//        int count = 0;
//        while(n>0) {
//            if(error[n%10]) {
//                return 0;
//            }
//            count++;
//            n= n/10;
//        }
//        return count;
//    }
//}
/* 사탕게임 */
//public class CandyGame {
//    static Scanner sc = new Scanner(System.in);
//    char[][] map;
//    int val =0;
//    int n ;
//    public static void main(String[] args){
//        int n = sc.nextInt();
//        sc.nextLine();
//        CandyGame logic = new CandyGame(n);
//
//        for(int i=0;i<n;i++) {
//            for(int j=0;j<n-1;j++) {
//                logic.verticalTemp(i,j);
//                logic.check();
//                logic.verticalTemp(i,j);
//
//                logic.horizontalTemp(i,j);
//                logic.check();
//                logic.horizontalTemp(i,j);
//            }
//        }
//        System.out.println(logic.val);
//        sc.close();
//    }
//
//    Main (int n) {
//        this.n = n;
//        map = new char[n][n];
//        for(int i=0;i<n;i++) {
//            String input = sc.nextLine();
//            for(int j=0;j<n;j++) {
//                map[i][j] = input.charAt(j);
//            }
//        }
//    }
//    void horizontalTemp(int i, int j) {
//        char temp =map[i][j];
//        map[i][j] = map[i][j+1];
//        map[i][j+1] = temp;
//    }
//    void verticalTemp(int i, int j) {
//        char temp =map[j][i];
//        map[j][i] = map[j+1][i];
//        map[j+1][i] = temp;
//    }
//    void check() {
//        for(int i=0;i<n;i++){
//            int hCount = 1;
//            int vCount = 1;
//            for(int j=0;j<n-1;j++){
//                if(map[i][j]==map[i][j+1]){
//                    hCount++;
//                    val = Math.max(val,hCount);
//                }else{
//                    hCount=1;
//                }
//                if(map[j][i]==map[j+1][i]){
//                    vCount++;
//                    val = Math.max(val,vCount);
//                }else{
//                    vCount=1;
//                }
//            }
//        }
//    }
//}
/* 일곱 난쟁이 */
//    static int all = 0;
//    static int child[] = new int[9];
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for( int i=0;i<9;i++) {
//            child[i] = sc.nextInt();
//            all+=child[i];
//        }
//        Arrays.sort(child);
//        int[] index = val();
//        for(int i=0;i<9;i++) {
//            if(i==index[0]||i==index[1]){
//                continue;
//            }
//            System.out.println(child[i]);
//        }
//    }
//    static int[] val() {
//        int re[] = new int[2];
//        for(int i=0;i<9;i++) {
//            for(int j=0;j<9;j++) {
//                if(i==j){
//                    continue;
//                }
//                if(all-(child[i]+child[j]) == 100) {
//                    re[0]=i;
//                    re[1]=j;
//                    return re;
//                }
//            }
//        }
//
//        return re;
//    }
/* 합분해 (DFS)*/
//static int N ;
//    static Long dp[][] ;
//    final static int DIV = 1000000000;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        N=  sc.nextInt();
//        int k = sc.nextInt();
//        dp = new Long[N+1][k+1];
//        System.out.println(dfs(N,k)%DIV);
//    }
//    static public long dfs(int n, int k) {
//        if(k==1){
//            return 1;
//        }
//        if(dp[n][k] == null){
//            dp[n][k] =0l;
//            for(int i=0;i<=N;i++) {
//                if(n-i<0){
//                    break;
//                }
//                dp[n][k] += dfs(n-i,k-1);
//            }
//        }
//        return dp[n][k] % DIV;
//    }
/* 합분해 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        int[][] dp = new int[n + 1][k + 1];
//        for (int i = 1; i <= k; i++) {
//            dp[0][i] = 1;
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= k; j++) {
//                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1])%1000000000;
//            }
//        }
//        System.out.println(dp[n][k]);
//    }
/* 스티커 */
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       StringBuilder sb = new StringBuilder();
//       int test = sc.nextInt();
//       while(test-->0) {
//           int n = sc.nextInt();
//           int[][] dp = new int[n][3];
//           int[][] sticker = new int[n][2];
//           for(int i=0;i<n;i++) {
//               sticker[i][0] = sc.nextInt();
//           }
//           for(int i=0;i<n;i++) {
//               sticker[i][1] = sc.nextInt();
//           }
//           dp[0][0] = sticker[0][0];
//           dp[0][1] = sticker[0][1];
//           for(int i = 1 ;i < n ; i++) {
//               dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2])+sticker[i][0];
//               dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2])+sticker[i][1];
//               dp[i][2] = Math.max(dp[i-1][0],dp[i-1][1]);
//           }
//           int val = Math.max(dp[n-1][0],dp[n-1][1]);
//           sb.append(val).append('\n');
//       }
//       System.out.print(sb);
//    }
/* 동물원 */
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[][] dp = new int[n][3];
//    dp[0][0] = 1;
//    dp[0][1] = 1;
//    dp[0][2] = 1;
//
//    for (int i = 1 ; i < n ; i++) {
//        dp[i][0] = dp[i-1][1] + dp[i-1][2] + dp[i-1][0];
//        dp[i][1] = dp[i-1][0] + dp[i-1][2];
//        dp[i][2] = dp[i-1][1] + dp[i-1][0];
//    }
//    int val = (dp[n-1][0]+dp[n-1][1]+dp[n-1][2]);
//    System.out.print(val);
//}
/* RGB거리 */
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int[][] col = new int[n][3];
//       int[][] dp = new int[n][3];
//       for(int i =0 ; i < n ; i++) {
//           col[i][0] = sc.nextInt();
//           col[i][1] = sc.nextInt();
//           col[i][2] = sc.nextInt();
//       }
//       dp[0][0] = col[0][0];
//       dp[0][1] = col[0][1];
//       dp[0][2] = col[0][2];
//       for(int i = 1 ; i < n ; i++) {
//           dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2])+col[i][0];
//           dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2])+col[i][1];
//           dp[i][2] = Math.min(dp[i-1][1],dp[i-1][0])+col[i][2];
//       }
//       System.out.print(Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2])));
//    }
/* 얀속합*/
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int dp[] = new int[n];
//        int val[] = new int[n];
//        for(int i = 0 ; i < n ; i++) {
//            val[i] = sc.nextInt();
//        }
//        dp[0] = val[0];
//        int result = dp[0];
//        for(int i = 1 ; i < n ; i++) {
//            dp[i] = Math.max(dp[i-1]+val[i],val[i]);
//            result = Math.max(dp[i],result);
//        }
//        System.out.print(result);
//    }
/* 가장 긴 증가하는 부분 수열 4*/
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n];
//        int[] le = new int[n];
//        int result = 0;
//        for (int i =0 ;i<n;i++){
//            le[i]=sc.nextInt();
//        }
//        for(int i = 0; i<n;i++) {
//            dp[i] = 1;
//            for(int j = i-1; j>=0;j--){
//                if(le[j]<le[i]){
//                    dp[i] = Math.max(dp[j] + 1,dp[i]);
//                }
//            }
//            result =Math.max(result,dp[i]);
//        }
//        Stack<Integer> st = new Stack<>();
//        int val = result;
//        for(int i = n-1;i>=0;i--) {
//            if(val==dp[i]){
//                st.push(le[i]);
//                val--;
//            }
//        }
//        System.out.println(result);
//        while(!st.isEmpty()) {
//            System.out.print(st.pop()+" ");
//        }
//    }
/* 가장 긴 증가하는 부분 수열 */

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n];
//        int[] le = new int[n];
//        int result = 0;
//        for (int i =0 ;i<n;i++){
//            le[i]=sc.nextInt();
//        }
//        for(int i = 0; i<n;i++) {
//            dp[i] = 1;
//            for(int j = i-1; j>=0;j--){
//                if(le[j]<le[i]){
//                    dp[i] = Math.max(dp[j] + 1,dp[i]);
//                }
//            }
//            result =Math.max(result,dp[i]);
//        }
//        System.out.print(result);
//    }

/* 이친수 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[][] dp = new long[n+1][2];
//        dp[1][1]=1;
//
//        for(int i=2 ;i <=n;i++) {
//            dp[i][0] = dp[i-1][0] + dp[i-1][1];
//            dp[i][1] = dp[i-1][0];
//        }
//        System.out.print(dp[n][0]+dp[n][1]);
//    }
/* 쉬운 계단 수 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        final int DIV = 1000000000;
//        int n = sc.nextInt();
//        long[][] dp = new long[n+1][10];
//        long result = 0;
//        for(int i = 1 ;i < 10 ;i++) {
//            dp[1][i] =1;
//        }
//        for(int i = 2 ; i <= n ; i++) {
//            for(int j = 1 ; j < 9 ; j ++) {
//                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % DIV;
//            }
//            dp[i][9] = dp[i-1][8] % DIV;
//            dp[i][0] = dp[i-1][1] % DIV;
//        }
//        for(int i = 0 ;i < 10 ;i++) {
//            result += dp[n][i] % DIV;
//        }
//        System.out.print(result % DIV);
//    }
/* 1, 2, 3 더하고 5 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb= new StringBuilder();
//        final int DIV = 1000000009;
//        int T = sc.nextInt();
//        long[][] dp = new long[100001][4];
//        dp[1][1] = 1;
//        dp[2][2] = 1;
//        dp[3][1] = 1;
//        dp[3][2] = 1;
//        dp[3][3] = 1;
//
//        while(T-->0) {
//            int n = sc.nextInt();
//            for(int i = 4 ; i <= n ; i++) {
//                if(dp[i][1]==0 && dp[i][2]==0 && dp[i][3]==0){
//                    dp[i][1] = dp[i-1][2]+dp[i-1][3]%DIV;
//                    dp[i][2] = dp[i-2][1]+dp[i-2][3]%DIV;
//                    dp[i][3] = dp[i-3][1]+dp[i-3][2]%DIV;
//                }
//            }
//            sb.append((dp[n][1]+dp[n][2]+dp[n][3])%DIV).append("\n");
//        }
//        System.out.print(sb);
//    }

/* 카드 구매하기 2 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n+1];
//        int[] cost = new int[n+1];
//        for(int i = 1 ; i <= n ; i++) {
//            cost[i] = sc.nextInt();
//        }
//        for(int i = 1 ;i <= n ; i++) {
//            dp[i] = 10000;
//            for(int j = i ; j > 0 ; j--) {
//                dp[i] = Math.min(dp[i],dp[i-j] + cost[j]);
//            }
//        }
//        System.out.print(dp[n]);
//    }
/* 카드 구매하기 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n+1];
//        int[] cost = new int[n+1];
//        for(int i = 1 ; i <= n ; i++) {
//            cost[i] = sc.nextInt();
//        }
//        for(int i = 1 ;i <= n ; i++) {
//            for(int j = i ; j > 0 ; j--) {
//                dp[i] = Math.max(dp[i],dp[i-j] + cost[j]);
//            }
//        }
//        System.out.print(dp[n]);
//    }
/* 1, 2, 3 더하기 */
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       StringBuilder sb = new StringBuilder();
//       int T = sc.nextInt();
//       int[] dp = new int[11];
//       dp[1] = 1;
//       dp[2] = 2;
//       dp[3] = 4;
//       while(T-->0) {
//           int n = sc.nextInt();
//           for(int i = 4 ; i <= n ; i++) {
//               dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
//           }
//           sb.append(dp[n]).append("\n");
//       }
//       System.out.print(sb);
//    }
/* 2+n 타일링2 */
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] dp = new int[n + 1];
//    dp[0] = 1;
//    dp[1] = 1;
//    for (int i = 2; i <= n; i++) {
//        dp[i] = (dp[i - 2]*2 + dp[i - 1]) % 10007 ;
//    }
//    System.out.print(dp[n]);
//}
/* 2+n 타일링 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007 ;
//        }
//        System.out.print(dp[n]);
//    }
/* 1 만들기 */
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            int[] dp = new int[x+1];
//            dp[1] = 0;
//            for(int i = 2; i <= x ;i ++) {
//                dp[i] = Integer.MAX_VALUE;
//                if(i % 3 == 0 ) {
//                    dp[i] = Math.min(dp[i],dp[i/3]+1);
//                }
//                if(i % 2 == 0) {
//                    dp[i] = Math.min(dp[i],dp[i/2]+1);
//                }
//                dp[i] = Math.min(dp[i],dp[i-1]+1);
//            }
//            System.out.print(dp[x]);
//    }

