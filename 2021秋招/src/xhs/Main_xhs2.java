package xhs;

import java.util.Scanner;

public class Main_xhs2 {
    static int res = 0;

    public static void main(String[] args) {
        Main_xhs2 main = new Main_xhs2();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p_num = 0;
        int[][] seats = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        for (int i=0;i<N;i++){
            String str = sc.next();
            for(int j=0;j<N;j++){
                if(str.charAt(j)=='.') {
                    seats[i][j] = 1;
                    p_num++;
                }
            }
        }
        if(p_num==0){
            System.out.println(res);
            return;
        }
        main.dfs(seats, 0, 0, visited, p_num-1);
        System.out.println(res);
    }
    public void dfs(int[][] seats, int i, int j, boolean[][] visited, int p_num){
        if(i<0 || i>=seats.length || j<0 || j>=seats.length || visited[i][j] || seats[i][j]==0) return;
        if(p_num==0){
            if(i==seats.length-1) res++;
            return;
        }else{
            visited[i][j] = true;
            dfs(seats, i+1, j, visited, p_num-1);
            dfs(seats, i-1, j, visited, p_num-1);
            dfs(seats, i, j+1, visited, p_num-1);
            dfs(seats, i, j-1, visited, p_num-1);
            visited[i][j] = false;
        }

    }
}

