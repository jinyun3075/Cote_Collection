package recursion;

import java.util.HashSet;
import java.util.Scanner;

public class Bac5568 {
    static String[] card;
    static boolean[] checkCard;
    static HashSet<String> result = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        card = new String[n];
        checkCard = new boolean[n];

        for (int i = 0; i < n; i++) {
            card[i] = sc.next();
        }

        recursion(k,"");

        System.out.println(result.size());
    }

    public static void recursion(int selectCount, String answer) {
        if(selectCount == 0 ) {
            result.add(answer);
            return;
        }

        for(int i=0;i<card.length;i++) {
            if(!checkCard[i]) {
                checkCard[i] = true;
                recursion(selectCount-1, answer + card[i]);
                checkCard[i] = false;
            }
        }
    }
}
