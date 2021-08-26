package tx.tx4;

import java.util.*;

public class Main {
//    public String reverse(String str){
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<str.length();i++){
//            sb.append((char)(2))
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String str = sc.next();
        int[] s = new int[26];
        int[][] next = new int[n][26];
        int idx = 0;
        for(char c:str.toCharArray()){
            s[++idx]='z'-c;
        }
        for(int i=0;i<n;i++){
            Arrays.fill(next[i],-1);
        }
        for(int i=n-1;i>0;i--){
            next[i-1][s[i]] = i;
            for(int j=0;j<26;j++){
                if(j!=s[i]) next[i-1][j] = next[i][j];
            }
        }
        int x = 0;
        for(int i=1;i<=k;i++){
            for(int j=0;j<26;j++){
                if(next[x][j]!=-1 && n-next[x][j]>=(k-i)){
                    x = next[x][j];
                    System.out.print((char)('a'+j));
                    break;
                }
            }
        }
    }
}
