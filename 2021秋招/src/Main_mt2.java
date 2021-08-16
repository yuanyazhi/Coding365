import java.util.Arrays;
import java.util.Scanner;

//  a b a d
//a 1 0
//b
//a
//d


public class Main_mt2 {
    public static void main(String[] args) {
        Main_mt2 mt = new Main_mt2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        boolean[][] hw = new boolean[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(hw[i],true);
        }
        System.out.println(str.length()-mt.maxH(str,hw,n));
    }
    public int maxH(String str,boolean[][] hw,int n){
        int maxlen = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                hw[i][j] = str.charAt(i)==str.charAt(j) && hw[i+1][j-1];
                if(hw[i][j] && j==n-1 && j-i+1>maxlen){
                    maxlen = j-i+1;
                }
            }
        }
        return maxlen;
    }
}