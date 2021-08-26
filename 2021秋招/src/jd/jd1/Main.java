import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int n = sc.nextInt();
        int[][] inputs = new int[n][2];
        int[] s = new int[n];
        int[] d = new int[n];
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                inputs[i][j] = sc.nextInt();
            }
            s[i] = inputs[i][0]+inputs[i][1];
            d[i] = inputs[i][0]-inputs[i][1];
        }
        Arrays.sort(s);
        Arrays.sort(d);
        int cur = s[0]-1;
        int t = 0;
        for(int i=0;i<n;i++){
            if(cur!=s[i]){
                t = 0;
                cur = s[i];
            }else{
                t++;
                res+=t;
            }
        }
        cur = d[0]-1;
        t = 0;
        for(int i=0;i<n;i++){
            if(cur!=d[i]){
                t = 0;
                cur = d[i];
            }else{
                t++;
                res+=t;
            }
        }
        System.out.println(res);
    }
}