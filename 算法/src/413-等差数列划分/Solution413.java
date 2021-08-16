// 给你一个整数数组 nums ，返回数组 nums 中所有为等差数组的 子数组 个数。
// 子数组 是数组中的一个连续序列。

class Solution413 {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<2) return 0;
        int d = nums[0] - nums[1], t = 0;
        int res = 0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]-nums[i]==d){
                t++;
            }else{
                t=0;
            }
            res += t;
        }
        return res;
    }
}