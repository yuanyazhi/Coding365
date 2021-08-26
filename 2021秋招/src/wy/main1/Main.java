package wy.main1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] nums = new int[input.length];
        int m = in.nextInt();
        for(int i=0;i<input.length;i++){
            nums[i] = Integer.valueOf(input[i]);
        }
        int res = 0;
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(nums[i]+nums[j]<=m) res++;
            }
        }
        System.out.println(res);
    }
}
