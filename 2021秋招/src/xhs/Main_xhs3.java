package xhs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_xhs3 {
    public static void main(String[] args) {
        Main_xhs3 main = new Main_xhs3();
        int res = main.solution();
        System.out.println(res);
    }
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][][] time = new int[N][2][2];
        int res = 0;
        for(int i=0;i<N;i++){
            String[] t = sc.next().split("-");
            for(int j=0;j<2;j++){
                time[i][j][0] = Integer.valueOf(t[j].split(":")[0]);
                time[i][j][1] = Integer.valueOf(t[j].split(":")[1]);
            }
        }
        Arrays.sort(time, new Comparator<int[][]>() {
            @Override
            public int compare(int[][] o1, int[][] o2) {
                if(o1[0][0]==o2[0][0]){
                    if(o1[0][1]==o2[0][1]){
                        return 0;
                    }else return o1[0][1]-o2[0][1];
                }else return o1[0][0]-o2[0][0];
            }
        });
        return res;
    }
}
