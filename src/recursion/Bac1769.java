package recursion;

import java.util.Scanner;

public class Bac1769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        logic(n, 0);
    }

    public static void logic(String str, int count) {
        if (str.length() == 1) {
            if (Integer.parseInt(str) % 3 == 0) {
                System.out.println(count);
                System.out.println("YES");
                return;
            }
            System.out.println(count);
            System.out.println("NO");
            return;
        }

        long result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        logic(String.valueOf(result), count + 1);
    }
}
