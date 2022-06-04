import java.util.Scanner;

class Main {
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] direction;
    static int max=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        direction = new boolean[N][M];

        for(int i=0;i<N;i++) {
            String input = sc.next();
            for(int j=0;j<M;j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        dfs(0,0);
        System.out.println(max);
    }

    public static void dfs(int row, int cal) {
        if(row>=N) {
            logic();
            return;
        }
        if(cal>=M) {
            dfs(row+1,0);
            return;
        }

        direction[row][cal] = true;
        dfs(row, cal+1);
        direction[row][cal] = false;
        dfs(row, cal+1);
    }

    public static void logic() {
        int temp =0;
        int result =0;

        for(int i=0;i<N;i++) {
            temp = 0;
            for(int j=0;j<M;j++) {
                if(direction[i][j]) {
                    temp *= 10;
                    temp += map[i][j];
                } else {
                    result += temp;
                    temp = 0;
                }
            }
            result += temp;
        }
        for(int i=0;i<M;i++) {
            temp = 0;
            for(int j=0;j<N;j++) {
                if(!direction[j][i]) {
                    temp *= 10;
                    temp += map[j][i];
                }else {
                    result += temp;
                    temp = 0;
                }
            }
            result += temp;
        }

        max = Math.max(max,result);
    }
}
