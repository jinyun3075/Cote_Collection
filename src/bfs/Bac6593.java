package bfs;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Bac6593 {
    public static class Node{
        int x;
        int y;
        int z;
        int cnt;
        Node(int x, int y, int z, int cnt){
            this.x = x;
            this.y = y;
            this.z = z;
            this.cnt = cnt;
        }
    }
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder result = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());

            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
    
            if(L == 0 && R == 0 && C ==0){
                break;
            }

            char[][][] building = new char [L][R][C];
            
            boolean exit = false;
            Queue<Node> que = new LinkedList<>();
            
            for(int i = 0 ; i < L ; i++){
                for(int j = 0 ; j < R ; j++){
                    char[] input = br.readLine().toCharArray();
                    for(int z = 0 ; z < C ; z++){
                        building[i][j][z] = input[z];
                        if(input[z] == 'S'){
                            que.add(new Node(i,j,z, 0));
                            building[i][j][z] = '#';
                        }
                    }
                }
                br.readLine();
            }
            int[][] directions = {{0, 0, 1}, {0, 0, -1}, {0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}};
            while(!que.isEmpty()){
                Node node = que.poll();

                for(int[] dir : directions){
                    int nx = node.x + dir[0];
                    int ny = node.y + dir[1];
                    int nz = node.z + dir[2];

                    if(nx < 0 || ny < 0 || nz < 0 || nx >= L || ny >= R || nz >= C) continue;

                    if(building[nx][ny][nz] == 'E'){
                        result.append("Escaped in " + (node.cnt +1)+ " minute(s).").append("\n");
                        exit = true;
                        que.clear();
                        break;
                    }
                    if(building[nx][ny][nz] == '.'){
                        building[nx][ny][nz] = '#';
                        que.add(new Node(nx, ny, nz, node.cnt + 1));
                    }
                }
            }
            if(!exit) result.append("Trapped!").append("\n");
        }
        System.out.println(result);
    }
}
