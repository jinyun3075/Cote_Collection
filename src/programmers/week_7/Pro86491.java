package programmers.week_7;

public class Pro86491 {
    public static void main(String[] args) {
        int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.print(solution(size));
    }

    public static int solution(int[][] sizes) {
        int max = 0;
        int max2 = 0;
        int index = 0;
        boolean sw = false;
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (max < sizes[i][j]) {
                    index = i;
                    max = sizes[i][j];
                    if (j == 0) {
                        max2 = sizes[i][1];
                    } else {
                        max2 = sizes[i][0];
                    }
                }
            }
        }
        for (int i = 0; i < sizes.length; i++) {
            if(index != i){
                max2 = Math.max(Math.min(sizes[i][0], sizes[i][1]), max2);
            }
        }
        return max * max2;
    }
}
