package dataStructur;

import java.io.*;
import java.util.LinkedList;

import java.util.ListIterator;
import java.util.StringTokenizer;
public class Bac1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        char[] input1 = bf.readLine().toCharArray();
        LinkedList<Character> list = new LinkedList<>();

        for(char i : input1){
            list.add(i);
        }

        ListIterator<Character> it = list.listIterator();

        while(it.hasNext()){
            it.next();
        }

        int n =  Integer.parseInt(bf.readLine());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(bf.readLine());
            String command = st.nextToken();
            switch(command){
                case "P":
                    it.add(st.nextToken().charAt(0));
                    break;
                case "L":
                    if(it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case "D":
                    if(it.hasNext()){
                        it.next();
                    }
                    break;
                case "B":
                    if(it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;
            }
        }
        for(Character out:list){
            bw.write(out);
        }
        bw.flush();
        bw.close();
    }
}