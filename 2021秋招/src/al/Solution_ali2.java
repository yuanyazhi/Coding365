package al;

import java.util.Scanner;

public class Solution_ali2 {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] nt = new int[T][];
        int[][][] mt = new int[T][][];
        int[][][] kt = new int[T][][];
        int[][] pt = new int[T][];
        int[] res = new int[T];
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            nt[i] = new int[n-1];
            for(int j=0;j<n-1;j++){
                nt[i][j] = sc.nextInt();
            }
            mt[i] = new int[m][3];
            for(int j=0;j<m;j++){
                for(int l=0;l<3;l++){
                    mt[i][j][l] =  sc.nextInt();
                }
            }
            for(int j=0;j<k;j++){
                for(int l=0;l<3;l++){
                    kt[i][j][l] =  sc.nextInt();
                }
            }
            for(int j=0;j<p;j++){
                pt[i][j] = sc.nextInt();
            }
        }
        // calculate & output
        Solution_ali2 main = new Solution_ali2();
        for(int i=0;i<T;i++){
            res[i] = main.calculate(nt[i],mt[i],kt[i],pt[i]);
            System.out.println(res[i]);
        }
    }
    public int calculate(int[] nt, int[][] mt, int[][] kt, int[] pt){
        return 0;
    }
}
