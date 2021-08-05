import java.util.Arrays;

class Solution611 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        // 3条边：a b c
        // 遍历a,b, 二分查找c的范围
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                int left = j+1, right = nums.length-1;
                int a = nums[i], b = nums[j];
                while(left<=right){
                    int mid = (right-left)/2+left;
                    if(nums[mid]>=a+b){
                        right = mid-1;
                    }else{
                        left = mid+1;
                    }
                }
                res = res + right - j;
            }
        }
        return res;
    }
}