package tx.tx2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] inputs = new int[N][];
        for(int i=0;i<N;i++){
            inputs[i] = new int[sc.nextInt()];
            for(int j=0;j<inputs[i].length;j++){
                inputs[i][j] = sc.nextInt();
            }
        }

        int[] res = new int[N];
        Main m = new Main();
        for(int i=0;i<N;i++){
            res[i] = m.solution(inputs[i]);
            System.out.println(res[i]);
        }
    }
    public int solution(int[] input){
        int ans = 0;
        Arrays.sort(input);
        for(int i = input.length-1;i>=0;i--){
            ans = (ans + (input[i])%1000000007)%1000000007;
            for(int j=0;j<i;j++){
                input[j] += input[i];
            }
        }
        return ans%1000000007;
    }
}
