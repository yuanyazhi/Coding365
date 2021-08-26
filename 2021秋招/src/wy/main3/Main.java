package wy.main3;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int n = input.length;
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.valueOf(input[i]);
        }
        int res = 0;
        int[] candy = new int[n];
        Arrays.fill(candy,1);
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                candy[i] = candy[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                candy[i] = Math.max(candy[i],candy[i+1]+1);
            }
        }
        for(int c:candy){
            res += c;
        }
        System.out.println(res);
    }
}
