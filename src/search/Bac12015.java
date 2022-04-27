package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bac12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int su[] = new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            su[i] = Integer.parseInt(st.nextToken());
        }
        for (int j = 0; j < N; j++) {
            if (list.get(list.size() - 1) < su[j]) {
                list.add(su[j]);
            } else {
                int left = 0;
                int right = list.size();
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) < su[j]) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                list.set(right, su[j]);
            }
        }
        System.out.println(list.size()-1);

    }

}
