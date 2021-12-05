package src.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Bac1759 {
    static int L;
    static int C;
    static char al[];
    static char val[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        L = sc.nextInt();
        C = sc.nextInt();
        al = new char[C];
        val = new char[C];
        sc.nextLine();
        String input = sc.nextLine().replace(" ", "");

        for (int i = 0; i < C; i++) {
            al[i] = input.charAt(i);
        }
        Arrays.sort(al);

        logic(0, 0, 0, 0);


    }

    static void logic(int p, int l, int ja, int mo) {
        if (l == L && ja >= 2 && mo >= 1) {
            for (int i = 0; i < L; i++) {
                System.out.print(val[i]);
            }
            System.out.println();
            return;
        }

        for (int i = p; i < C; i++) {
            val[l] = al[i];
            logic(i + 1, l + 1, ja + (!ch(al[i]) ? 1 : 0), mo + (ch(al[i]) ? 1 : 0));

        }
    }

    static boolean ch(char a) {
        if (a == 'a' || a == 'i' || a == 'o' || a == 'u' || a == 'e') return true;

        return false;
    }
}
