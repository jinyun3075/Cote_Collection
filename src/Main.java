import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();


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
