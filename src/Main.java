import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    char[][] map;
    int val =0;
    int n ;
    public static void main(String[] args){
        int n = sc.nextInt();
        sc.nextLine();
        Main logic = new Main(n);

        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) {
                logic.verticalTemp(i,j);
                logic.check();
                logic.verticalTemp(i,j);

                logic.horizontalTemp(i,j);
                logic.check();
                logic.horizontalTemp(i,j);
            }
        }
        System.out.println(logic.val);
        sc.close();
    }

    Main (int n) {
        this.n = n;
        map = new char[n][n];
        for(int i=0;i<n;i++) {
            String input = sc.nextLine();
            for(int j=0;j<n;j++) {
                map[i][j] = input.charAt(j);
            }
        }
    }
    void horizontalTemp(int i, int j) {
        char temp =map[i][j];
        map[i][j] = map[i][j+1];
        map[i][j+1] = temp;
    }
    void verticalTemp(int i, int j) {
        char temp =map[j][i];
        map[j][i] = map[j+1][i];
        map[j+1][i] = temp;
    }
    void check() {
        for(int i=0;i<n;i++){
            int hCount = 1;
            int vCount = 1;
            for(int j=0;j<n-1;j++){
                if(map[i][j]==map[i][j+1]){
                    hCount++;
                    val = Math.max(val,hCount);
                }else{
                    hCount=1;
                }
                if(map[j][i]==map[j+1][i]){
                    vCount++;
                    val = Math.max(val,vCount);
                }else{
                    vCount=1;
                }
            }
        }
    }
}

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

