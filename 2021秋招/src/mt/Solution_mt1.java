package mt;

import java.util.Scanner;

public class Solution_mt1 {
    public static void main(String[] args) {
        Solution_mt1 mt = new Solution_mt1();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] nums = new int[T][];
        boolean[] res = new boolean[T];
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            nums[i] = new int[n];
            for(int j=0;j<n;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<T;i++){
            res[i] = mt.check(nums[i]);
            if(res[i]) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    public boolean check(int[] nums){
        int n = nums.length;
        for (int i=0;i<n;i++){
            if(nums[i]>n || nums[i]<1) return false;
        }
        for (int i=0;i<n;i++){
            int a = Math.abs(nums[i]);
            nums[a-1] = -nums[a-1];
        }
        for (int i=0;i<n;i++){
            if(nums[i]>0) return false;
        }
        return true;
    }
}
