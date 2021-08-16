class Solution416 {
    // 01背包问题：动态规划
    // res[i][j]: i:第i个数字  j:通过决定是否选择该数字，是否能够得到和j
    // res[j]: j:通过决定是否选择该数字，是否能够得到和j
    public boolean canPartition(int[] nums) {
        if(nums.length<2) return false;
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        if(sum%2!=0) return false;
        int target = sum/2;
        boolean[] res = new boolean[target+1];
        res[0] = true;
        if(nums[0]<=target) res[nums[0]] = true;
        for(int i=1;i<nums.length;i++){
            for(int j=target;j>=0;j--){
                res[j] = res[j];
                if(j<nums[i]) break;
                else res[j] = res[j] || res[j-nums[i]];
            }
        }
        return res[target];
    }
}