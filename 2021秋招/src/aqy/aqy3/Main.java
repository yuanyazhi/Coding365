package aqy.aqy3;

import java.util.*;

public class Main {
    static List<List<String>> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine().split("=")[1]);
        int[] index = new int[n];
        HashSet<Integer> col = new HashSet<>();
        HashSet<Integer> dg1 = new HashSet<>();
        HashSet<Integer> dg2 = new HashSet<>();
        Arrays.fill(index, -1);
        Main m = new Main();
        m.dfs(n, 0, index, col, dg1, dg2);
        System.out.println(res.toString());
    }
    public void dfs(int n, int i, int[] index, HashSet<Integer> col, HashSet<Integer> dg1, HashSet<Integer> dg2){
        if(i==n){
            addRes(n, index);
        }else{
            for(int j=0;j<n;j++){
                if(col.contains(j)) continue;
                if(dg1.contains(i+j)) continue;
                if(dg2.contains(i-j)) continue;
                col.add(j);
                dg1.add(i+j);
                dg2.add(i-j);
                index[i] = j;
                dfs(n, i+1, index, col, dg1, dg2);
                index[i] = -1;
                col.remove(j);
                dg1.remove(i+j);
                dg2.remove(i-j);
            }
        }
    }
    public void addRes(int n, int[] index){
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                if(index[i]==j) sb.append("Q");
                else sb.append(".");
            }
            list.add(sb.toString());
        }
        res.add(list);
    }
}
