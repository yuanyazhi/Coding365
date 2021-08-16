class Solution213 {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(rob2(nums,0,nums.length-1),rob2(nums,1,nums.length));
    }
    // 动态规划：a b c
    public int rob2(int[] nums, int l, int r) {
        int a = 0, b = nums[l];
        for(int i=l+2;i<=r;i++){
            int c = Math.max(b,a+nums[i-1]);
            a = b;
            b = c;
        }
        return b;
    }
}