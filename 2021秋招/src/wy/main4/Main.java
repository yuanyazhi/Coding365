package wy.main4;

import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算最小航行费用
     * @param input int整型二维数组 二维网格
     * @return int整型
     */
    int res = Integer.MAX_VALUE;
    int cost;
    public int minSailCost (int[][] input) {
        // write code here
        int m = input.length, n = input[0].length;
        if(input[m-1][n-1]==2) return -1;
        cost = input[0][0]-2;
        boolean[][] visited = new boolean[m][n];
        dfs(input,0,0,visited);
        if(res==Integer.MAX_VALUE) return -1;
        res += 2 - input[m-1][n-1];
        return res;
    }
    public void dfs(int[][] input, int i, int j, boolean[][] visited){
        if(i<0 || j<0 || i>=input.length || j>=input[0].length || visited[i][j] || input[i][j]==2) return;
        if(i==input.length-1 && j==input[0].length-1){
            res = Math.min(cost,res);
            return;
        }
        visited[i][j] = true;
        cost += 2-input[i][j];
        dfs(input, i+1, j,visited);
        dfs(input, i, j+1,visited);
        dfs(input, i-1, j,visited);
        dfs(input, i, j-1,visited);
        visited[i][j] = false;
        cost -= 2-input[i][j];
    }

    public static void main(String[] args) {
        Main m = new Main();
        int[][] input = new int[][]{{1,1,1,1,0},{0,1,0,1,0},{1,1,2,1,1},{0,2,0,0,0}};
        System.out.println(m.minSailCost(input));
    }
}
