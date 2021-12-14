import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            ArrayList<Integer> arr = new ArrayList<>();
            int[] a = new int[3];
            Arrays.fill(a,2);
            arr.forEach(i->System.out.println(i));

        }
        static class player{
            private String name;
            private int score;

            public player(String name,int score){
                this.name=name;
                this.score=score;
            }

            @Override
            public String toString() {
                return "player{" +
                        "name='" + name + '\'' +
                        ", score=" + score +
                        '}';
            }

        }

}
