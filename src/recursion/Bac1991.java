package recursion;

import java.util.*;

public class Bac1991 {
    static Map<String, ArrayList<String>> map;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i< n ;i ++) {
            String[] input = sc.nextLine().split(" ");
            map.put(input[0],new ArrayList<>());
            map.get(input[0]).add(input[1]);
            map.get(input[0]).add(input[2]);
        }
        preorder("A");
        sb.append("\n");
        inorder("A");
        sb.append("\n");
        postorder("A");
        System.out.println(sb);
    }

    public static void preorder (String root) {
        if(root.equals(".")){
            return;
        }
        sb.append(root);
        preorder(map.get(root).get(0));
        preorder(map.get(root).get(1));
    }

    public static void inorder (String root) {
        if(root.equals(".")){
            return;
        }
        inorder(map.get(root).get(0));
        sb.append(root);
        inorder(map.get(root).get(1));
    }
    public static void postorder (String root) {
        if(root.equals(".")){
            return;
        }
        postorder(map.get(root).get(0));
        postorder(map.get(root).get(1));
        sb.append(root);
    }
}
